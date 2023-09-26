package exam01;

public class Ex03 {
    public static void main(String[] args) {
      int num1 =100;
      Integer li =num1;  //Integer.valueOf(num1)오토 박싱
        int num2 =li +num1; //언박싱
        System.out.println(num2);


    }
}
