package exam02;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Ex06 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.plusDays(100);
      //  LocalDate date2=date1.plus(100, ChronoUnit.DAYS);
        LocalDate date3=date2.minus(30, ChronoUnit.MONTHS);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);




    }
}
