package exam02;

public class Ex02 {
    public static void main(String[] args) {
       loginService s1=loginService.getInstance();
        loginService s2=loginService.getInstance();

        System.out.println(s1==s2);

    }
}
