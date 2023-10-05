package exam01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex01 {
    public static void main(String[] args) {
        LocalDateTime now =LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy.MM.HH:mm (E)");
        String strDate =formatter.format(now);
        System.out.println(now);
        System.out.println(strDate);

      //  parse(다형성)


    }
}
