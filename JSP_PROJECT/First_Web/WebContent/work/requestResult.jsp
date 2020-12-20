<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>AiAcademy 이상형 조사 </h3>

	<hr>

	<table>
			<tr>

				<td>나이 :</td>
				<td><%= request.getParameter("age") %> 세
</td>

			</tr>
			<tr>

				<td>성별:</td>

				<td><%= request.getParameter("sex")%></td>

			</tr>
				<tr>

				<td>이상형 성별:</td>

			<td><%= request.getParameter("sex2")%></td>

			</tr>
			
			
			<tr>
				<td>이상형 직업</td>
				<td>
					<%
					
					String[] interests = request.getParameterValues("interest");
				
					for(int i=0; i<interests.length; i++){
						out.println(interests[i]+"<br>");
					}
				
				%>
				</td>
			</tr>
				
			<tr>
				<td>이상형 국적</td>
				<td>
					<%
					
					String[] interests2 = request.getParameterValues("interest2");
				
					for(int i=0; i<interests2.length; i++){
						out.println(interests2[i]+"<br>");
					}
				
				%>
					
				</td>
			</tr>
		
		</table>

</body>
</html>