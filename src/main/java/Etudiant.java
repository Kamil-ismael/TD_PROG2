import lombok.Getter;

import java.time.Instant;
import java.util.Comparator;
import java.util.Date;

@Getter
public class Etudiant extends User{
    private String groupe;
    private Tuteurs tuteur;

    public Etudiant(String nom, String prenom, Date dateNaissance, String email, String telephone, String groupe, Tuteurs tuteur) {
        super(nom, prenom, dateNaissance, email, telephone);
        this.groupe = groupe;
        this.tuteur = tuteur;
    }

    public double getExamGrade(Examens exam, Instant t){
        return exam.getNotes()
                .stream()
                .filter(notes -> notes.getEtudiant().equals(this))
                .findFirst()
                .map(notes -> notes.getHistoriquesNotes().stream()
                        .filter(historique -> historique.getDate().isBefore(t))
                        .max(Comparator.comparing(HistoriqueNotes::getDate))
                        .map(HistoriqueNotes::getNouveauValeur)
                        .orElse(notes.getValeurinitial()))
                        .orElse(0.0);
    }

    public double getCourseGrade(Cours cours, Instant t){
        return getWeightedAverage(cours, t) / getSumofExmCoefficients(cours);
    }

    private static int getSumofExmCoefficients(Cours cours){
        return cours.getExams()
                .stream()
                .mapToInt(Examens::getCoefficient)
                .sum();
    }
    private double getWeightedAverage(Cours cours, Instant t){
        return cours.getExams()
                .stream()
                .mapToDouble(exam -> getExamGrade(exam, t) * exam.getCoefficient())
                .sum();
    }

}
