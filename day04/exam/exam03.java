package exam;
import java.util.Arrays;

public class exam03 {
    public static void main(String[] args) {
        int[][] nums =new int[2][3];
        nums[0][0]=10;
        nums[0][1]=20;
        nums[0][2]=30;

        nums[1][0]=40;
        nums[1][1]=50;
        nums[1][2]=60;

        System.out.println(nums.length);
        System.out.println(nums[0].length);

        for(int i=0;i< nums.length;i++)
        {
            for (int j=0;j<nums[i].length;j++)
            {
                System.out.println("행 : "+i+", 열 : "+j+" __"+nums[i][j] );
            }
        }
        System.out.println(Arrays.toString(nums)); //배열의 위치
        System.out.println(Arrays.deepToString(nums)); //다차원


       // 선언과 동시에 초기화 자료형[][] 배열명 =new 자료형[][]{{,1,2,3,4},{121,2121,212}}
        // 선언과 동시에 초기화 자료형[][] 배열명 ={{,1,2,3,4},{121,2121,212}}
        //jav.util 패키지 편의 기능
        //java.util.Array: 배열의 편의 ;기능

        //같은 패키지 안에서만 클래스의 자원을 공유
        //import 패키지명 ㅇㅋ?






    }
}
