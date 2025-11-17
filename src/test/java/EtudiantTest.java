import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EtudiantTest {
    private Etudiant etudiant;
    private Examens exam1;
    private Examens exam2;
    private Cours cours;
    private Notes note1;
    private Notes note2;

    @BeforeEach
    void setUp() {
        etudiant = new Etudiant(1,"Andria","Rakoto",null,"rakoto@gmail.com",null
        , "K2",null);
        note1 = new Notes(etudiant, 10.0, new ArrayList<>(List.of(
                new HistoriqueNotes(Instant.parse("2025-09-01T08:00:00Z"), 12.0, "mistake"))));

        note2 = new Notes(etudiant, 18.0, new ArrayList<>(List.of(
                new HistoriqueNotes(Instant.parse("2025-09-01T08:00:00Z"), 20.0, "mistake")
        )));

        exam1 = new Examens(
                1,
                "Prog1 midterm",
                null,
                Instant.now(),
                2,
                Collections.singletonList(note1)
        );
        exam2 = new Examens(2,
                "Prog1 ending",
                null,
                Instant.now(),
                3,
                Collections.singletonList(note2));
        cours = new Cours(
                1,
                "PROG1",
                6,
                null,
                List.of(exam1, exam2)
        );
    }
    @Test
    void testGetExamGrade_returnsNewValue() {
        double result = etudiant.getExamGrade(exam1, Instant.parse("2025-09-01T10:00:00Z"));
        assertEquals(12.0, result);
    }

    @Test
    void testGetExamGrade_returnsOldValue() {
        double result = etudiant.getExamGrade(exam1, Instant.parse("2025-08-01T10:00:00Z"));
        assertEquals(10.0, result);
    }

    @Test
    void testGetCourseGrade_returnsNewValue() {
        double result = etudiant.getCourseGrade(cours, Instant.parse("2025-09-01T10:00:00Z"));
        assertEquals(16.8, result, 0.1);
    }

    @Test
    void testGetCourseGrade_returnsOldValue() {
        double result = etudiant.getCourseGrade(cours, Instant.parse("2025-08-01T10:00:00Z"));
        assertEquals(14.8, result, 0.1);
    }

}