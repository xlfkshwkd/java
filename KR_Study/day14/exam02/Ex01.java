package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        Integer[] num1 ={1,2,3,4,5,6,7,8,9};
        List<Integer> num2= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int result =Arrays.stream(num1).mapToInt(x-> x * x ).filter(x->x%2==1).sum();
        int result2 =num2.stream().mapToInt(x->x*x).filter(x->x%2==1).sum();

        System.out.printf("result : %d result2 : %d ",result,result2);
        //Stream
        // of(T ...)




    }
}
