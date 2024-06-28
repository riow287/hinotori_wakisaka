<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員専用ページメニュー</title>
</head>
<body>
	<%
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
session.setAttribute("name", name);
%>
	ようこそ、<%=name%>さん
	<br>
	<a href="member-page_1.jsp">会員専用ページ1へ</a>
	<br>
	<a href="member-page_2.jsp">会員専用ページ2へ</a>
	<br>
</body>
</html>