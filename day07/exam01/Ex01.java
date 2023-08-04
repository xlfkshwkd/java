package exam01;

public class Ex01 {
    public static void main(String[] args) {

        student s1 =new student();

        System.out.println("s1: " + s1);
        System.out.println("s1  주소 : "+ System.identityHashCode(s1));
        s1.printThis();

        String str =s1.toString();

        System.out.println(str);
        System.out.println(s1.toString());
        System.out.println(s1);

        //정적 메모리 데이터 영역 매모리
        // 스택하고 힙메모리 동적 메모리 임




    }
}
