package exam01;

public class ex06 {

    public static void main(String args[]){
        int num1=10;
        char ch1='A';
        int num2=10;
        char ch2='A';

        long num3=1000000000000L;//INT 먼저 넣어서 안됀다고 징징-> LONG으로 던짐 그럴려면 숫자뒤에 L 붙히면 롱부터 인식

        long num5=1_000_000_000_000L;
        System.out.println(num5);
        System.out.println(num3);
  //  -실수 ->double 실수는 항상 더블 먼저
        float num6=2.00F;
        double num7=2.00000000;
        /* 형변환 ?
        형변환시 문제가 없을시 조건 자동 형변환 작은크기의 자료형 -> 큰크기의 자료형
           */
        System.out.println(num6);
        System.out.println(num7);
        byte num4=100;    //int 100 을넣음 ->byte 로 간다!

    }

}
