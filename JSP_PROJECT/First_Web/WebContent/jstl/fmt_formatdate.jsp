<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
request.setAttribut("now",new Date());

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${now}
<%-- <br>
<fmt:formatDate value="${now}"/>
<fmt:formatDate value="${now}" type="date"/>
<fmt:formatDate value="${now}" type="date" dateStyle="full"/>
<fmt:formatDate value="${now}" type="date" dateStyle="short"/>
<fmt:formatDate value="${now}" type="both"/>
<fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="fll"/>
패턴  --%>

</body>