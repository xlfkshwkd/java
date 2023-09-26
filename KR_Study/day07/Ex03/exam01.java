package Ex03;

import java.util.InputMismatchException;

public class exam01 {
    public static void main(String[] args) {
        try {
            int num1 =10;
            int num2 =20;
            int result =num1 / num2;
            System.out.println(result);
            //new

        }catch (ArithmeticException e)
        {
            e.printStackTrace();
            String message =e.getMessage();
            System.out.println("예외 발생 ...");
        }



        System.out.println("아주 중요한 ㅋ호드 ");
    }
}
