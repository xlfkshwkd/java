package exam01;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        String[] chars ={"A","B","CC","AA","DD","AA","BB"};
        Arrays.stream(chars).distinct()
                .peek(System.out::println)
                .skip(4).forEach(System.out::println);



    }
}
