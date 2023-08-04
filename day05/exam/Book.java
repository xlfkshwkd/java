package exam;

public class Book {

    int cash;
    int isbn;
    String book_name;

    public Book(){

        //객체생성이후에 코드가 실행
        //생성된 객체으 ㅣ변수 맴법변수의 초기화 주로 진행

        isbn =1000;
        book_name="신은 죽었다";
        cash=19000;
    }
    void voook()
    {
        System.out.println("cash: " +cash+" book_name: "+book_name);
    }

}


