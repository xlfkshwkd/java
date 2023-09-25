package exam01;

public class Ex01 {
    public static void main(String[] args) {

        //메인도 접근가능하기때문에 정적자원접근 하려고 static 붙힘

        int result =add(10,20);
        System.out.println(result);

        int result2 =add(20,30);
        System.out.println(result2);
        //데이터 영역 변경 되지 않는 값 상수 메서드 정의 코드
        //데이터 영역(코드& 상수 )
        //코드 ,메서드, 상수,정적 변수, 리터널 변수

        //기능 공유를 위한 클래스
        //math 등..... 패키지

        System.out.println(Math.round(10.4));
        //정적 자원은 처음부터 공간을 할당받고 활성화, O
        //사용하지않아도 자원을 차지 한다 .

        //필요할때만 객체를 한번만 생성하고 공유하는 패턴




    }

    public static int add(int num1 ,int num2) {
        return num1+num2;
    }
}
