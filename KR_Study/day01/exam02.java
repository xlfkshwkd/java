package exam01;

import java.util.Scanner;

public class exam02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("a를 입력하시오");
        int a = in.nextInt();

        System.out.println("b를 입력하시오");
        int b = in.nextInt();
        System.out.println(" 답은: "+ (a+b) );

    }
}
