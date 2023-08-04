package exam02;

public class exam02 {
    public static void main(String[] args) {
        Schedule2 s2 =new Schedule2();
        s2.setYear(2023);
        s2.setDay(7);
        s2.setDay(21);

        System.out.println(s2); // s2.toStirng()
        System.out.println(System.identityHashCode(s2));
        System.out.println("-----------");
        s2.printThis();

   //     System.out.println(s2.printThis);


        //this 모든 맴버 변수 인스턴스 메서드 :객체가 생성되어양 접근가능한 매서드 //지역변수로 존재
        // 생성된 각체의 주소값 객체의 자원을 접근하기 위한용도
        //참조 변수
        //
    }
}
