<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 

//데이터를 받고
String userId =request.getParameter("userid");
String userPw =request.getParameter("userpw");
String userName =request.getParameter("username");
/* String userPhoto =request.getParameter("userPhoto"); */



//beans 생성
Member member =new Member();
//beans에 데이터 바인딩

member.setUserId(userId);
member.setPw(pw);
member.setUserId(userId);
//beans를 request 내장 객체의 속성에 저장 ->viwe페이지에 데이터 공유(전달)

request.setAttribute("memberInfo",member);
//view 페이지로 forwording

%>
<jsp:forward page="reMember_view.jsp"/>
