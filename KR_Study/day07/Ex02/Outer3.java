package Ex02;

public class Outer3 {

   static class Inner{

       void method(int num1){  //파이널붙음
          System.out.print("내부 "+ num1);


       }
       Inner in =new Inner();

   }

    Calculator method(){
       Calculator cal =new Calculator() {
           @Override
           public int add(int a, int b) {
               return a+b;
           }
       };

        return cal;
    }
}
