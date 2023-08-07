package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int num3 =30; //지역변수으 ;상수화

        CASIO cal =new CASIO() {
            @Override
            public int add(int num1, int num2) {

                return num1+num2+num3;
            }
        };

        int reult =cal.add(10,20);
        System.out.print(reult);
    }
}
