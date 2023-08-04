package exam02;

public class Ex01 {
    public static void main(String[] args) {

        loginService s1=loginService.getInstance();
        loginService s2=loginService.getInstance();

        System.out.println(s1==s2);
        System.out.println("s1: "+System.identityHashCode(s1));
        System.out.println("s2: "+System.identityHashCode(s2));



        //하나의 객체
        //싱글톤 하나의 객체를 생성하기 위해서 생성자 메서드에 접근제어자를 넣는다
        //ex} private 등등
        //필요할때만 객체를 공유


    }
}
