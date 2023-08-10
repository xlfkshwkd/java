package exam02;

public class Ex06 {
    public static void main(String[] args) {
        Transportation trans =Transportation.Bus;
        int fare =trans.getFare();
        System.out.println(fare);


        //주석 주해
        //정보전달이 가장중요함
        //-클래스의 일종 (@interface)

        //2. 메타 에너테이션
        //애노테이션을 정의 할수 있는 애노테이션

        //1.표준 에너테이션
        //애노테이션을 정의 하고 있는 애노테이션
        //@target
        //@Retention

        //3.retentionPolicy
        //Soure : 자바에서 존재  클래스파일에는 제거
        //Class 기본값 자바 클래스 파일에도 존재 정보 전달 X
        //runtime 자바 클래스 파일에도 존재 실행중 정보 전달

        //인터페이스 명 extends java lang.annotation.Annotation


    }
}
