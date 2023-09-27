package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stm =num.stream();
        int result =stm.mapToInt(x->x*x).filter(x->x%2==1).sum();
        //              스트림객체 / ....
        System.out.println(num);
        int result2 =stm.mapToInt(x->x*x+x).sum();
        //스트림 1회 호출 여기서 못부름




    }
}
