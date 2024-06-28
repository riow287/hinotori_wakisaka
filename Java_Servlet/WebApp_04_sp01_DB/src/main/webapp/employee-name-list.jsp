<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員名-一覧</title>
</head>
<body>
	<%
	List<String> nameList = (List) request.getAttribute("nameList");
	for (String name : nameList) {
	%>
	<%=name%><br>
	<%
	}
	%>
</body>
</html>