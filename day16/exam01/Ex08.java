package exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

public class Ex08 {
    public static void main(String[] args) throws ClassNotFoundException{

        try(FileInputStream fis =new FileInputStream("data.obj");
            ObjectInputStream ois =new ObjectInputStream(fis)){

            Map<String ,Object> data =(Map<String,Object>)ois.readObject();
            String str =(String)data.get("str");
            Book book2=(Book)data.get("book2");

            System.out.println("str :"+ str);
            System.out.println("book2  : " + book2);

        }catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}
