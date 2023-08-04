package exam02;

public class exam01 {
    public static void main(String[] args) {

        /*
        int a=200;
         double b = Math.pow(a,a);
         System.out.println(b);
*/
       /*
        Schedule s1 =new Schedule();
        s1.year=2023;
        s1.month=7;
        s1.day=27;
        s1.showInfo();
        //위와 같은 방법은 좋지않다
*/
        Schedule s2 =new Schedule();


        s2.setYear(2023);
        s2.setMonth(2);
        s2.setDay(28);
        s2.showInfo();

        System.out.println(s2);



        //접근 제어자
        // public  동일 패키지 클레스 외부에서 도 가능 접근범위가 가장 넓다
        //protective :동일패키지에서만 클랫 ㅡ내부외부 접근가능 + 상속을 통하여 외부 패키지라도
        //클래스 내부에서 접근이 가능하다 . 밑에 두가지 더한거임 ㅇㅇ

        //default : 접근제어자를 정의 하지않음 동일 패기지에서만 클래스 내부 외부 접근가능
        //private 클래스 내부에서 만 접근가능이요_


        //맴버 변수에 값을 직접 대입하면 값의 통제 불가
        //접근을 막는다



    }

}
