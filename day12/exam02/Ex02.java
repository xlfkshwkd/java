package exam02;

public class Ex02 {
    public static void main(String[] args) {
        String s1="ABC";  //문자열 상수
        String s2="ABC";  //문자열 상수

        System.out.println("s1 : "+System.identityHashCode(s1));
        System.out.println("s2 : "+System.identityHashCode(s2));

        System.out.println("s2 ==s1 : "+(s1==s2));


    }
}
