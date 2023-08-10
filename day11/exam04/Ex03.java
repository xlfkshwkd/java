package exam04;

public class Ex03 {
    public static void main(String[] args) {
        Book b1 =new Book("책","저자");
        Book b2=b1;

        System.out.println("B1 : "+System.identityHashCode(b1));
        System.out.println("B2 : "+System.identityHashCode(b2));
        System.out.println("B1 ==b2 : "+(b1==b2));
        System.out.println("b1.equals(b2) : "+b1.equals(b2));

    }
}
