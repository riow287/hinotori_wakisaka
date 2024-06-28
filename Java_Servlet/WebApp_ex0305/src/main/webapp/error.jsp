<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>エラー</title>
</head>
<body>
	<p>エラーが発生しました</p>
	<p><%=exception.getMessage()%></p>
	<a href="input-amount.html">戻る</a>
</body>
</html>