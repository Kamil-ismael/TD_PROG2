import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Cours {
    private int id;
    Label label;
    private int credits;
    Enseignants enseignant;

}
