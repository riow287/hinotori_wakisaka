<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員情報-変更確認</title>
</head>
<body>
	<%
request.setCharacterEncoding("UTF-8");
%>
	従業員情報を以下の内容に変更します。よろしいですか？
	<br>
	<jsp:useBean id="employee" scope="session"
		class="model.entity.EmployeeBean" />
	<jsp:setProperty name="employee" property="name" param="name" />
	<jsp:setProperty name="employee" property="age" param="age" />
	<jsp:setProperty name="employee" property="section" param="section" />
	コード：<jsp:getProperty name="employee" property="code" /><br> 氏名：<jsp:getProperty
		name="employee" property="name" /><br> 年齢：<jsp:getProperty
		name="employee" property="age" /><br> 部署：<jsp:getProperty
		name="employee" property="section" /><br>
	<form action="employee-alter-servlet" method="POST">
		<input type="submit" value="変更する">
	</form>
	<form action="employee-alter-form-servlet" method="POST">
		<input type="submit" value="変更フォームに戻る">
	</form>
</body>
</html>