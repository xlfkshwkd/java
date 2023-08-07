package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Order order = new Order();

        order.Buy();
        order.Sell();

        Buyer buyer=order;
        buyer.Buy();

        Seller seller=order;
        seller.Sell();
    }
}
