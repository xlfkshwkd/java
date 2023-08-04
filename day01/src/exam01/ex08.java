package exam01;

public class ex08 {
    public static void main(String[] args) {
        Byte num1 = 100; //1 바이트
        short num2 = num1;
        int num3 = num2;
        long num4 = num3;
        System.out.println(num4);

        float num5=num4;

        char ch = '가'; //2바이트
        int ch2 = ch;
        long ch3 = ch2;
        System.out.println(ch3);
        /* 묵시적 형변환  모든 실수는 정수를 포함한다 정수 -> 실수
        바이트 쇼트 인트 롱 플롯 더블 캐릭터

        명시적 형변환 강제
        큰자료향에서 작은 자료형으로 변경 변경할 자료형 의사표현으로해야한다 ?


         */



    }
}
