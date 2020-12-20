<%@page import="form.MemberData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    	<%
	
	MemberData data = (MemberData)request.getAttribute("memData");
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Membership</h1>
	<table>
		<tr>
			<td>이름</td>
			<td><%= data.getId() %></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%= data.getPw() %></td>
		</tr>
	</table>
</body>
</html>