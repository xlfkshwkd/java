package exam01;

import java.util.Scanner;

import static java.lang.Math.random;

public class exam10 {
    public static void main(String[] args) {
        int num1=10;
        ++num1;

        System.out.println(num1);

        System.out.println("가위바위보를 할껍니다 가위 바위보중 하나 를 내시오 ");
        Scanner sc =new Scanner(System.in);
        String x =sc.next();

        int k;
        k = (int) random();

        int i = k / 3;
        if(i==0)
        {
            System.out.println("이김 ");
        }
        else if(i==1)
        {
            System.out.println("비김 ");
        }
        else
        {
            System.out.println("짐 ");
        }

    }
}
