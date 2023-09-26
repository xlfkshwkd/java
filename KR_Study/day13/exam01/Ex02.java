package exam01;


import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        Map<String, String> menber = new TreeMap<>(Comparator.reverseOrder());
        menber.put("user01","사용자01");
        menber.put("user02","사용자02");
        menber.put("user03","사용자03");
        menber.put("user04","사용자04");
        menber.put("user05","사용자05");



        menber.put("user03","(수정)사용자03");
        menber.remove("user03");

        String name =menber.get("user03");  //키값 넣어서 벨류 값을 가져온다.
        System.out.println(name);
        //stop the server

        String name2 =menber.getOrDefault("user06","없는 사용자");
        System.out.println(name2);




      //  Set<Map.Entry<String,String>> entries =menber.entrySet();
        for (Map.Entry<String ,String> entry: menber.entrySet())
        {
            String key =entry.getKey();
            String value =entry.getValue();
        }
        //list 순차 자료구조
        //Set 집합 자료구조
        //Map 사전 자료 구조

        //collections  java.util 패키지
        // 배열의 편의 기능
        //Arrays
        //Arrays
        //This contains

    }
}
