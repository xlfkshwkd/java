package exam01;

import java.util.Scanner;

public class exam19 {
    public static void main(String[] args) {

        System.out.println("나이를 입력하시오 ");
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();

        if(age<0){
            System.out.println("유치원생");

        }
        else if(age<7) {
            System.out.println("초등");
        }
        else if(age<13){
                System.out.println("중등");
        }
         else if(age<15){
            System.out.println("청소년");

        }
         else {
            System.out.println("성인");
        }
    }
}
