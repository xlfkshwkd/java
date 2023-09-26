package exam01;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.random;
import static java.util.Objects.deepEquals;

public class Ex07 {
    public static void main(String[] args) {
          //abs (절대값 음수 -> 양수)
        //round  반올림
        //sign
        //floor 버림
        // random
        double a =random();
        double b =random();
        System.out.println(a);

       System.out.println( deepEquals(a,b));
        String str =null;
        str = Objects.requireNonNullElse(str,"abc");
       System.out.println( str.toUpperCase());





    }
}
