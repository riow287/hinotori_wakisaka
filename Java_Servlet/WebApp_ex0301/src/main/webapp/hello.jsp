<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<%
	// 5回表示する
	for (int i = 0; i < 5; i++) {
	%>
	Hello,JSP!
	<br>
	<%
}
%>
</body>
</html>