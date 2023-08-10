package exam02;

public class Ex01 {
    public static void main(String[] args) {
        String str1=new String("ABC");
        String str2=new String("ABC");


        System.out.println("s1 : "+System.identityHashCode(str1));
        System.out.println("s2 : "+System.identityHashCode(str2));

    }
}
