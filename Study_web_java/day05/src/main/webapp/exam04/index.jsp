<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.net.URLEncoder" %>


<jsp:include page="header.jsp">
    <jsp:param name="message"
    value='<%=URLEncoder.encode("안녕하세요.", "UTF-8")%>' />

</jsp:include>

<h1>본문....</h1>

<jsp:include page="footer.jsp" />

<%-- MVC 모델-기능 (Service)   뷰,출력 템플릿 영역 JSP,
컨트롤러 요청과 응답사이의 중재자 : 서블릿  --%>

<%-- DTO 데이터 트랜스 오브젝트 데이터 객체 맴버변수 + 개터 세터
// VOD validator: 유효성 검사  DAO 데이터 엑세스 오브잭트 제이터 접근 객체 --%>


