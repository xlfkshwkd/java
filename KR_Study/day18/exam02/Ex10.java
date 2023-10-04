package exam02;

import java.awt.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex10 {
    public static void main(String[] args) {
        ZonedDateTime kor1 =ZonedDateTime.now();

        ZonedDateTime rone = kor1.withZoneSameInstant(ZoneId.of("Europe/Athens"));
        ZonedDateTime rone2 = kor1.withZoneSameInstant(ZoneId.of("America/New_York"));



        System.out.println("ASIA/SEOUL: " + kor1);
        System.out.println("Europe/Athens: " + rone2);
        System.out.println("America/New_York: " + rone);



    }
}
