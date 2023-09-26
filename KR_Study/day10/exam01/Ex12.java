package exam01;

public class Ex12 {
    public static void main(String[] args) {
        Transportation trans =Transportation.Bus;
        /*
        if(trans ==Transportation.Bus){
            System.out.print("버스");
        }*/

        switch (trans){
            case Bus:
                System.out.println("버스");
                break;
            case subway:
                System.out.println("지하철");
                break;
            case taxi:
                System.out.println("택시");
                break;
            case airplane:
                System.out.println("비행기");
                break;

                //int ordinal 상수가 정의된 위치 번호 (0 부터 시작 );
        }

        Transportation s1 =Transportation.taxi;
        System.out.printf(
                "trans.ordinal() : %d   trans.names() : %s",s1.ordinal() ,s1.name()
        );
        // 정적 상수 객체로 저장 되어있다.
        


    }
}
