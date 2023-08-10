package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Integer num1=100;  //오토 빡싱 AutoBoxing Integer.ValueOf(100)
        Integer num2=200;//오토 빡싱 AutoBoxing Integer.ValueOf(200)

        int results =num1+num2; // 언빡싱 num1.intValue() num2.intValue()


        System.out.println(results);


        int num3=100;
        int num4 =200;
        int results2 =num3+num4;

        System.out.print(results2);


    }
}
