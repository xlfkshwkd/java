package exam01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try(FileInputStream fis =new FileInputStream("data1.txt");
            DataInputStream dis =new DataInputStream(fis)){

            int num =dis.readInt();
            boolean result=dis.readBoolean();
            String str =dis.readUTF();

            System.out.println("num = "+num);
            System.out.println("result = "+result);
            System.out.println("str = "+str);

        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
