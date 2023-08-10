package exam03;

public class Ex04 {
    public static void main(String[] args) {
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);

        System.out.println("i1의 주소 : "+System.identityHashCode(i1)+
                        " i2의 주소 : "+System.identityHashCode(i2)

                );


    }
}
