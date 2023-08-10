package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Transportation trans =Transportation.Bus;
        String name = trans.name();
        int ordinal =trans.ordinal();
        System.out.println("name: "+name +"ordinal :"+ ordinal );

        //열거형에 추상메서드 추가하기

    }
}
