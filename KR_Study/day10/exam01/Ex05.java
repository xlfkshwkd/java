package exam01;

public class Ex05 {
    public static void main(String[] args) {
    Integer i1 =new Integer(10);
    Integer i2 =new Integer(10);
    System.out.println(i1==i2);
    System.out.println(System.identityHashCode(i1));
    System.out.println(System.identityHashCode(i2));


    }
}
