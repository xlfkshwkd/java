package exam02;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        String[] strs ={"aa","bb","dd","aa","AAA","ddd","dd"};

        Arrays.stream(strs).distinct(). //반복제거
                filter(s -> s.length()<3). //여기 까지는 연산이 안됌 중간머시기
                forEach(System.out::println); //메서드 참조


      //  System.out.println();

    }
}
