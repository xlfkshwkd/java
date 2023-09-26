package Ex03;

public class exam02 {
    public static void main(String[] args) {
        //npa
        //NULL 값 넣지 말라고 아오
        try
        {
        int num1 =10;
        int num2 =0;
        int num3 =num1/num2;

        System.out.println(num3);
        String str =null;
        System.out.println(str.toUpperCase());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        System.out.println("중요한 코드 ! ");

    }
}
