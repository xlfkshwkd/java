package exam02;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {
       /*
        Comparator<String> comp =new Comparator<>(){

            @Override
            public int compare(Object o1, Object o2) {
                return o2.compareTo(o1);
            }
        };
*/

        Set<String> names =new TreeSet<>(Comparator.reverseOrder());
        names.add("이름2");
        names.add("이름");
        names.add("이름2"); names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");
        //JDK 14 부터 추가 됨 Record 클래스


        System.out.println(names);
        //중복제거 오름차순 정렬
        //java.lang.Comparable : 정렬의 기본 기준(Natrual Order)

        //현재객체의 숫자 -비교대상 숫자 : 오름차순
        //비교대상객체 현재 객체 내림 차순
        //java.util.Comparator : 대안적 정렬 기준
        //int compare(T,T)


    }
}
