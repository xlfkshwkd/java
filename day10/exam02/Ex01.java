package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Outer out =new Outer();
        CASIO cal= out.method(30);
        int result =cal.add(10,20);
        System.out.println(result);
    }
}
