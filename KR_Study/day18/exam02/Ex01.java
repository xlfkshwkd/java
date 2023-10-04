package exam02;

import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.Calendar;
import static java.util.Calendar.*;

public class Ex01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        printDate(cal);

        // LocalTime :시간
        //Instant :EpochTime // 천분의 1초도

        //TemporalAmount
        //TemporalUnit
        //ChronoField

    }

    public static void printDate(Calendar cal) {
        String dateStr = String.format("%d-%d-%d",
                cal.get(YEAR), cal.get(MONTH)+1, cal.get(DAY_OF_MONTH));

        System.out.println(dateStr);

    }
}