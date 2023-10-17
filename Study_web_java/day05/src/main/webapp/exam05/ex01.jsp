<%@ page contentType ="text/html; charset=UTF-8" %>

<jsp:useBean id ="now"  class ="java.time.LocalDateTime"/>


<%--
<jsp:useBean id ="fruits"  class ="java.util.ArrayList"/>
<%
    fruits.add("사과");
    fruits.add("배");
    System.out.println(fruits);

 %>
--%>

<%-- 매개변수가 있는 기본 생성자가 있어야지만 유즈빈즈를 사용할수 있음
데이터 전달용 편하기 위한 테그 private 맴버변수 개터 세터 있어야함  --%>

