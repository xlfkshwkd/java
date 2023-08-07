package exam07;
    public class Outer{
        int num1 =100;

        static int num2=200;
        static class Inner{
            void method(){
                System.out.println("정적 내부 클래스 ");
                // System.out.println(num1); 안됌
                System.out.println(num2);
            }
        }
    }


