package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        int[] num2 =nums.stream().mapToInt(x->x*x).filter(x -> x%2==0).toArray();
        System.out.println(Arrays.toString(num2));




    }
}
