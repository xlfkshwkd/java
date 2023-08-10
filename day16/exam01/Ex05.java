package exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Ex05 {
    public static void main(String[] args) {
        Book b1=new Book("책 ","저자","출판사");
        Book b2=new Book("책2","저자2","출판사2");
        try(FileOutputStream fos =new FileOutputStream("book.obj"); //실세
            ObjectOutputStream oos =new ObjectOutputStream(fos)){ //보조
            oos.writeObject("안녕하   세요   ");
            oos.writeObject(b1);
            oos.writeObject(b2);
            //객체에 있는 데이터 :입체적 구조의 데이터 ->데이터 형태의 나열된 구조 변경 (직렬화)
            //-저장할 데이터 (객체를 복구하는데 필요한 필수 데이터 )_
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
