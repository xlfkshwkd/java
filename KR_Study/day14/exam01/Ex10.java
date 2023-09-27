package exam01;

import java.util.function.*;

public class Ex10 {
    public static void main(String[] args) {
        Consumer<String> func1 = System.out::println;
        //:: 생략 생략
        //메소드  
        func1.accept("가나다");
        UnaryOperator<String> fun1=String::toUpperCase;
        System.out.println(fun1.apply("ABc"));

      //  BiPredicate<String,String> func3 =(s1, s2)-> s1.equals(s2);

        BiPredicate<String,String> func3 =String::equals;
        System.out.println(func3.test("가나다","가나다"));

        BiPredicate<String,String> fun4=(s1,s2) ->s2.equals(s1);
        // 나는 미생물이다.

        //Arrays
        //Stream

        //toArray





    }
}
