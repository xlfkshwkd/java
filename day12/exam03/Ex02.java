package exam03;

public class Ex02 {
    public static void main(String[] args) {
        int num1 =10;   //연산
        Integer num2 =new Integer(30); //객체

        int num3= num1+num2; //알아서 변환 함 num1+num2.intValue()
        System.out.println(num3);

        Integer num4 =num3; // Integer num4 =Integer.valueOf(num3);
        //30이 담겨 있음
        //private 인트가 담겨있다 AutoBoxing







    }
}
