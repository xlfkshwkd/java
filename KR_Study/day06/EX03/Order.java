package EX03;

public class Order implements Buyer,Seller{


    @Override
    public void buy() {
        System.out.println("구매");
    }
    @Override
    public void order() {
        System.out.println("주문 구매 ");
    }

    @Override
    public void sell() {
        System.out.println("판매");
    }

}
