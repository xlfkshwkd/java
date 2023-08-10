package exam03;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<>();
        //조회속도가 매우 빠르다 순서위치가 변경되는 배열이 생성
        //: 잦은변경 추가 삭제시 불리

        names.add("이름 1");
        names.add("이름 2");
        names.add("이름 3");
        names.add("이름 4");
        names.add("이름 5");
        //객체가 매번 생성되기 때문에 항상 잦은변경 삭제시 불리하다


     //   System.out.println(names);
        for (int i=0;i<names.size();i++){
           names.remove(i);
           //삭제되고 당겨저서 삭제되는 내용물이 바뀜
        }


        for (int i=0;i<names.size();i++){
           String name=names.get(i);
           System.out.println(name);
       }



    }
}
