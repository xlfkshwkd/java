import java.util.Scanner;

public class exam09 {
    public static void main(String[] args) {
    int rank =1;

    switch (rank)
    {
        case 1:
            System.out.println("금매달");
            break;
        case 2:
            System.out.println("은메달");
            break;
        case 3:
            System.out.println("동메달");
            break;
        default:
            System.out.println("다운~~~");
    }

        int rank2 ='A';

        switch (rank)
        {
            case 'a':

                System.out.println("금매달");
                break;
            case 'b':
                System.out.println("은메달");
                break;
            case 'c':
                System.out.println("동메달");
                break;
            case 65:
                System.out.println("이걸?");
                break;
            default:
                System.out.println("다운~~~");
        }

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




    }
}
