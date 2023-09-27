package exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Ex04 {
    public static void main(String[] args) throws  ClassNotFoundException{
        try(FileInputStream fis =new FileInputStream("book.obj");
            ObjectInputStream ois =new ObjectInputStream(fis)){
            Book book1=(Book)ois.readObject();
            Book book2=(Book)ois.readObject();
            String str = (String)ois.readObject();

            System.out.println(book1);

            System.out.println(book2);

            System.out.println(str);

            //직렬화 배제
            //transient
            //serialVersionUID 이거를 확인해서 함


        }catch (IOException e){

            e.printStackTrace();
        }

    }
}
