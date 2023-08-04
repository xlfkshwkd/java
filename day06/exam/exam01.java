package exam;

public class exam01 {
  /*  public static void main(String[] args) {

        System.out.println(add(1,2));
        System.out.println(add(1,2,5));

    }*/
  public static class student
    {
        int id ;  //변수아님 ㅋ  공간 할당아직 못받음 ㅋ
        String name;
        String subject;

        void showInfo(){
            System.out.println("id "+id+"name "+name +"subject "+subject );

        }

        /*
        public student() {
            //?? return 이없넹  주소 값을 반환하기때문에에에 고정임 ㅋ
            // return 은 못써용
            //생성된 객체으 ㅣ맴버변수를 주로 담ㄷ당
            id =1000;
            name ="sim hyun soo";
            subject="java";

            //객체가 생성된 시점 이후 정의된 코드가 실행
        }

         */
        public student(int _id,String _name,String _subject){
            id=_id;
            name =_name ;
            subject= _subject;

        }



    }

    /*
    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a, int b,int c)
    {
        return a+b+c;
    }
    */

}
