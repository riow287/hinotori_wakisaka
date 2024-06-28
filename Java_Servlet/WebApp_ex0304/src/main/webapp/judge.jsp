<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>判定結果表示</title>
</head>
<body>
	<%@ include file="header.jsp"%><br>

	<%
	// 点数をもとに結果を判定する
	int score = Integer.parseInt(request.getParameter("score"));
	String result;
	if (score >= 80) {
		result = "合格";
	} else {
		result = "不合格";
	}
	%>
	判定：
	<%=result%>
</body>
</html>