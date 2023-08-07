package exam04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {
    public static void main(String[] args) {
   //     FileInputStream file =new FileInputStream("a.txt");

        try {

            FileInputStream fis = new FileInputStream("a.txt");
            //예외가 발생하지않아도 적절한 처리가 없으면 컴파일 X
            // 예외처리를 하지않아도 컴파일  o
            //유연한 예외

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        }
}
