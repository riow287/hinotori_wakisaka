<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>点数入力</title>
</head>
<body>
	<%@ include file="header.jsp"%><br>

	<form action="judge.jsp" method="POST">
		点数: <select name="score">
			<%
			// セレクトボックスの初期値を設定する
			int defaultVal = 100;

			// セレクトボックスの数値を設定する
			for (int i = 0; i <= 100; i++) {
			%>
			<option value="<%=i%>" <%if (i == defaultVal) {%> selected <%}%>><%=i%></option>
			<%
			}
			%>
		</select>点<br> <input type="submit" value="判定">
	</form>
</body>
</html>