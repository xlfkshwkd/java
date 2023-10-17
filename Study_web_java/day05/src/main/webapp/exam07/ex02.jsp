<%@ page contentType ="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:set var="num" value="100" scope="page" />
<c:set var="num" value="200" scope="request" />
<c:set var="num" value="300" scope="application" />

<%-- <c:remove var="num" scope="request"/> //전체 삭제 됨  scope로 범위 정해서 삭제 해야함
--%>
<c:remove var="num" /> //전체 삭제 됨  scope로 범위 정해서 삭제 해야함

<br>
pageScope: ${pageScope.num}<br>
request: ${requestScope.num}<br>
application: ${applicationScope.num}<br>


<%--  <c:if test =${조건식}>
--%>




