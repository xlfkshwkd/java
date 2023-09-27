package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
        Stream<Integer> stm =nums.stream();
        IntStream stmt =stm.mapToInt(x ->x*x).filter(x->x%2==1); //중간연산
        // sum연산 최종 연산이 오지않으면 실행되지않는다. 지연된 연산
        //array
        // 내부 this. 반환
        //메서드 체인
        // 연달아서 사용

        int result =stmt.sum();
        System.out.println(result);
        //void 최종 연산 forEach
    }
}
