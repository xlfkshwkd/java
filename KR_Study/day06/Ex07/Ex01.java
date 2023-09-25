package Ex07;

public class Ex01 {
    public static void main(String[] args) {
        Outer out =new Outer();
        Outer.Inner in = out.new Inner();  // 객체 생성 과 관련
        //외부클래스 객체가 되어야만

        in.method();
    }
}
