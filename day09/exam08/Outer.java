package exam08;

public class Outer {
    void method(){
        class Inner{
            void method(){
                System.out.println("내부클래스");

            }
        }
        Inner in =new Inner();
        in.method();
    }
}
