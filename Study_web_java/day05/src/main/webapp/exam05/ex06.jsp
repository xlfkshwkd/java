<%@ page contentType ="text/html; charset=UTF-8" %>
<%@ page import = "models.members.Member" %>

<jsp:useBean id ="member" class ="models.members.Member" scope ="application" />
<%
     Member member1=(Member)pageContext.getAttribute("member");
     Member member2=(Member)request.getAttribute("member");
     Member member3=(Member)application.getAttribute("member");
%>

pageContext : <%=member1%> <br>
request : <%=member2%> <br>
application : <%=member3%> <br>

exception 예외 페이지 에러 페이지
servlet 설정 정보 저장
<h1>하하하하하 </h1>

addCookie 





