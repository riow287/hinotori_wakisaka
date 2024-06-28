<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Count Rows</title>
</head>
<body>
	<%
	// 100回表示する
	for (int i = 1; i <= 100; i++) {
	%>
	<%=i %>行目
	<br>
	<%
	}
	%>
</body>
</html>