public class exam05 {

    public static void main(String[] args) {
        int[][] nums ={{1,2,3},{4,5,6}};
        for(int i=0;i<nums.length;i++)  //행
        {
            for(int j=0;j<nums[i].length;j++)
            {

                    System.out.printf("%d 행 %d열 = %d \n",i,j,nums[i][j]);

            }
        }
        //클레스,를 만들기 위한 설계 명세서


    }
}

