package exam01.Ex01;

import exam01.Greet;
import exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Ex01 {
    public static void main(String[] args) {
        //Spring 컨테이너
        //빈은 스프링이 가지고있는 객체를 알려줌
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppCtx.class);

        Greet g1 =ctx.getBean("greet",Greet.class);
        g1.hello("이이름");

        ctx.close();
        // 의존 주입
        // AOP 프록시

        //확장에 열려있음 전략 패턴
        //분기가 나뉜다

        //MVC 웹프레임 워크 제공

        //JDBC,JAP 연동 선언전 트랜잭션 처리등 DB 연동 지원
        //java 추상
        //동일메서드

        //spring data 알아서 객체르 쿼리 변환

        //spring 인증:회원 로그인
        //인가 : 접근 통제

        //객체_의존성
        //스프링 프로젝트 생성하기


        //자동

    }
}
