package Ex01;

public class Ex01 {
    public static void main(String[] args) {
        schedule s1 =new schedule(2023,2,50);
        schedule s2 =new schedule(2023,5,60);
/*
        s1.setYear(2023);
        s1.setMonth(2);
        s1.setDay(50);
*/
        //직접 입력 하지 않는다
        //접근 제어자 :
        //접근 범위
        //public
        //protected
        //default
        //private


        //protected  동일 패키지 에서만 접근 가능
        // 상속을 통하면 외부 패키지에서도  클레스 내부에서 접근가능
        //default  접근제어가가 정의  X -> 동일 패키지에서만 접근 가능

        System.out.println(s1.toString());


        System.out.println( s1.getYear());
        System.out.println( s1.getMonth());
        System.out.println( s1.getDay());






    }


}
