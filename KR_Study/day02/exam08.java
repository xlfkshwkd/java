import java.util.Scanner;

public class exam08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("나이를 입력해라 ㅋ");

        int age = in.nextInt();
        if(age <7)
        {
            System.out.println("유치원생");
        }
        else if(age <9)
        {
            System.out.println("초등학생");
        }
        else if(age <14)
        {
            System.out.println("중학생");
        }
        else if(age <18)
        {
            System.out.println("고등학생");
        }
        else if(age <25)
        {
            System.out.println("대학생");
        }else
        {
            System.out.println("백수");
        }




    }
}
