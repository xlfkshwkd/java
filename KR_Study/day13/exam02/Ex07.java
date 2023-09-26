package exam02;

import java.util.*;

public class Ex07 {
    public static void main(String[] args) {
        List<String> names =new ArrayList<>();
            Collections.addAll(names,
                    "이름1","이름2","이름3","이름4","이름5");
            System.out.println(names);
            Collections.shuffle(names);
            System.out.println(names);

        Collections.shuffle(names);
        System.out.println(names);

        System.out.println(Collections.max(names));

        System.out.println(Collections.min(names));



    }
}
