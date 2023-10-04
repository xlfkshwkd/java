package exam02;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import static java.time.temporal.ChronoField.*;



public class Ex03 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();

       // int year =date1.get(YEAR);

        int year =date1.getYear();
        int mouth =date1.get(MONTH_OF_YEAR);
        int date =date1.get(DAY_OF_MONTH);

        System.out.printf("%d %d %d",year,mouth,date);






    }
}
