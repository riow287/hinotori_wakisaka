<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員専用ページ退出</title>
</head>
<body>
	<%
	session.invalidate();
	%>
	会員専用ページを退出しました。
	<br>
	<a href="enter.html">最初のページに戻る</a>
</body>
</html>