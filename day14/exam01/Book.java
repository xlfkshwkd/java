package exam01;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String titile;
    private String author;
    private String publiser;
    private int price;

    public Book(String titile, String author, String publiser, int price) {
        this.titile = titile;
        this.author = author;
        this.publiser = publiser;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titile='" + titile + '\'' +
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
        return price == book.price && Objects.equals(titile, book.titile) && Objects.equals(author, book.author) && Objects.equals(publiser, book.publiser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titile, author, publiser, price);
    }

    @Override
    public int compareTo(Book o) {
        //오름차순정렬은 this.price
        //내림차순정렬은 o.price -this.price


       // return price - o.price; //오름차순
     //   return  o.price-price; //내림차순

       // return Integer.valueOf(price).compareTo(o.price) ;//오름차순
      //  return Integer.valueOf(o.price).compareTo(price); //내림차순

     //  return Integer.valueOf(price).compareTo(o.price)*-1; //내림차순
    //    return titile.compareTo(o.titile);// 오름차순
       // return o.titile.compareTo(titile);// 내림차순
        return titile.compareTo(o.titile)*-1;// 내림차순
     }


}
