package exam03;

public interface Seller {

    void Sell();

    default void order(){
        System.out.println("주문 - seller");
    }
//일부로 정의

}
