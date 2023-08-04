package exam02;

public class Book {
    String title;
    String author;
    int isbn ;
    String publisher;

    void showInfo(){
        System.out.println("isbn: " + isbn +", title: "+
                title+" author: " +author+" publisher: "+publisher);
    }

}
