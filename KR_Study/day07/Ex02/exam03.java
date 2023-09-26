package Ex02;


public class exam03 {
    public static void main(String[] args) {
        Outer3 out =new Outer3();
        //미구현된 메서드의 구현체를 정의
        Calculator cal =out.method();
        int result =cal.add(1,2);
        System.out.print(result);
    }

}
