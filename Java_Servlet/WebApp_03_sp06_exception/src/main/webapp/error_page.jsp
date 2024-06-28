<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>エラーページ</title>
</head>
<body>
	JSPによるページ書き出し中に例外が発生しました。
	<br> エラーメッセージ：<%=exception.getMessage()%>
</body>
</html>