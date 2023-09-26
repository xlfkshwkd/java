package Ex03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exam03 {
    public static void main(String[] args) {

        FileInputStream fis =null;
        try{
             fis =new FileInputStream("a.txt");

         //    fis.close();
             System.out.println("자원해제 ");
        }
        /*
        catch (FileNotFoundException e){
            e.printStackTrace();
            try{
                fis.close();
            }catch (IOException e2){}

        }*/
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        finally {
            System.out.println("여긴 어떠한 오류가 지나도 실행 된다 ");
            if (fis !=null){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
            System.out.println("자원 해제 ");
        }

    }
}
