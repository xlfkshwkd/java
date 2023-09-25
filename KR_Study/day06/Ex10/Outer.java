package Ex10;

public class Outer {
    void method(){
        class Inner{
            void method(){
                //지역 내부 클래스
                System.out.print("지역 내부 클래스 ");
            }
        }
        Inner in =new Inner();
        in.method();
    }






}
