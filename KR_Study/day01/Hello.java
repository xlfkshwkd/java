package exam01;

public class Hello {

    public static void main(String[] args) {

        System.out.println("hello");
    //인텔리 제이
    // 확장자 java ->컴파일 마일명 ->확장자 ->자바 클래스 파일
    //write once everyone ->jbm
    //1bit : 부호 비트 (0 -양수 ,1 - 음수 )

    // 1byte = -2^7 ~ 2^7 -1 (-128 ~ 127)
    // 부호 있는 수를 표현 하는 방법
    //공간의 이름 // 공간의 메모리
    // 변수 공간의 이름 - 반도체 메모리
        //메모리 크기
        //자료형 : 공간의 크기
        //변수 선언하고 값 대입하기
        //int 변수

    int a ;
    byte b =1; //1바이트
        short c = 2; //2byte;
        int d =4; //바이트
        float f =4 ; // 바이트
        long g =8; //바이트
        double j=8 ;//바이트
       // boolean : 1바이트
       // 문자형
        char  a_char ='A' ;// 2~3바이트

     // 참조 자료형 다른자원의 주소 값을 가지고 있는 자료형 ;




        int A_int =5;
        int B_int;
        B_int =A_int;

        System.out.println( "A " +A_int);

        System.out.println( "B " +B_int);

        B_int= 120;

        System.out.println( "A " +A_int);

        System.out.println( "B " +B_int);


        char ch2 ='가';

        System.out.println(ch2 +0);

        System.out.println('가'<'나');


    }


}
