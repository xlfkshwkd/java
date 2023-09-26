package exam02;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        int[][] nums2 ={{10,20,30,40},{50,60,70,80}};
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.deepToString(nums2)); //다차원 배열도 출력 가능

    }
}
