package exam01;

public class Book {
    static int isbn; //정적 이미 올라갈때부터 할당을 받는다 ㅇㅈ.
    //변하지않는것이 정의
    String title;
    String author;
    String publisher;

    public Book(int isbn,String title, String author, String publisher){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.publisher=publisher;
    }
    @Override
    public String toString() {
        return  "book{" +
                "isbn=' " +isbn+'\'' +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
    public static void staticMethod()
    {
        // this.title="제목";
        // this.author="author";
        System.out.println(isbn);  //정적 자원만 접근 가능하다 도르
        System.out.println("정적 메소드");
    }


}
