package exam01;

import java.util.HashSet;

public class Ex04 {
    public static void main(String[] args) {
        HashSet<Book> books=new HashSet<>();
        books.add(new Book("책1","저자1","출판사1"));
        books.add(new Book("책2","저자2","출판사2"));
        books.add(new Book("책2","저자2","출판사2"));
        books.add(new Book("책3","저자3","출판사3"));
        books.add(new Book("책4","저자4","출판사4"));
        books.add(new Book("책5","저자5","출판사5"));

        for(Book book: books){
            System.out.println(book);
        }
        //equals 해시코드 메서드 같아야함 :인스턴스의; 주소값도 ....
        //해시코드  으으으으
        //#인스타 # 맛집 # ㄹㅇㅋㅋ #분위기 #바닷가 #이게머냐


    }
}
