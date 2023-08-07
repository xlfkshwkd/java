package exam03;

public class Order implements Buyer, Seller { //클래스 에서 메서드를 받음

    @Override
    public void Buy() {System.out.println("구매");}

    @Override
    public void Sell() {
        System.out.println("판매");
    }

    @Override
    public void order() {
      //   Buyer.super.order();
        System.out.println("주문");
    }

}
