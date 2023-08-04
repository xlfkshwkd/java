package exam;

public class exam03 {

    public static void main(String[] args) {
        Book b1=new Book();
        b1.book_name="1001";
        b1.cash=19900;
        b1.voook();

        // 회수 됨 ?

        System.out.println(b1); //16진수 표시
        System.out.println(System.identityHashCode(b1)); //16진수 표시


        Book b2=new Book();
        b2.book_name="2023";
        b2.cash=39900;
        b2.isbn=153;

        b2.voook();
        System.out.println(b2); //16진수 표시
        System.out.println(System.identityHashCode(b2)); //10진수 표시


        Book b3=b2;   // 주소 값 같이 따라가서 b2주소의 값내용이 바뀜
        b3.book_name="1557";
        b3.cash=59900;
        b3.isbn=2013;

        b3.voook();
        System.out.println(b3); //16진수 표시
        System.out.println(System.identityHashCode(b3)); //10진수 표시

        b2.voook();
        System.out.println(b2); //16진수 표시
        System.out.println(System.identityHashCode(b2)); //10진수 표시

        /*
        b1=null;         // Gcc ->가비지 컬랙터 메모리 청소부
        b1.voook();
        System.out.println(b1); //16진수 표시
        System.out.println(System.identityHashCode(b1)); //10진수 표시
*/






        //주소를 참조 - class로 정의; 된 변수는 참조 변수이다 선언이 되어야지만 접근하기때문에
        // 기본 자료형 ,참조자료형
        // 기본자료형
        // 숫자를 담는 자료형
        //정수 시ㅐㄹ수 논리
        //참조 자료형
        // 클래스 형
        //생성된 객체의 주소값을 참조





    }
}