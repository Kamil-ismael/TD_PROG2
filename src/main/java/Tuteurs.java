import lombok.Getter;

import java.util.Date;

@Getter
public class Tuteurs extends User{
    String descriptionEtudiant;

    public Tuteurs(int id, String nom, String prenom, Date dateNaissance, String email, String telephone, String descriptionEtudiant) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.descriptionEtudiant = descriptionEtudiant;
    }
}
