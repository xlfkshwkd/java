package exam03;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class EX03 {
    public static void main(String[] args) {
        int[] nums ={0,1,2,3,4,5,6,7,8,9,10};
        /*
        IntPredicate pred = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value %2 ==0;
            }
        };
        int[] nums2= Arrays.stream(nums).filter(pred).toArray();
        */

        int[] nums2=Arrays.stream(nums).filter(v -> v%2==0).toArray();
        //단축

        System.out.println(Arrays.toString(nums2));
    }
}
