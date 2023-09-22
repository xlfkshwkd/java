import java.util.Arrays;
import java.util.Formattable;
import java.util.stream.IntStream;

public class exam03 {
    static String str;
    public static void main(String[] args) {

      //  JDK(java Development kit)

       // java.util.package; arrays , collections
        //배열의 편의 기능 컬랙션의 편의 기능


        int[] nums1 =new int[4];
        System.out.println(Arrays.toString(nums1));

        double[] nums2 =new double[4];
        System.out.println(Arrays.toString(nums2));

        boolean[] bools =new boolean[4];
        System.out.println(Arrays.toString(bools));


      //  참조 자료형
      //  -주소값을 담는 변수의 자료형

      System.out.println(str);
      // 스트링 자료형은 null 이 기본 임
        String[] strs =new String[4];
        System.out.println(Arrays.toString(strs));

        //향상된 FOR 문과 배열
        //FOR (각각 요소 :배열 컬랙션 )
        // {
        // }
        //
        //
        //
        int[] nums={10,20,230};
        for (int num :nums){
            System.out.println(num);
        }

        IntStream.range(0, nums.length).forEach(i ->System.out.println(nums[i]));
      //   자료형 [][] 배열명 =new 자료형 [][];

      //   3차원 배열 -> 입체





    }
}
