package exam02;

import java.time.Duration;
import java.time.Instant;

public class Ex12 {
    public static void main(String[] args) {
        Instant date1 =Instant.now();
        System.out.println(date1);

        long time =date1.getEpochSecond();
        System.out.println(time);

        long time2 =date1.toEpochMilli(); //System.currentTimeMillis();
        System.out.println(time2);

        //Duration: TemporalAmount

        




    }
}
