import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@Getter
@ToString

public class User {
    protected String nom;
    protected String prenom;
    protected Date dateNaissance;
    protected String email;
    protected String telephone;
}
