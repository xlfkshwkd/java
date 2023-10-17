<%@ page contentType="text/html; charset=UTF-8 "%>
<%
    pageContext.setAttribute("num1",100);
    request.setAttribute("num1",200);
    application.setAttribute("num1",300);

%>
num1 : ${num1}

pageScopeScope : ${pageScope.num1}<br>
requestScope : ${requestScope.num1}<br>
applicationScope : ${applicationScope.num1}<br>


//동일한 속성명이 존재할경우  페이지 리퀘스트 세션 어플리케이션

