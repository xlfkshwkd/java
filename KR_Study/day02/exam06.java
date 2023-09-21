public class exam06 {
    public static void main(String[] args) {

        int num =100;
       int result =0;

        result= num--;
        System.out.println(result);
        System.out.println(num);

        result =0;
        num =100;
        result =num++;
        System.out.println(result);
        System.out.println(num);

        int a=10,b=10;

         if (a==b)
         {
             System.out.println("동일함 ");
         }
         else {
             System.out.println("동일하겟냐 ? ");
         }

        String str1 = new String("aaa");
        String str2 = new String("aaa");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        int b1 = num >= 10 && num >= 10 ? 100:10;

        System.out.println(b1);
    }
}
