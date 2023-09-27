package exam01;

import java.awt.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex08 {
    public static void main(String[] args) {
     //   Function<String,String> cal1 =s -> s; //향등함수  들어온값 그대로
        Function<String,String> cal1=Function.identity();
        String str =cal1.apply("A");
        System.out.println(str);

        //and or negate.부정

        //int

    }
}
