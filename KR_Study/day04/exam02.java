public class exam02 {
    public static void main(String[] args) {

        student s1 = new student(1,"sim","math");  // 주소값을 반환


        student s2 = s1;
        System.out.println(s1.toString());

        System.out.println(s2.toString());
        // 값을 초기화할때 직접적으로 불러서 함
        // 메서드의 시그니처
        //패지명 클래스명 반환값 타입 함수명 매개변수 예외전가



    }
}
