package exam03;

public class Ex01 {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.num);
        System.out.println(a.num2);
       // 접근 안됌  a.num3
        a.printNum3();


        System.out.println(a.num4);
    }
}
