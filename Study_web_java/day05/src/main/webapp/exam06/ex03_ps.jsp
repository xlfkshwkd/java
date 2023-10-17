<%@ page contentType ="text/html; charset=UTF-8" %>

아이디 ${param.userId}<br>
비번 ${param.userPw}<br>
취미 ${param.hobby}<br>

${paramValues.hobby[0]},
${paramValues.hobby[1]},
${paramValues.hobby[2]},
${paramValues.hobby[3]},
${paramValues.hobby[4]}
<br>
Referrer: ${header.Referrer}<br>
User-agent : ${header['User-Agent']}<br>
initParam: ${initParam.key1}<br>
requestURI : ${pageContext.getRequest().getRequestURI()}<br>
requestURI : ${pageContext.request.requestURI}<br>



<br><br>
같은 명칭의 여러 데이터를 조회
속성명 숫자 인덱스 번호 0,1,2
[0],[1]
