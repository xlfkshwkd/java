package exam04;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String publiser;
    private int price;

    public Book(String title, String author, String publiser, int price) {
        this.title = title;
        this.author = author;
        this.publiser = publiser;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publiser='" + publiser + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publiser, book.publiser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publiser, price);
    }


}
