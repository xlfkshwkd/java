package Ex01;

public class schedule4 {

    //this 는 지역변수 알려주고 사라짐
     // 객체의 주소값으로 결정됨
    public static void main(String[] args) {

      //  schedule s1 =new schedule();
   //     System.out.println(s1);

 //       System.out.println(System.identityHashCode(s1));

        schedule s1 =new schedule(1000,100,2000);
        System.out.println( s1.toString());

    // 정적인 데이터 영역에 이미 만들어저 있음
        //static 변수는 공유가 가능 함  ㅇ유

    }




}
