package exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try(FileInputStream fis =new FileInputStream("foler.zip");
            FileOutputStream fos =new FileOutputStream("copled_foler.zip")){
            while(fis.available() >0){
                fos.write(fis.read());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
