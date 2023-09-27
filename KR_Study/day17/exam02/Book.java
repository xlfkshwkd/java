package exam02;

import java.io.Serializable;

public class Book implements Serializable { //추가 되어있으면 직렬화가  된다 .
private static final long serialVersionUID =100L;
    private String titie;
    private transient String author;
    private  String publiser;
    private int price;
    public void method(){};


    public Book(String titie, String author, String publiser) {
        this.titie = titie;
        this.author = author;
        this.publiser = publiser;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titie='" + titie + '\'' +
                ", author='" + author + '\'' +
                ", publiser='" + publiser + '\'' +
                '}';
    }

}
