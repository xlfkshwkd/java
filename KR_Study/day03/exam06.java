
public class exam06 {
    static int AD(int a,int b)
    { return a + b; }
    static int AD(int num1,int num2,int num3)
    { return num1 + num2+ num3; }
    //오버 로딩


    public static void main(String[] args) {

        int a =AD(1,2);

        System.out.println(a);
        //함수는 두번 호출 처음 메인 그다음 AD
        // 임시 메모리 지역 변수
        //스택 영역 메모리
        //(호출 스택 )

        int num1 =10;
        int num2=20;
        int num3=30;
        int result =AD(12,13,14);

        System.out.println(result);

        //힙영역 메모리 객체
        // 호출 스택
        //힙영역 메모리

        //main()
        // student s1 (4)
        // new students
        // 힙이라는 메모리에 변수 선언
        // String name

        // 스택 영역 메모리  -> 힙 영역 메모리
        // 주소값이 당겨 있음
        // 참조 변수 참조 자료형
        //클래스 형태의 자료형 -> 객체가 되어야 사용 가능
        //참조변수 : 생성된 객체의 주소값을 가지고 있는 변수



    }
}
