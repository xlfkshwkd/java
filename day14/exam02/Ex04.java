package exam02;

public class Ex04 {
    public static void main(String[] args) {
        String trans ="Bus";
        //    Transportation trans2=Enum.valueOf(Transportation.class,trans);

        //컴파일러가 자동추가해주는 메서드
        //각 enum 클래스의 정적 메서드
        Transportation tran2 =Transportation.valueOf("SUBWAY");
        System.out.println(tran2 instanceof Transportation);


    }
}
