package exam03;

public class Ex01 {
    public static void main(String[] args) {
     //   Calculator cal = (a,b) -> a + b;  // 메모리 낭비
     //       calc(cal);
            calc((a,b)->a+b);
    }

    public static void calc(Calculator cal){
        int result =cal.add(10,20);
        System.out.println(result);

    }
}
