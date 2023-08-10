package exam01;

public class Ex02 {
    public static void main(String[] args) {
        String str1 =new String("ABC");
        String str2 =new String("ABC");


        System.out.println("str1 : 주소 "+System.identityHashCode(str1));
        System.out.println("str2 : 주소 "+System.identityHashCode(str2));

        //참고 컬랙션 프레임 워크
        //set: 집합 자료구조를 설계한 인터페이스
        //집합 3,4,5,6
        //집합 1,2,3,4

        //합집합 1,2,3,4,5,6
        // -중복이 없는 자료 구조

        System.out.println("str1==str2 : "+(str1==str2));
        System.out.println("str1.equals(str2) : "+str1.equals(str2));//동등성의 비교
        System.out.println("str1.hashCode() : "+str1.hashCode());
        System.out.println("str2.hashCode() : "+str2.hashCode());
        //가변 매개 변수 ...
        //

       // str2=str1;




    }
}
