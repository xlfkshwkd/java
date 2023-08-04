package exam03;

public class Ex01 {
    public static void main(String[] args) {



        Calculator cal =new SimpleCalculator();
        int result = cal.add(10,20);

        System.out.println(result);
        //상위클래스에서 정의되는 추상메서드는 하위클래스가 반드시 구현을해야 사용 가능
        //상위 클래스의 추상 메서드는 하위 클래스의 메서드 설계 원칙
        //설계
        cal.num =20;
        //생성자에 따라 접근이 가능 ......................

    }
}
