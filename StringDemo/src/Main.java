import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        String s = "";

        Instant start = Instant.now();
        for(int i = 0; i <= 2_000_000; i++) {
            s += "x";
        }

        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Dauer = " + duration.toMillis());
    }
}