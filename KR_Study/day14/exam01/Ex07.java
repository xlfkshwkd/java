package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;

public class Ex07 {
    public static void main(String[] args) {
        //  Function
        //f.andThen(g) -> f -> g
        //g.composer(f) -> f -> g
        //메서드
        IntUnaryOperator calc1 = a-> a*a;
        IntUnaryOperator calc2 =a -> a*2;
        IntUnaryOperator calc3 =a -> -a;
        IntUnaryOperator calc4 = calc1.andThen(calc2);
        IntUnaryOperator calc5 =calc4.andThen(calc3);
        System.out.println(calc4.applyAsInt(10));
        System.out.println(calc5.applyAsInt(10));

        /*
        int num  =calc1.applyAsInt(10);
        System.out.println(num);
        int num2=calc2.applyAsInt(10);
        System.out.println(num2);
        */



    }
}
