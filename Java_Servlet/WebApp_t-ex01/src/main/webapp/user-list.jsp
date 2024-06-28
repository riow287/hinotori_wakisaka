<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List,model.entity.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザ一覧</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<h1>ユーザ一覧</h1>

	<%
	// ユーザ情報取得
	List<UserBean> userList = (List<UserBean>) request.getAttribute("userList");
	%>

	<table>
		<tr>
			<th>ユーザID</th>
			<th>氏名</th>
			<th>年齢</th>
		</tr>

		<%
		// ユーザ情報一覧を表示
		for (UserBean user : userList) {
		%>

		<tr>
			<td><%=user.getId()%></td>
			<td><%=user.getName()%></td>
			<td><%=user.getAge()%></td>
		</tr>
		<%
		}
		%>
	</table>

	<br>
	<form action="MenuServlet" method="POST">
		<input type="submit" value="メニューに戻る">
	</form>
	<jsp:include page="footer.jsp" />
</body>
</html>