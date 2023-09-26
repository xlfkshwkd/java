package Ex01;

public class Ex02 {
    public static void main(String[] args) {

        int num3 =30;

        Calculator cal =new Calculator() {
            @Override
            public int add(int a, int b) {
                //지역변수의 상수화
                return a+b+num3;
            }
        }; //실행과정중에 제정의
        int result = cal.add(10,20);
        System.out.print(result);

    }

}
