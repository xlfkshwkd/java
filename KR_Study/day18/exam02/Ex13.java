package exam02;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

public class Ex13 {
    public static void main(String[] args) {
        LocalDateTime now =LocalDateTime.now();
        LocalDateTime before =now.minusDays(500);
        Duration du = Duration.between(before,now);

        System.out.println(du);
        long sec =du.getSeconds();
        System.out.println(sec);
        //현재시간을 000 으로 맞춤

        LocalDateTime date1 =
                LocalDateTime.of
                        (0,1,1,0,0,0).plusSeconds(sec);
        System.out.println(date1);
        //plus-second
        
    }
}
