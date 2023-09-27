package exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UnknownFormatConversionException;

public class Ex05 {
    public static void main(String[] args) {
        try(FileInputStream fis =new FileInputStream("database.zip");
            FileOutputStream fos =new FileOutputStream("database.zip")
        ){
            while(fis.available() >0)
            {
                fos.write(fis.read());
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        long edate =System.currentTimeMillis();
        System.out.printf("걸린시간 %ld",edate);
    }
}
