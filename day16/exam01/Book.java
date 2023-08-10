package exam01;

import java.io.Serializable;

public class Book implements Serializable {

    private static final long serialVersionUID =1;
    private String title;
    private String author;

    private transient String publisher;

    private String notImportant;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }



}
