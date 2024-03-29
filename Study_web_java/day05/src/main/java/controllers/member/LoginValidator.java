package controllers.member;

import lombok.RequiredArgsConstructor;
import models.member.Member;
import models.member.MemberDao;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class LoginValidator implements Validator {
    private final MemberDao memberDao;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestLogin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RequestLogin form =(RequestLogin) target;
        /**
         * 1.아이디가 존재하는지 채크 
         * 2.존재하면 회원 데이터를 조회 -> 비밀번호 검증
         */
        String userId =form.getUserId();
        String userPw = form.getUserPw();

        Member member =null;
        if(userId != null && userId.isBlank()){
            member =memberDao.get(userId);
            if(member==null){
                errors.reject("NotFound.userId");
            }
        }

        if(member != null && userPw !=null && !userPw.isBlank()){
            boolean matched = BCrypt.checkpw(userPw,member.getUserPw());
            if(!matched){
                errors.reject("Incorrect.userPw");
            }
        }

    }
}
