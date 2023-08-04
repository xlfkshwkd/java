package exam01;

public class exam12 {
    public static void main(String[] args) {

        int num=15;
        //이항 연산 ?
        boolean result1= num>=10;

        boolean result2= num<=100;
        boolean result3= result1 && result2;
        System.out.println(result2);

        System.out.println(result3);
        num=9;
        boolean result4 = num>=10 && num<=100;
        System.out.println(result4);
        //비교 연산자의 우선순위가 논리 연산자보다 우선순위가 높다 도르
        //논리 연산에서 이미 결과가 결정된 경우 연산을 종료;
       // 자바 클레스 예제 15


    }
}
