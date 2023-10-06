package exam01;

public class Ex01 {
    public static void main(String[] args) {

        int k=1;
        for (int i=2;i<=1000;i++)
        {
            boolean check = true;
            for(int j =2 ; j*j<=i ;j++)  {
                if(i%j==0)
                {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.printf("%d ",i);

                if(i>100*k)
                {
                    System.out.println(" ");
                    k++;
                }
            }
        }

    }
}

