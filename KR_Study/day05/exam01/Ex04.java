package exam01;

public class Ex04 {
    public static void main(String[] args) {
     /*
        loginservice l1 =new loginservice();
        loginservice l2 =new loginservice();
*/
    //    System.out.println(l1==l2);

       // System.out.println("l1 주소 "+ System.identityHashCode(l1));
       // System.out.println("l2 주소 "+ System.identityHashCode(l2));

        loginservice l1=loginservice.getInstance();
        loginservice l2=loginservice.getInstance();
        System.out.println(l1==l2);
    }
}
