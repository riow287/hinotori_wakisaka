<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員専用ページ2</title>
</head>
<body>
	<%=session.getAttribute("name")%>さん
	<br> こちらは会員専用ページ2です。
	<br>
	<a href="member-page_1.jsp">会員専用ページ1へ</a>
	<form action="exit.jsp" method="post">
		<input type="submit" value="会員専用ページを退出する">
	</form>
</body>
</html>