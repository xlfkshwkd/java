package controllers.member;

import commons.MobileValidator;
import models.member.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class JoinValidator implements Validator, MobileValidator {
    @Autowired
    private MemberDao memberDao;

    @Override
    public boolean supports(Class<?> clazz){
        return clazz.isAssignableFrom(RequestJoin.class);
    }
    @Override
    public void validate(Object target, Errors errors){
        RequestJoin form =(RequestJoin) target;
        //검증 추가 부분 삽입
        /**
         * 아이디 중복 여부 확인
         * 비밀번호 비밀번호 확인 일치 여부
         * 휴대폰 번호 필수 X 하지만 있으면 형식 체크
         */

        String userId =form.getUserId();
        String userPw =form.getUserPw();

        String confirmUserPw =form.getConfirmUserPw();
        String mobile =form.getMobile();
        //아이디 중복 여부 체크
        if(userId != null
                && !userId.isBlank()
                && memberDao.exists(userId)){
            errors.rejectValue("userId","Duplicate");

        }


        // 비밀번호 비밀번호 일치 확인
        if(userPw != null
                && !userPw.isBlank()
                && confirmUserPw !=null
                && !confirmUserPw.isBlank() && !userPw.equals(confirmUserPw) ){
            errors.rejectValue("confirmUserPw","Mismatch");

        }// 모바일  확인
        if(mobile!=null && !mobile.isBlank()  &&!checkmobile(mobile) ){
            errors.rejectValue("mobile","Mobile");

        }


    }

}
