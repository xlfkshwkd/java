package exam02;

public class Ex05 {
    public static void main(String[] args) {
        String str1="ABC";
        System.out.println(System.identityHashCode(str1));

        str1 +="ABC";
        System.out.println(System.identityHashCode(str1));

        str1 +="GHI";
        System.out.println(System.identityHashCode(str1));

        str1 +="GHI";
        System.out.println(System.identityHashCode(str1));
        //객체가 매번생성되기 때문에 힘듬

        //문자열은 불변 (final)
        //문자열 결합시 기존객체를 버리고 새로운 문자열 객체 생성
        //쌉손해

        //버퍼(buffer) : 임시메모리의 공간
        //버퍼라는 임시 공간을 만들고 문자열을 추가하고 한거번에 변환
         //메모리낭비가 방치,객체를 한번만 생성













        System.out.println((str1));
    }
}
