<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員情報-変更入力フォーム</title>
</head>
<body>
	<jsp:useBean id="employee" class="model.entity.EmployeeBean"
		scope="session" />
	<form action="employee-alter-confirm-servlet" method="post">
		コード：<jsp:getProperty name="employee" property="code" /><br> 氏名：<input
			type="text" name="name"
			value="<jsp:getProperty name="employee" property="name" />"><br>
		年齢：<input type="text" name="age"
			value="<jsp:getProperty name="employee" property="age" />"><br>
		部署：<input type="text" name="section"
			value="<jsp:getProperty name="employee" property="section" />"><br>
		<input type="submit" value="変更する">
	</form>
	<form action="employee-detail-servlet" method="POST">
		<input type="hidden" name="code" value="<%=employee.getCode()%>">
		<input type="submit" value="詳細表示画面に戻る">
	</form>
</body>
</html>