package exam01;

import java.util.function.Supplier;

public class Book {
    private String titile;
    private String author;
    private String publiser;


    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubliser() {
        return publiser;
    }

    public void setPubliser(String publiser) {
        this.publiser = publiser;
    }

    public void print(){
        // Supplier<String> str =() ->toString();
        Supplier<String> str =this::toString;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titile='" + titile + '\'' +
                ", author='" + author + '\'' +
                ", publiser='" + publiser + '\'' +
                '}';
    }



}
