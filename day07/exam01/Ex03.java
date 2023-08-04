package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Book.isbn=1000;
        System.out.println(Book.isbn);
        // 클래스 변수
        Book.staticMethod();
        // 지역변수가 존재하지않는다 객체생성과 관련없이 사용가능한 메서드
        //객체 (인스턴스) 자원을 사용 X

        //상수 정적 메모-리
        //재료가 되는 수 : 정수 ,실수,문자 ... 리터럴 상수


    }
}
