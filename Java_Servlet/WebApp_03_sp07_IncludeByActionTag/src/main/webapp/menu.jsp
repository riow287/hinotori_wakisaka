<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員専用ページメニュー</title>
</head>
<body>
	<jsp:include page="header.jsp">
		<jsp:param name="color" value="red" />
	</jsp:include>
	<h1>メニュー</h1>
	<a href="member-page_1.jsp">会員専用ページ1へ</a>
	<br>
	<a href="member-page_2.jsp">会員専用ページ2へ</a>
	<br>
</body>
</html>