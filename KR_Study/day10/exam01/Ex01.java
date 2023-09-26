package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Integer li =new Integer( 10);
        //기능 추가를 위하여 랩퍼클래스를 쓴다.
        long num1= (long) li.doubleValue();
        System.out.println(num1);

    }

}
