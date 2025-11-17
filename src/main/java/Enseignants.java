import lombok.Getter;

import java.util.Date;

@Getter
public class Enseignants extends User{
    Specialite specialite;

    public Enseignants(int id, String nom, String prenom, Date dateNaissance, String email, String telephone, Specialite specialite) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.specialite = specialite;
    }
}
