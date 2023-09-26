package exam03;

import java.util.stream.IntStream;

public class Ex03 {
    public static void main(String[] args) {
        int sum=IntStream.rangeClosed(1,10).map(x -> x*x).filter(x-> x%2==1).sum();

        System.out.println(sum);
        //함수형 표기법 매개변수 반환값 foreach
        //함수는 값으로 사용 . 매개변수 ,반환값

    }
}
