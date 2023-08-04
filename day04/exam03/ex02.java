package exam03;

public class ex02 {
    public static void main(String[] args) {


        System.out.println(calc(2));

        System.out.println(add(3,2));

    }
    static int calc(int z){
        int result = z^z;
        return  result;
    }
    static int add(int num1 ,int num2){ //함수 지역
        int y = num1+num2;
        return  y; //함수 종료
    }
    //함수 호출과 스택 메모리 함수 실행코드 정의 필요한 자원 변수의 메모리
    //함수가 연산을 실행: 함수가 호출되었을때 메모리 공간이 생성
    //함수가 연산을 완료  return 반환값 메모리 공간을 회수
    //임시 메모리
    //스택 영역 메모리
    //스택 후입 선출
    //큐 선입 선출
    //지역 변수? 함수ㅡ에 정의 된 변수-> 스택에서 생성되고 소멸됨 ->함수가 실행될때만 변수공간을 할당
    //함수의 실행코드가 정의된영역 ->지역 변수

    //함수 -실행될 코드 정의



}
