package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Transportation trans =Transportation.SUBWAY;

        switch (trans){
            case Bus :
                System.out.println("버스!");
                break;
            case SUBWAY :
                System.out.println("SUBWAY!");
                break;
            case TAXI :
                System.out.println("TAXI!");
                break;

        }
        // class 클래스면 extends.java.lang.Enum
        //String name() 상수의 문자욜 이름
        //int ordinal() 상수의위치번호부터 시작
        //static valuesOf(...) 문자열 -> Enum 상수로 변환

        //



    }
}
