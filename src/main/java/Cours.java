import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class Cours {
    private int id;
    private String label;
    private int credits;
    private Enseignants enseignant;
    private List<Examens> exams;

}
