package exam04;

public class Ex05 {
    public static void main(String[] args) {
        try {
            String str = "abc";
            String str2 = str.toUpperCase();
            System.out.println(str2);


            int result = 100 / 0; // ArthmethicException
            System.out.println(result);

        }
        /*
        catch (NullPointerException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }*/
        catch (NullPointerException | ArithmeticException e){
            e.printStackTrace();
        }
        System.out.print("실행코드 ");






    }
}
