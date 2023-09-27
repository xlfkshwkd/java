package exam02;

import java.util.Arrays;
import java.util.function.Function;

public class Ex03 {
    public static void main(String[] args) {
        String[] fruits ={"apple","orange","melon","mengo"};
        String[] converted = map(fruits,s->s.replace("a","A")); //map 호출
        System.out.println(Arrays.toString(converted));
        //스트림은 작업을 내부 반복처리한다.


    } //인터페이스 사용자 정의
    // 열린기능
    public static String[] map(String[] items,Function<String,String> func){
        //흠......
       String[] data =new String[items.length];
        for(int i=0;i<items.length;i++){
          data[i] = func.apply(items[i]);  // s 랑 같음
            // 반환값을 넘긴다 map 변환 추상 메서드
             }


        return data;
    }


    /*
    *   스트림은 작업을 내부 반복으로 처리한다.
        내부 반복이라는 것은 반복문을 메서드 내부에 숨길 수 있다는 것을 의미
    *
    * */


}