package exam01;

import java.util.LinkedList;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {

        List<String> names =new LinkedList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        for(int i = 0;i<names.size();i++){
            names.remove(i);
        }

        for (int i =0 ;i<names.size();i++){
            String name =names.get(i);
            System.out.println(name);
        }

        // E pop 끝에 요소를 꺼내기
        //push 끝에 추가
        //E pull 앞요소를 꺼내올때

    }
}
