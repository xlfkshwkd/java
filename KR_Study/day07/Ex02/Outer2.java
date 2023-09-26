package Ex02;

public class Outer2 {
    int num1 =10;
     static int num2 =20;
   static class Inner{
       static int num2=30;
       void method(){
      //     System.out.print("내부 "+ Outer2.num1);\접근 불가
           System.out.print("내부 "+ Outer2.num2);

       }


   }
}
