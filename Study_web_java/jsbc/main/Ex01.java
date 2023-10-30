package main;


import config.AppCtx;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppCtx.class);

        MemberDao memberDao =ctx.getBean(MemberDao.class);
        Member member =Member.builder()
                .userId("user08")
                        .userPw("123456")
                                .userNm("사용자명08")
                                        .email("user08@naver.com")
                                                .build();
        boolean result =memberDao.register(member);
        System.out.println(result);
        System.out.println(member);

        /*
        boolean result =memberDao.exists("user01");
        System.out.println(result);
        */

        /*
        Member member =memberDao.get("user01");
        System.out.println(member);
        */

         /*
        List<Member> members =memberDao.gets();
        members.stream().forEach(System.out::println);
        */


        ctx.close();

    }
}
