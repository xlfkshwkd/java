public class exam10 {
    public static void main(String[] args) {

        int n =0;
        while(/* 조건식임 반복되는 거 */ true)
        {
            System.out.println("반복 ");
            n++;
            if(n==10)
            {
                break;
            }
        }

        int num =0,total =0;
        while(num<=100)
        {
            System.out.println("반복 ");
            total +=num;
            num++;
            System.out.println(total);
        }


    }
}
