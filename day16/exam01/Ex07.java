package exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Ex07 {
    public static void main(String[] args) {
        Map<String, Object> data =new HashMap<>();

        try(FileOutputStream fos =new FileOutputStream("data.obj");
            ObjectOutputStream oos =new ObjectOutputStream(fos)){

            data.put("book1",new Book("책1","저자1","출판사1 "));
            data.put("book2",new Book("책2","저자2","출판사2 "));
            data.put("str","안녕하셍료");
        }
        catch (IOException e){
            e.printStackTrace();

        }
    }
}
