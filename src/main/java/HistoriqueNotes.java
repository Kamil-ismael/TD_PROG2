import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@AllArgsConstructor
@Getter
public class HistoriqueNotes {
    private Instant date;
    private double nouveauValeur;
    private String motif;
}
