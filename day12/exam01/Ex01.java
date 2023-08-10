package exam01;

public class Ex01 extends Object{
    public static void main(String[] args) {

        Book bk1=new Book("책1","저자1","출판사1");
        Book bk2=new Book("책1","저자1","출판사1");

        System.out.println("b1 : 주소 "+System.identityHashCode(bk1));
        System.out.println("b2 : 주소 "+System.identityHashCode(bk2));

        System.out.println("b2==b1 : "+(bk1==bk2));  //동일성
        System.out.println("b2.equals(b1) : "+bk1.equals(bk2)); //동등성

        System.out.println("bk1.hashCode() : "+bk1.hashCode());
        System.out.println("bk2.hashCode() : "+bk2.hashCode());


        //아아아아아아아아아아아아아아아아
    }
}
