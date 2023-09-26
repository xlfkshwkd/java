package Ex02;

import java.util.function.IntUnaryOperator;

public class exam04 {
    public static void main(String[] args) {
        int num1 =10;
        Calculator cal =new Calculator() {
            @Override
            public int add(int a, int b) {
                return a+b+num1;
            }
        };

        System.out.print(cal.add(1,2));


    }
}
