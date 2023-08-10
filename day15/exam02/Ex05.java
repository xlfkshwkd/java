package exam02;

import java.io.*;

public class Ex05 {
    public static void main(String[] args) {
        long stime =System.currentTimeMillis();
        try( FileInputStream fis = new FileInputStream("foler.zip");
            BufferedInputStream bis = new BufferedInputStream(fis)){

            FileOutputStream fos =new FileOutputStream("copie_foler.zip");
            BufferedOutputStream bos =new BufferedOutputStream(fos);
            while(bis.available()>0)
            {
            //    bos.write(fos.write(fis.read()));
            }
        }
        catch(IOException e)
        {   e.printStackTrace();}

    }
}
