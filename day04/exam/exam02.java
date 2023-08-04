package exam;

public class exam02 {
    public static void main(String[] args) {

        int[] arrry =new int[]{10,20,30,30,40,50,60,70,80};
        int[] nums={10,20,30,40,510,960,85,65};
        System.out.println("공간의 갯수 : "+ nums.length);

      //  배열선언과 초기화를 같이 써야함
        /*
        * int[] num;
        * num =new int[]{10,20,230,40};
        * */
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
        //for 반복은 처음부터 끝가지 형식을 단순화 해야함
        // 각요소 : 배열
        System.out.println("+++++++++");
        for(int
                num:nums)
        {
            System.out.println(num);
        }
        //향상된 for문 배열 컬랙션
        //다차원 배열
        //2차원 배열 [][] 평면
        //3차원 배열 [][][] 높이까지
        // 자료형 [][] 배열명 =new 자료형[행][열];




    }
}