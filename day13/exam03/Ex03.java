package exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Ex03 {
    public static void main(String[] args) {
        LinkedList<String> names =new LinkedList<>();

        names.add("이름 1");
        names.add("이름 2");
        names.add("이름 3");
        names.add("이름 4");
        names.add("이름 5");

        for(String name:names){
            System.out.println(names);

        }


      //순서가 링크 관계로 연결되어있어서 가장앞 값을 삭제해도 큰문제 x
        // Queue
        //offer pull
        //E offer 가장 끝에 추가
        //E poll 가장 앞의 요소를 꺼낼때
        //

        //set 집합 자료구 조 중복이 허용되지않는 자료
        //동등성 비교
        //이콜스 해시코드


    }
}
