package exam02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try(FileOutputStream fos =new FileOutputStream("data2.txt")){
            for (char ch='A';ch<='Z';ch++)
            {
                fos.write(ch);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }//버퍼 쓰면빠르다
}
