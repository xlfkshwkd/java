<%@ page contentType ="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="age" value="15"/>

<c:choose>
    <c:when test="${age<8}">
            유치원!
    </c:when>

    <c:when test="${age<14}">
            초등
    </c:when>

    <c:when test="${age<17}">
            중학!
    </c:when>

    <c:when test="${age<20}">
            고등
    </c:when>

    <c:otherwise>
			어른. <br>
    </c:otherwise>

    step 증감숫자 의미 기본값이 1  1++


</c:choose>
