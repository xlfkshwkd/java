package exam01;

public class Ex03 {
    public static void main(String[] args) {
    //   joinservice s1 =new joinservice();
     //   joinservice s2 =new joinservice();


        joinservice s1=joinservice.getInstance();
        joinservice s2=joinservice.getInstance();
        System.out.println(s1==s2);

    }
}
