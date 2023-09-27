package exam01;

import java.util.function.IntPredicate;

public class Ex09 {
    public static void main(String[] args) {
        IntPredicate cond1 =a -> a>10;
        IntPredicate cond2 =a ->a <= 100;
        IntPredicate cond3 =cond1.and(cond2);
        IntPredicate cond4 =cond3.negate();  //부정



        boolean result1 =cond1.test(200);
        boolean result2 =cond3.test(50);
        boolean result3 = cond4.test(200);

        System.out.printf("result1: %s  result2 : %s  result3 : %s " ,
                result1,result2,result3);
        //8 메서드, 참조
        // 람다식을 더욱 간결하게 표현
        // 클래스명 :: 메서드명
        // 참조변수 :: 메소드 명
        //

    }
}
