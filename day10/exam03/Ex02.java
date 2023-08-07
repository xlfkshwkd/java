package exam03;

public class Ex02 {
    public static void main(String[] args) {

        int num3=30;


        CASIO cal =new CASIO() {

            //num3 = 30 ; 상수화 되서 못쓰ㅏㅁ
            @Override
            public int add(int num1, int num2) {
                return num1+num2+num3;
            }
        };

        int result =cal.add(10,20);
        System.out.println(result);

    }
}
