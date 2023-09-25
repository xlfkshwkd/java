package EX03;

public interface Buyer {
    void buy();

   default void order(){
        System.out.println("buyer 주문 ");
    }
    //추상메서드에서도 정의 가능 하지만 default 붙혀줘야함
    public static void staticMethod(){
       System.out.println("정적 메소드 ");
    }
    private void privateMethod(){
       System.out.println("private 메서드 ");
    }

}
