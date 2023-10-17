<%@ page contentType ="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:forTokens var="items" items="Apple,memlon,bananan,mango" delims=",">
    <h1>${items}</h1>
</c:forTokens>




<%--
<c:forEach var="item" items="Apple,melon,banana">
    <h1>${item}</h1>
</c:forEach>

--%>