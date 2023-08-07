package exam04;

public class Ex06 {
    public static void main(String[] args) {
        try {
            String str = "abc";
            String str2 = str.toUpperCase();
            System.out.println(str2);


            int result = 100 / 0; // 어떤예외가 발생할지 모름 ㄹㅇ ㅋ

            System.out.println(result);

        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("여기 호출 ");
            e.printStackTrace();
        }

    }
}
