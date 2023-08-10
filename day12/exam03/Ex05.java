package exam03;


public class Ex05 {
    public static void main(String[] args) {

        Integer i1=  Integer.valueOf(10000);
        Integer i2=  Integer.valueOf(10000);

        System.out.println("i1의 주소 : "+System.identityHashCode(i1)+
                " i2의 주소 : "+System.identityHashCode(i2)

        );

    }
}
