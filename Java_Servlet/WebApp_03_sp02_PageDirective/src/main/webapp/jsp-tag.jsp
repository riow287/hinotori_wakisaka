<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSPタグ</title>
</head>
<body>
	<h3>JSPタグ</h3>
	<%
		List<String> list = new ArrayList<String>();
		list.add("JSP基本タグ");
		list.add("ディレクティブタグ");
		list.add("アクションタグ");
	%>
	<%
		for (int i = 0; i < list.size(); i++) {
	%>
		<%=list.get(i)%><br>
	<%
		}
	%>
</body>
</html>