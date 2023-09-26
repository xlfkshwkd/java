package exam01;

public class Ex06 {
    public static void main(String[] args) {
    Integer i1 = Integer.valueOf(1000);
    Integer i2 =Integer.valueOf(1000);
    System.out.println(i1==i2);
    System.out.println(System.identityHashCode(i1));
    System.out.println(System.identityHashCode(i2));
    //내부 숫자가 커지면 서로 다른곳에 저장이 된다 .

    //클래스 클래스 정보사용
        //클래스 fornames
        
    }
}
