package exam02;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try(FileInputStream fis =new FileInputStream("test01.txt")){
            int ch=fis.read();
            System.out.println(ch);

            ch= fis.read();
            System.out.println((char)ch);

            ch= fis.read();
            System.out.println((char)ch);

            ch= fis.read();
            System.out.println((char)ch);

            ch= fis.read();
            System.out.println((char)ch);


            ch= fis.read();
            System.out.println(ch);



        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
