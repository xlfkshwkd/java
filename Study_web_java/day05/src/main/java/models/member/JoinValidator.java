package models.member;

import commons.BadRequestException;
import commons.LengthValidator;
import commons.RequiredValidator;
import commons.Validator;
import controllers.member.RequestJoin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component("joinValidator2")
@RequiredArgsConstructor
public class JoinValidator implements Validator<RequestJoin>, RequiredValidator, LengthValidator {
    private final MemberDao memberDao;

    @Override
    public void check(RequestJoin member) {
        String userId = member.getUserId();
        String userPw = member.getUserPw();
        String confirmUserPw = member.getConfirmUserPw();

        // 필수 항목 검증 S
        requiredCheck(userId, new BadRequestException("아이디를 입력하세요."));
        requiredCheck(userPw, new BadRequestException("비밀번호를 입력하세요."));
        requiredCheck(confirmUserPw, new BadRequestException("비밀번호를 확인하세요."));
        requiredCheck(member.getUserNm(), new BadRequestException("회원명을 입력하세요."));
        requiredCheck(member.getEmail(), new BadRequestException("이메일을 입력하세요."));

        requiredTrue(member.isAgree(), new BadRequestException("회원가입 약관에 동의하세요."));
        // 필수 항목 검증 E

        // 아이디, 비밀번호 자리수 체크 S
        lengthCheck(userId, 6, new BadRequestException("아이디는 6자리 이상 입력하세요."));
        lengthCheck(userPw, 8, new BadRequestException("비밀번호는 8자리 이상 입력하세요."));
        // 아이디, 비밀번호 자리수 체크 E

        // 비밀번호, 비밀번호 확인 일치여부 체크
        requiredTrue(userPw.equals(confirmUserPw), new BadRequestException("비밀번호가 일치하지 않습니다."));
        
        // 중복 가입 여부 체크
        requiredTrue(!memberDao.exists(userId), new DuplicateMemberException());

    }
}
