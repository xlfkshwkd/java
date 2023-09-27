package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = (a,b)->a+b;
        add(cal);
        add((a,b)->a+b);
        //함수를 식으로 표현 람다식
        System.out.println(cal.add(1,2));
        Calculator cal2=getCalculator();
        int result2 =cal.add(10,20);
    }
    public static void add(Calculator cal){ //calculator cal (a,b) ->a+b
        int result =cal.add(10,20);
        System.out.println(result);
    }
    public static Calculator getCalculator(){
        //Calculator cal =(a,b) -> a+b;
      //  return cal;
        return (a,b)->a+b;
    }
}

