
<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	//로그인 상태 확인 : 세션의 객체속성 로그인 이름의 속성이 잇는 지여부 

Member member = (Member) session.getAttribute("loginInfo");

boolean loginCheck = member == null ? false : true;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if (loginCheck) {
	out.println("<h1>로그인 상태입니다.</h1>");
	out.println("<h3>"+member+"</h3>");
	out.println("<h3><a href=\"logout.jsp\">로그아웃</a></h3>");
	
	} else {
		
%>

<script >

alert('로그인이 필요한 페이지 입니다 .');
location.href='loginForm.jsp';

</script>
<%



		
		
	}
	%>

</body>
</html>