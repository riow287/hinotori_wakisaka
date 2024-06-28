<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>依頼受付完了</title>
</head>
<body>
	<%request.setCharacterEncoding("UTF-8");%>
	
	依頼を受け付けました<br>
	名前：<%=request.getParameter("name")%><br>
	連絡方法：<%=request.getParameter("contact")%><br>
	依頼内容：
	
	<%
	String[] strAry = request.getParameterValues("ask");
	for (String str : strAry) {
	%>
		<%=str%>
	<%
		}
	%>
</body>
