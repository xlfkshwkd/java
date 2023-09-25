public class Ex01 {

    public static void main(String[] args) {
        //  X가 주어졌을 때 X를 2부터 X - 1까지의 모든 수로 나누어 보는 것

        for (int i=2;i<=1000;i++) //천번 돌림
        {
            boolean sosoo = true;
           for(int j =2 ; j*j<=i;j++)  // 시간복잡도를 줄이기 위해서 J*J 를사용 전값은 건너 뛰고 계산가능
           {
               if(i%j==0)
               {
                   sosoo = false;  //나눠지면 빠저나와서
                   break;
               }
           }
            if (sosoo) {
                System.out.println(i); //여기서 출력해줌
            }
        }

    }

}
