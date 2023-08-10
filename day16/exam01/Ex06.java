package exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex06 {
    public static void main(String[] args)throws ClassNotFoundException {
        try(FileInputStream fis =new FileInputStream("book.obj");
            ObjectInputStream ois =new ObjectInputStream(fis)){


            String str =(String)ois.readObject(); //순서가 중요
            Book b1 =(Book)ois.readObject();
            Book b2 =(Book)ois.readObject();

            System.out.println(str);
            System.out.println(b1);
            System.out.println(b2);
        }catch (IOException e)
        {
            e.printStackTrace();
        }

        //transient : 맴버변수의



    }
}
