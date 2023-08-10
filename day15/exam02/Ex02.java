package exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        try(FileInputStream fis =new FileInputStream("data1.txt")){
            byte[] buffer =new byte[5];
            int ch;
            while((ch =fis.read(buffer)) !=-1){
               // System.out.println(Arrays.toString(buffer));
                for (byte b :buffer){
                    System.out.print((char) b);
                }
                System.out.println();
            }
        }
        //Filter input Stream의 하위 클래스
        //BufferedOutputStream(OutputStream out) : 다른 스트림에 + 버퍼 가능

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
        //--버퍼 스트림 다른 스트림에 버퍼  기능

}
