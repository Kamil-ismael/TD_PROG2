import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Notes {
    private Etudiant etudiant;
    private double valeurinitial;
    private List<HistoriqueNotes> historiquesNotes;
}
