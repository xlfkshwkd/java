import java.lang.reflect.Constructor;

public class ex01 {
    public static void main(String[] args) {
        //정해지지 않은 클래스 메서드의 기능은 아직
            SimpleCalcultor cal =new SimpleCalcultor();

        int result =cal.add(1,2);
        System.out.println(result);

        int result2 =cal.implement(1,2);
        System.out.println(result2);
        //설계의 틀
        System.out.println(cal.num);

        //완전히 구현된 인스턴스 메서드도 정의 가능  : 하위클래스의 공통 기능

        //공통 적인
        // 공통 적으로 움직이긴 하는데 move 다 다른방식으로 움직일때는 추상클래스
        // abstract
        // 공통 기능 공유

        cal.commonMethod();
        //메서드 재정의 불가 final

        Math.random();


        // 설계 원칙을 정할때 사용  추상 메서드

    }
}


