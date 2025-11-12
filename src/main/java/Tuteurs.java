import lombok.Getter;

import java.util.Date;

@Getter
public class Tuteurs extends User{
    String descriptionEtudiant;

    public Tuteurs(String nom, String prenom, Date dateNaissance, String email, String telephone, String descriptionEtudiant) {
        super(nom, prenom, dateNaissance, email, telephone);
        this.descriptionEtudiant = descriptionEtudiant;
    }
}
