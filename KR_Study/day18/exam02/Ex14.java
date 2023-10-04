package exam02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex14 {
    public static void main(String[] args) {
        LocalDate now =LocalDate.now();
        LocalDate before =now.minusDays(976);
        Period pr = Period.between(before,now);
        int year =pr.getYears();
        int mouth =pr.getMonths();
        int day =pr.getDays();
        System.out.println(pr);

        System.out.println(year);
        System.out.println(mouth);
        System.out.println(day);













    }
}
