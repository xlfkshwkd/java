package exam01;

public class Ex05 {
    public static void main(String[] args) {
        try(MyResoures myResoures =new MyResoures()){

            /*
            if (myResoures instanceof  AutoCloseable){
                myResoures.close();
            }  내부적으로 오토클래스인지 체크
            */




        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
