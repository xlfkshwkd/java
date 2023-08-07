package exam04;

public class Ex03 {
    public static void main(String[] args) {
       try {

           int num1 = 10;
           int num2 = 0;
           int result = num1 / num2;  //throw new ArithmeticException(...);
           System.out.println(result);

       } catch(ArithmeticException e){ // a =new Arith....
           String message =e.getMessage();
           System.out.println(message);


           e.printStackTrace();
       }
        //예외발생은 컴파일 이전에 채크한다
        //예외발생하거나 처리되지않으면 생성이 안됌
        //실행중에 예외 발생여부를 체크
        // 실행이 되려면 컴파일이 되고 class 파일 생성되먀 가능
        //컴파일 진행 o
        //try 예외가 발생할수 있을 코드
        //catch 예외 발생하면 실행할 코드
        System.out.println("매우중요중요 중요 중ㅇ쇼 ㅜㅈ용주ㅡㅇ죠");

       // 에외객체의 주요 메서드 :오류 원인을 확인할수있는 메서드
        //String getmessage
        //void print Stack Trace 처음부터 찾아가면서 추격















    }
}
