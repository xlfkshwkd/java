package exam02;

public interface CASIO { //기본형식이 추상메서드라 선언을 안해줘도 됨

    int NUM =10;  //설계만을 목적으로 하기때문에 못함 \
     //컴파일러가 자동 public static final 흠
     int add(int num1,int num2);  //public abstract 추가ㅣ됨 ㅋ

     default int minus(int num1,int num2){//public
          return num1-num2;
     }
//클래스에서 인터페이스 구현하기
    // implements 인터페이스명

     //모든변수는 정적 상수  public static final






}
