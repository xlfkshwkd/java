package exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {

        Set<Book> books=new TreeSet<>();
        //Set<Book> books =new HashSet<>();
        books.add(new Book("책1","저자1","출판사1",1000));
        books.add(new Book("책2","저자2","출판사2",2000));
        books.add(new Book("책2","저자2","출판사2",2000));
        books.add(new Book("책3","저자3","출판사3",3000));
        books.add(new Book("책4","저자4","출판사4",4000));
        books.add(new Book("책5","저자5","출판사5",5000));

         for(Book book:books){
             System.out.println(book);
         }
         //String . 기본형 래퍼 클래스 (integer,
         // 정부 기본 기준은 오름차순
        //내림차순 반환값은  * -1 => 오름차순


    }
}
