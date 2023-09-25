package EX03;

public interface Seller {
    void sell();

    default void order(){
        System.out.println("seller 주문 ");
    }

    
}
