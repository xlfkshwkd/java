public class exam07 {
    public static void main(String[] args) {

        int num1 =10;

        boolean result = num1++ > 9 || (num1=num1 +10)>30;
        System.out.println(result);

        num1 *=3;

        System.out.println( num1);

        num1 +=2;
        System.out.println( num1);

        num1 -=2;
        System.out.println( num1);

        //

        String str1 = new String("aaa");
        String str2 = new String("aaa");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        if(num1 ==10)
        {
            System.out.println("참");
        }
        else{
            System.out.println("컷 ");
        }








    }
}
