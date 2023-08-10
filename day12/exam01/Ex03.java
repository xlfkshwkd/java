package exam01;

import java.util.HashSet;

public class Ex03 {
    public static void main(String[] args) {
        HashSet<String> names =new HashSet<>();

        names.add(new String("이름1"));
        names.add(new String("이름1"));
        names.add(new String("이름1"));
        names.add(new String("이름2"));
        names.add(new String("이름1"));
        names.add(new String("이름3"));
        names.add(new String("이름1"));
        names.add(new String("이름4"));
        //동등성 비교후 들어감 ㄹㅇ ㅋㅋ
        System.out.println(names);



    }
}
