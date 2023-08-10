package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Transportation trans = Transportation.Bus;
        //상수는 하나의 값만 존재 == 비교 가능
        if(trans ==Transportation.Bus){
            System.out.println("버스!");
        }

    }
}
