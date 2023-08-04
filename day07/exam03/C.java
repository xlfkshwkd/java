package exam03;

public class C extends B {
    int numC=30;

    public C(){
        super(); //상위클래스의 기본생성자 메서드 -B()
        System.out.println("C 생성자 ");
    }
    //super 와 this 모든 인스턴스 메서드에 지역변수로써 정의
    //지역변수 : 생성된 객체의 주소값을 가지고있는 참조 변수
    //메서드(super)
    //this  현재 클래스의 생성자메서드
    // c() -> super () : B-> super() : A()
    //C() ->B()->A()

}
