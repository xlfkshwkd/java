package exam03;

public interface Buyer {
    void Buy();

    default void order(){
        System.out.println("주문 - Buyer");
    }

}
