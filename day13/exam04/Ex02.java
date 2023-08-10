package exam04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {
        Set<Book> books =new HashSet<>();
        books.add(new Book("책1,","저자1","출판사 1",1000));
        books.add(new Book("책2,","저자2","출판사 2",2000));
        books.add(new Book("책2,","저자2","출판사 2",2000));
        books.add(new Book("책3,","저자3","출판사 3",3000));
        books.add(new Book("책4,","저자4","출판사 4",4000));
        books.add(new Book("책5,","저자5","출판사 5",5000));

        for (Book book:books){
            System.out.println(books);
        }

    }
}
