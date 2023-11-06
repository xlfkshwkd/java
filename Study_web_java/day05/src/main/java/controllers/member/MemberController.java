package controllers.member;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import models.member.JoinService;
import models.member.LoginService;
import models.member.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final JoinValidator joinValidator;
    private final JoinService joinService;
    private final LoginValidator loginValidator;

    private final LoginService loginService;

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin join){

        return "member/join";
    }

  //  @RequestMapping(method = RequestMethod.POST ,path="/member/join")

    @PostMapping("/join")
    public String joinPs(@Valid RequestJoin join, Errors errors){
        System.out.println("데이터 확인 : " +join);
        joinValidator.validate(join,errors); //전역으로 설정해서 없어도 됨

        if(errors.hasErrors()){
            //검증 실패시 유입

            return "member/join";
        }
            joinService.join(join);
            //성공시 회원가입
        return "redirect:/member/join";
    }

    @GetMapping("/login")
    public String login(@ModelAttribute RequestLogin form, @CookieValue(name="saveId" ,required = false)
    String userId ){
        if(userId != null){
          //  form.userId(userId);
            form.setUserId(userId);
            form.setSaveId(true);
        }
        return "member/login";
    }
    @PostMapping("/login")
    public String loginPs(@Valid RequestLogin form, Errors errors , HttpSession session){
        loginValidator.validate(form,errors);

        if(errors.hasErrors())
        {
            return "member/login";
        }
        loginService.login(form);

        return "redirect:/";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/member/login";
    }
    /*
    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setValidator(joinValidator);
    }

     */



    /*
    @PostMapping("/login")
    public String loginPs(){
        System.out.println("유입?");
        return "redirect:/member/login";
    }
    */




    /*
    @GetMapping("/member/login")
    public String login(Model model) {
        model.addAttribute("userId","user99");
        model.addAttribute("userPw","비밀번호");

        return "member/login";
    }

     */

    /*
    @GetMapping("/member/info")
    public String info(Model model)
    {
        Member member =Member.builder()
                .userNo(1L)
                .userId("user01")
                .userPw("123456")
                .userNm("gkgk")
                .email("xlfkshwkd@naver.com")
                .mobile("010-0000-0000")
                .build();

        model.addAttribute("member",member);

        return "member/info";
    }
    */

    @GetMapping("/member/list")
    public String members(Model model){
        List<Member> members = IntStream.rangeClosed(1,10).mapToObj(this::addMember).toList();
        model.addAttribute("members",members);
        return "member/list";
    }

    private Member addMember(long i){
     return Member.builder()
             .userNo(i)
             .userId("user"+ i )
             .userPw("123456")
             .userNm("사용자"+i)
             .email("user"+i+"@test.org")
             .regDt(LocalDateTime.now())
             .build();
    }







}