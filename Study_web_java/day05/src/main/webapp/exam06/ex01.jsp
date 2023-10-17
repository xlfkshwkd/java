<%@ page contentType ="text/html ;charset=UTF-8" %>
<%@ page import="models.members.Member" %>

<%
    pageContext.setAttribute("num1",200);
    Member member =new Member();
    member.setUserId("user01");
    member.setUserPw("123456");
    member.setAttribute("member",member);

%>

${num1+200} <br>
userId : ${member.getUserId()}<br>
userPw : ${member.getUserPw()}<br>

userId : ${member.userId()}<br>
userPw : ${member.userPw()}<br>
