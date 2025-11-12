import lombok.Getter;

import java.util.Date;

@Getter
public class Enseignants extends User{
    Specialite specialite;

    public Enseignants(String nom, String prenom, Date dateNaissance, String email, String telephone, Specialite specialite) {
        super(nom, prenom, dateNaissance, email, telephone);
        this.specialite = specialite;
    }
}
