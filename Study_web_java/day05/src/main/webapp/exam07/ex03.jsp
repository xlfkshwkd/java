<%@ page contentType ="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:if test="${num1 > num2}">
	num1이 더 큽니다.
</c:if>

<c:if test="${num1 != 100}">
	num은 100이아니다
</c:if>

<c:if test="true">
	이 문장은 항상 출력됩니다.
</c:if>

<c:choose> 다중 조건문



