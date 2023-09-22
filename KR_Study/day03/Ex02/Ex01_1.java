package Ex02;

public class Ex01_1 {
    public static void main(String[] args) {

        Ex01_0.Student s1 =new Ex01_0.Student();
        s1.id=1000;
        s1.name="sim";
        s1.subject=" 과학 ";
        s1.study();

        //스택
        Ex01_0.Student s2 =new Ex01_0.Student();
        s2.id=2000;
        s2.name="kim";
        s2.subject=" 수학 ";
        s2.study();

        Ex01_0.Student s3 =s2;
        s3.id=3000;
        s3.name="HA";
        s3.subject=" 미술 ";
        s3.study();

        s2.study();

        //스택

        System.out.println( System.identityHashCode(s1));

        System.out.println( System.identityHashCode(s2));
        System.out.println( System.identityHashCode(s3));
        System.out.println( System.identityHashCode(s2));

        // 인스턴스 실체 실제로 존재한다.
        // -객체
        //    클래스에 정의된 변수 정의 -> 맴버 변수 정의
        //          클래스에 정의된 함수 메서드

        //클래스명은 대문자로 함 관례 단어마다 orderinfo -> Order +info

        //상수 대문자

        //함수 클래스
        // 함수 정의 하기
        //리턴해서 반환값 받기


        //  class AD(int a,int b)
        //{ return a + b }









    }
}
