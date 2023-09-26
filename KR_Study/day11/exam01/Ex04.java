package exam01;

import static exam01.Transportation.*;

public class Ex04 {
    public static void main(String[] args) {
   //     Transportation trans =new Transportation();
        //enum 은 프라이빗
        Transportation trans =Bus;  // 줄여 쓸수있음 상수

      //  Transportation trans =Transportation.Bus;
        System.out.println(trans.getTitle());
        System.out.println(trans.getTotal(10));

    }
}
