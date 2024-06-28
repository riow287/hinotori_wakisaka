<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メニュー</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h1>メニュー</h1>
	<form action="UserListServlet" method="POST">
		<input type="submit" value="ユーザ一覧表示">
	</form>
	<jsp:include page="footer.jsp" />
</body>
</html>