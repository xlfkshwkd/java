package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int c =30; //지역 변수의 상수 화
        Calculator cal =(a,b)->{
         //   c=40;
          return   a+b+c;
          //매개변수가 X 반환값이 한개
        };
        int result = cal.add(10,20);
        System.out.println(result);
        //매개변수 1 반환값이 0
        //consurmer <T> : void accept(T t)

        //매개변수가 1개 반환값도 1개
            //funcation
        //매개변수 가 1개 boolean 논리값
        // Predicate<T>
            //: boolean test(T,t);

        //java.util.function
        //매개변수 X 반환값 1
        //supplier <T>
        // : <T> get

        //매개변수 1 반환겂은 boolean
        //Predicate

        //매개변수가 2개이고 반환값이 없음
        //BiConsumer <t , u>
        //:void accpet(T t,U u)

        //매개변수가 2개이고 반환 값이 1
        //byfunction <T,U,R>
            //:R apply(T t,U u)

        //매개변수가 2개 ,반환값이 boolean

        //BiPredicate <T,u>
        //:boolean test(T t,U u)

        //매개변수가 1, 반호ㅘㄴ값이 1 자료형이 모두 동일
        //UnaryOperator<T>
        //T apply(T t)

        //매개변수가 2개 반환값이 1 자료형이 동일
        // BinaryOpertor<T> ---> BiFunction<T,T,T>
        //T apply(T t1,T t2)

        //7. Fruction
        //





















    }
}
