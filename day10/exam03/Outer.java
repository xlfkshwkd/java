package exam03;

public class Outer {
    public CASIO method(int num3){

        return new CASIO() {
            @Override
            public int add(int num1, int num2) {
                return num1+num2+num3;
            }
        };

        //CASIO cal  .int num3 =30 유지


   //   return cal;   //CASIO 객체의 주소 값
    };

}
