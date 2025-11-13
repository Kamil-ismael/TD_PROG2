import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
@AllArgsConstructor
@Getter
public class Examens {
    private int id;
    private String titre;
    private Cours cours;
    private Instant dateExam;
    private int coefficient;
    private List<Notes> notes;
}
