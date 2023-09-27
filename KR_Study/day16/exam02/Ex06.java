package exam02;

import java.io.*;
import java.util.stream.Stream;

public class Ex06 {
    public static void main(String[] args) {
        try(FileInputStream fis =new FileInputStream("database.zip");
            BufferedInputStream bis =new BufferedInputStream(fis);
            FileOutputStream fos =new FileOutputStream("database2.zip");
            BufferedOutputStream bos =new BufferedOutputStream(fos)) {
            while (bis.available() > 0)
                bos.write(bis.read());
        }   catch (IOException e)
        {
            e.printStackTrace();
                //추가 기능 - 버퍼 제공
                //


        }
    }
}

