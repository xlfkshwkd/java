package exam02;

public class Ex03 {
    public static void main(String[] args) {
        A a =new A(){
           public void method(){
               System.out.print("출력 ");
           }
        };
        a.method();  //지역내부에서 객체 생성
    }
}
