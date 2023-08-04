package exam01;


public class Ex02 {
    public static void main(String[] args) {

        Book s1=new Book(1000,"book1","저자","출판사");
        System.out.println("s1: "+s1);

        Book s2=new Book(1001,"book2","저자2","출판사2");
        System.out.println("s2: "+s2);
        System.out.println("s1: "+s1);


        //객체 생성과 관계없이 처음부터 사용가능한 변수
        //클래스명 바로접근




        s1.toString();
    }
}
