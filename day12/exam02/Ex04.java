package exam02;

public class Ex04 {
    public static void main(String[] args) {

        boolean results= isSame("ABC","ABC");
        System.out.println(results);

        boolean result2= isSame("ABC",new String("ABC"));
        System.out.println(result2);
    }
    public static boolean isSame(String str1,String str2){
        return str2.equals(str1);
    }
}
