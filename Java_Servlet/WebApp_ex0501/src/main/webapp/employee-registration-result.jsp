<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録結果</title>
</head>
<body>
	<h1>登録結果</h1>

	<%
	int processingNumber = (int) request.getAttribute("processingNumber");
	if (processingNumber > 0) {
	%>
	<p>以下の従業員情報を登録しました。</p>
	<jsp:useBean id="employee" scope="session"
		class="model.entity.EmployeeBean" />
	コード：<jsp:getProperty name="employee" property="code" /><br> 
	氏名：<jsp:getProperty name="employee" property="name" /><br> 
	年齢：<jsp:getProperty name="employee" property="age" /><br> 
	部署：<jsp:getProperty name="employee" property="section" /><br>

	<%
	} else {
	%>
	<p>従業員情報を登録できませんでした。</p>
	<%
	}
	%>

	<%
	// セッションを破棄
	session.invalidate();
	%>

</body>
</html>