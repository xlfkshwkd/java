package exam01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) {
        try(FileInputStream fis =new FileInputStream("data.dat");
            DataInputStream dis =new DataInputStream(fis)){


            int num =dis.readInt();
            boolean result =dis.readBoolean();
            String str =dis.readUTF();
            System.out.printf("num = %d ,result=%s, str=%d%n",num,result,str);



        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
