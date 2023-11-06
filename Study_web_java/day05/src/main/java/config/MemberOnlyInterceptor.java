package config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.member.Member;
import org.springframework.web.servlet.HandlerInterceptor;


public class MemberOnlyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        HttpSession session =request.getSession();
        Member member =(Member) session.getAttribute("member");

        if(member !=null){
            return  true; // 컨트롤러 빈 실행- > 응답
        }
        String url =request.getContextPath()+"/member/login";
        response.sendRedirect(url);

        System.out.println("preHandle!!!");
        return false;
    }

}
