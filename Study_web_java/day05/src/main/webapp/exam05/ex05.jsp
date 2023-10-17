<%@ page contentType ="text/html; charset=UTF-8" %>
<jsp:useBean id ="member" class ="models.members.Member" scope ="page" />
${member}

    속성을 관리하는 4가지 객체
    PageContext  pageContext   현재 페이지 내에서 속성값 유지 <br>
    HttpServletRequest request  요청 처리 범위 내에서 속성값 유지 <br>
    HttpSession session : 세션에서 세션이 유지되는 동안 속성값이 존재 <br>
    ServletContext application 어플리케이션이 실행되는 동안 유지됨  <br>

   -속성  vod setAttribute(String key,Object value) - 속성 추가 <br>
   -Key 속성을 찾기위한 값 EL 의속성 변수 명 <br>

    Object getAttribute (String key) - 속성조회 <br>
    void removeAttribute sTring key 속성 삭제 <br>

    적용 범위 <br>
    PageContext < request < session < application <br>
    scope -> 생성된 객체 id 변수가 유지될 동안



