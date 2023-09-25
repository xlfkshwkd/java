package EX03;

public class Ex01 {
    public static void main(String[] args) {
        Order od =new Order();
        od.buy();
        od.sell();

        Seller seller = od;
        seller.sell();
        System.out.println(seller instanceof Order);


        Buyer Buyer = od;
        Buyer.buy();
        System.out.println(Buyer instanceof Order);

        //참고
        //클래스간 상속 , //단일 상속만 가능


       // buy()
        // sell()
    }
}
