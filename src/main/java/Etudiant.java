import lombok.Getter;

import java.util.Date;

@Getter
public class Etudiant extends User{
    String groupe;

    public Etudiant(String nom, String prenom, Date dateNaissance, String email, String telephone, String groupe) {
        super(nom, prenom, dateNaissance, email, telephone);
        this.groupe = groupe;
    }

}
