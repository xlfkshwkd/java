package exam01;

import java.util.*;

public class Ex05 {
    public static void main(String[] args) {
      //  Map<String,String> members =new HashMap<>();
       Map<String,String>members =new TreeMap<>(Comparator.reverseOrder());

        members.put("user01","사용자01");
        members.put("user02","사용자02");
        members.put("user03","사용자03");

    //    Set<Map.Entry<String,String>>entrySet=members.entrySet(); 줄여
        for(Map.Entry<String ,String>entry : members.entrySet()){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println("Key="+key+" value="+value);

        }


        //열거형
        //용도가 정해진 클래스 상수만을 정의하기위한용도
        //enum{ 상수 . 상수2, 상수 3}
        //calender class















    }
}
