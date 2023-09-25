package Ex09;

import javax.swing.text.Style;

public class Outer {
    int num1=10;
    static int num2 =20;
    static class Inner{
        void method(){
            System.out.println("내부 ");

      //      System.out.println(Outer.this.num1);
            System.out.println(num2);

            Outer out =new Outer();
            System.out.println(out.num1);

        }
    }
}
