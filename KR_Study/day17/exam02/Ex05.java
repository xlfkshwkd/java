package exam02;

import java.io.*;

public class Ex05 {
    public static void main(String[] args) throws  ClassNotFoundException{
        try(FileOutputStream fis =new FileOutputStream("book.obj");
            ObjectOutputStream ois =new ObjectOutputStream(fis)){




        }catch (IOException e){

            e.printStackTrace();
        }

    }
}
