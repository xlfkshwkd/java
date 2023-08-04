package exam01;

public class Ex04 {
    public static void main(String[] args) {
        C c=new C();
        System.out.println(c instanceof C);

        B b=new C();
        System.out.println(b instanceof C);
        System.out.println(b instanceof B);

        A a=new C();
        System.out.println(a instanceof C);
        System.out.println(a instanceof B);
        System.out.println(a instanceof A);

        //상위 클래스 사람 강아지 호랑이
        //동물





    }
}
