package exam01;

public class exam14 {
    public static void main(String[] args) {
        int num=10;
      //  boolean result = num>5 ?;
        String str = num>5  ? "5보다크다" :"5보다작다";
                System.out.println(str);

                //not !=
        boolean k= true;
        boolean k2= !k;
        System.out.println(k2);

        boolean k3= !k2;
        System.out.println(k3);

        //연산자 우선순위
        // 대입연산자 () < 논리 연산자 < 0비교연산자 <단항 연산자
        /*
            대입연산자
            부호 연산자
            산술 연산자
            연산자 우선순위 강제적용 ()
            증감 연산자 -- ++
            대입(1),연산
            관계연산자  == 같다  != 다르냐
            논리 연산자 and && or || not ! 참은 거짓 거짓은 참
            우선순위
            비교연산> 논리

            복합 대입 연산자
            num=num +2;

            삼항 조건 연산자
            조건식 ? 참일때 :거짓일때
            숫자에서 플러스 연산자는 수치를 더하기
            1항
            문자열 문자열 * 연산자 :문자를 결합
            문자열 +문자열
            문자열 + 숫자



















        */


    }
}
