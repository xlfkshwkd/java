package exam;

public class exam01 {
    public static void main(String[] args) {

        int result =add(1,2);
        System.out.println(result);
    }
    //main 메서드 -? jvm 애플리케이션을 실행하기위한 메서드
    // 모든프로그램의 시작 함수

    static int add(int num1 ,int num2)//함수 지역
    {
        int result =num1 +num2; //지역변수
        return result;//함수 종료

        //함수가 실행될때만 할당박고 사라지는것
        //임시 메모리
        //함수이름 = 변수명과 규칙이 같다...

        //메서드 및 맴버변수
        // 클래스와 인스턴스

        //객체 전용 메모리





        //메서드 및 맴버 변수

    }

    //스택 메모리  함수에 정의 된 변수 스텍에서 메모리를 할당
    //연산이 끝나면 메모리 회수
    // 스택영역 메모리
    //참고 스택 큐

    // 스택 영역 메모리 (호출스택)








}
