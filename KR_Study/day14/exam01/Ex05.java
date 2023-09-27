package exam01;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex05 {
    public static void main(String[] args) {
        DoubleBinaryOperator cal = (a, b)->a+b;
        double result =cal.applyAsDouble(10.2,20.0);
        System.out.println(result);
        
    }
}
