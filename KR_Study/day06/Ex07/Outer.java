package Ex07;

public class Outer {
    int num1 =30;
    int num2 =20;
    public class Inner{
        int num1=10;
        static  int num;

        void method(){
            System.out.println(Outer.this.num1 + num2); // inner  클레스의 참조 값
            //아우터값 가져오기  num 중복인데 아우터꺼 가져오기
            System.out.println(" 내부 ");

        }

        //정적 변수와 정적 메서드는 정의가 안되어야하는데 됨

        static void staticMethod(){
            System.out.println("정적 메서드  ");
        }
    }


}
