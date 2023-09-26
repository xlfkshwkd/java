package exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        books.add(new Book("책1", "저자1", "출판사1"));
        books.add(new Book("책2", "저자2", "출판사2"));
        books.add(new Book("책2", "저자2", "출판사2"));
        books.add(new Book("책3", "저자3", "출판사3"));
        books.add(new Book("책4", "저자4", "출판사4"));
        books.add(new Book("책5", "저자5", "출판사5"));

        Iterator<Book> iter = books.iterator();
        while(iter.hasNext()) {
            Book book = iter.next();
            System.out.println(book);
        }

        iter = books.iterator();
        while(iter.hasNext()) {
            Book book = iter.next();
            System.out.println(book);
        }

        /*
        for (Book books : books) {
            System.out.println(book);
        }
         */
    }
}