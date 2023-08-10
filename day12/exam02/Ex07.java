package exam02;

public class Ex07 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();

        String sb =str.append("ABC")
                .append("DEF")
                .append("EFGHI")
                .toString();

            //.메서드 체인
        System.out.println(sb + ", 주소 : "+System.identityHashCode(sb));


        // Wrapper 클래스
        //class Integer {
        //
        // ...
        //
        // }
        //private int value

        // 기본 자료형은 값


        //기본 자료형에서 + 기능을 사용해야하는 경우
        // +객체가 가능




        //byte
        //short
        //int    integer
        //long

        //float
        //double

        //char    character
        //boolean



    }
}
