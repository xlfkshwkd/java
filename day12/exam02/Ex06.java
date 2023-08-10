package exam02;

public class Ex06 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();

        System.out.println("str :  주소 " +System.identityHashCode(str));
        StringBuffer str2=str.append("ABC");
        System.out.println("str2 :  주소 " +System.identityHashCode(str2));


        StringBuffer str3 =str2.append("DEF");
        System.out.println("str3 :  주소 " +System.identityHashCode(str3));


        StringBuffer str4 =str3.append("EFGHI");
        System.out.println("str4 :  주소 " +System.identityHashCode(str4));


        String sb =str4.toString();
        System.out.println(sb + ", 주소 : "+System.identityHashCode(sb));

        // append ekekeke



    }
}
