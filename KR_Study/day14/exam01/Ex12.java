package exam01;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex12 {
    public static void main(String[] args) {
        Book book =new Book();
        book.setTitile("책1");
        book.setAuthor("작가1");
        book.setPubliser("출판사1");

        Function<Book,String> func1 =Book::getTitile;
        System.out.println(func1.apply(book));

    //    Supplier<Book> fun2 =() -> Book::new;
        //stream 데이터 소스가 무엇이든간에 같은 방식으로 다룰수 있게
        //데이터를 추상화 하고 데이터를 다루는데 자주 사용되는 메서드들을 정의 해 놓음






    }
}
