package exam01;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
       int result1= add(10,20,30,40);
        System.out.println(result1);

        int result2= add(10,20);
        System.out.println(result2);

        //String str ="abc"
        //String stt =new String("ABC")


    }
    public static int add(int... nums){
        System.out.println(Arrays.toString(nums));
        int total=0;
        for (int num :nums){
            total += num;
        }

        return 0;
    }
}
