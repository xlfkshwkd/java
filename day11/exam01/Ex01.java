package exam01;

public class Ex01 {
    public static void main(String[] args) {

        try
        {
            String str ="ABC";
            str.toUpperCase();   // throw 해버려
            System.out.println(str);

            int result =100/0;

            System.out.println(result);
        }
        catch (NullPointerException | ArithmeticException e){
            e.printStackTrace();
            System.out.println("예외 1");
        }

        /*
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("예외 2");
        }
        */


        System.out.println("필수 코드, ");



    }
}
