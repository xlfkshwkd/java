package exam02;

public class Outer {

    public CASIO cal= new CASIO(){
        public int add(int num1,int num2){
            return num1+num2;
        }
    };

    //상황 지역 내부에서 객체 생성
    //맵버변수 객체 생성



    public CASIO method(int num3){
        return new CASIO(){ //힙에 있음  반환값밖에 쓰지않는다 그래서 리턴으로 ..
            public int add(int num1,int num2){
             //   num3=40;  //값을 유지하기위해서 스택이 아니라 상수화를 통해서 데이터 영역공
                //간을 할당 final in outer

                return num1+num2+num3;
            }
        };

      //  return cal; 없어저도됨 반환값으로 주소값이반환 그래서 변수할당을 하지않아도됨


    }
}
