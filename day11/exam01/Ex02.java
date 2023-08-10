package exam01;

public class Ex02 {
    public static void main(String[] args) {
        try
        {
            String str ="ABC";
            str.toUpperCase();   // throw 해버려
            System.out.println(str);

            int result =100/0;

            System.out.println(result);
        }
        catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("예외 1");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("모르는 예외발생 ");
        }


    }
}
