package exam03;

public class Ex01 {
    public static void main(String[] args) {

        ImplCacluator cal1 = new ImplCacluator();
        long result1 = cal1.factorial(10);  //핵심 기능
        System.out.println("cal1 : " + result1);
        long stime =System.nanoTime();      //추가기능

        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10);
        System.out.println("cal2 : " + result2);
        long etime =System.nanoTime();      //추가기능

        System.out.println(stime- etime);
        






    }
}