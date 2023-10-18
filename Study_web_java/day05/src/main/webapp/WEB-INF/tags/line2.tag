<%@ tag body-content="empty" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ tag import="java.util.Map" %>
<%@ tag dynamic-attributes="attrs" %>
<%
    Map<String, String> attrs = (Map<String, String>)jspContext.getAttribute("attrs");
    int size =Integer.parseInt(Objects.requireNonNullElse(attrs.get(size),"0"));

%>
<div style="color: ${attrs.color};">
<%
    for (int i = 0; i < size; i++) {
        out.print("-");
    }
%>


color: ${attrs.color}, size: ${attrs.size}<br>