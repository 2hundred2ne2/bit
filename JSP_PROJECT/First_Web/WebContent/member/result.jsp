<%@page import="form.MemberData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 자바 코드 짜는 부분 -->
<%

// beans 객체 생성
MemberData memberData = new MemberData();

//  받은 데이터 넣기
String userId = request.getParameter("id");
int pw = Integer.parseInt(request.getParameter("pw"));

// beans에 저장
memberData.setId(id);
memberData.setPw(pw);

// 객체 전달하기
request.setAttribute("memData", memberData);

%>

<jsp:forward page="regfrom.jsp"/>