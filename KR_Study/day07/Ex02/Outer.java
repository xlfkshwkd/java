package Ex02;

public class Outer {
    int num1 =20;
    class Inner {
        int num1 =20;
        void method() {
            System.out.println("인스턴스 내부클래스 "+ num1);
            System.out.println("인스턴스 내부클래스 "+ Outer.this.num1);
        }

        static void staticMethod(){
            System.out.println("정적 메서드 ");
        }


    }
}
