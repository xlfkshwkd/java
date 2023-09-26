package exam02;

import java.util.*;

public class Ex08 {
    public static void main(String[] args) {
         List<Integer> nums =
                 new ArrayList<>(new Random().ints(10).boxed().toList());
         System.out.println(nums);

         Collections.sort(nums, Comparator.reverseOrder());
         System.out.println(nums);
         //함수를 값으로 사용
        // 매개변수
        //함수

        //자바스크립트 함수 -> 객체임
        // 인터페이스 추상메서드 람다식
        //메서드를 식으로


    }
}
