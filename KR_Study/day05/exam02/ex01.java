package exam02;

public class ex01
{
    public static void main(String[] args) {
        C c= new C();   // C -> A,B 자동 형변환 (다형성 )
        A a =c;
        B b =c;

        System.out.println(c.num1);
        System.out.println(a.num1); //a범위만 쓰지만 C 객체의 a 인거임
        System.out.println(b.num2); //한정하게 만듬  다형성



    //super this와비슷 하지만 상위클래스 모든 메서드에 존재
        //객체의 주소값이 있는 지역변수




    }
}
