package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Ex06 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sim","ha","Kim");
        names.replaceAll(String::toUpperCase);
        System.out.println(names);
    }
}
