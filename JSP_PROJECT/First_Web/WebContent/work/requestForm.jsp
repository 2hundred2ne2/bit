<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Form</title>

<style>
.question {
	font-weight: bold;
}

.sub {
	text-align: center;
}
</style>
</head>
<body>
	<h3>이상형 조사</h3>

	<hr>

	<form action="requestResult.jsp">
		<table>
			<tr>

				<td>나이 :</td><td>만<input type="text" name="age" id="age" style="width: 40px;">세
				</td>

			</tr>
			<tr>

				<td>성별:</td>

				<td><select name ="sex">
						<option value="남성">남성</option>
						<option value="여성">여성</option>
				</select></td>

			</tr>
				<tr>

				<td>이상형 성별:</td>

				<td><select name ="sex2">
						<option value="남성">남성</option>
						<option value="여성">여성</option>
				</select></td>

			</tr>
			
			
			<tr>
				<td>이상형 직업</td>
				<td>
					<input type="checkbox" name="interest" value="배우 ">배우<br>
					<input type="checkbox" name="interest" value="마법사">마법사 <br> 
					<input type="checkbox" name="interest" value="대통령">대통령 <br>
					<input type="checkbox" name="interest" value="디자이너 ">디자이너
			
				</td>
			</tr>
			
			<tr>
				<td>이상형 국적</td>
				<td>
					<input type="checkbox" name="interest2" value="미국">미국<br>
					<input type="checkbox" name="interest2" value="아프리카">아프리카 <br> 
					<input type="checkbox" name="interest2" value="스페인">스페인  <br>
					<input type="checkbox" name="interest2" value="호주">호주<br>
					<input type="checkbox" name="interest2" value="한국">한국<br>
					<input type="checkbox" name="interest2" value="말레이시아">알레이시아<br>
					
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="완료"> <input type="reset"> </td>
			</tr>



		</table>

	</form>
</body>
</html>