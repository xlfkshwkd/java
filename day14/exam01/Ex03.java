package exam01;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex03 {
    public static void main(String[] args) {
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);

            }
        };
        //기준3가지
        //자동 자원해체 java.lang.AutoCloseable (try - with resources)
        //중복 판단의 기준
        //정렬의 기본 기준 (natural ordering)/ java.lang.Comperable/int compareTo
        //참고 대안적인 정렬 기준

        //java.util.Comperator
        //편의 메서드







     //   Set<String> names=new TreeSet<>(comp);
        Set<String> names=new TreeSet<>(Comparator.reverseOrder());
        //정렬기능 + hashset
        //java.lang.Comparable 안에 있음 TreeSet 함부로 못씀
        names.add("이름3");
        names.add("이름2");
        names.add("이름1");
        names.add("이름1");
        names.add("이름4");
        names.add("이름5");


        System.out.println(names);
    }
}
