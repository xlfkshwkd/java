package exam02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex15 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yy,MM,dd a HH:mm (H)");
        String datestr =formatter.format(now);
        System.out.println(datestr);
    }
}
