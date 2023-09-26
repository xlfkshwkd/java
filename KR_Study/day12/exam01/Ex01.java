package exam01;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ex01 {
    public static void main(String[] args) {
       // list 인터페이스
        // 순차 자료구조  매우 중요
        //순서가 있는 자료 구조
        // 추가  ADD(index, E e) addAll(Collection)
        //수정
        //삭제
        // Collection <E> Arraylist Linkedlist
        //공간의 크기가 변경되거나 순서가 변경되는 추가 , 수정 ,삭제 ->매번 새로운 배열이 생성

        //Set 집합 자료 구조
        //중복을 허용하지 않는다.
        //순서를 고려하지않는 자료구조

        // 리스트와 셋 컬랙션 프레임 워크



        //Map 사전 자료구조
        //키값 순서쌍 구조
        //중복  X
        // 인터페이스
        // list

        ArrayList<String> names =new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");
        LinkedList<String> names2= new LinkedList<>(names);

        for(int i = 0;i<names.size();i++){
            names.remove(i);
        }

        for (int i =0 ;i<names.size();i++){
            String name =names.get(i);
            System.out.println(names);
        }
        //배열 삭제 하면서 밀림
        //순서의 재구성

        //set 집합 자료 구조
        //중복을 허용 하지 않는다
        // 순서를 고려 하지 않는 자료 구조
        //추가 삭제 조회
        // contains containsAll (Collection<E>)
        //remove all
        //Size ():요소 개수
        //boolean isEmpty();

    }
}
