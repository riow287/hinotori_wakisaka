<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員情報登録</title>

<script>
	function confirmCode() {
		var code = document.getElementById("code").value;
		if (code == '') {
			alert('値を入力してください');
			return false;
		}
		return true;
	}

	function confirmSection() {
		var section = document.getElementById("section").value;
		if (section == '') {
			document.getElementById("section").value = "営業部";
		}
		return true;
	}
</script>

</head>
<body>

	<p>従業員情報登録</p>

	<jsp:useBean id="employee" class="model.entity.EmployeeBean"
		scope="session" />
	<form action="employee-registration-servlet" method="POST"
		onsubmit="return confirmSection()">
		コード： <input type="text" name="code" id="code"> <br> 氏名： <input
			type="text" name="name"> <br> 年齢： <select name="age">
			<%
			int defaultVal = 18;
			for (int i = 18; i <= 100; i++) {
			%>
			<option value="<%=i%>" <%if (i == defaultVal) {%> selected <%}%>><%=i%></option>
			<%
			}
			%>
		</select> <br> 部署： <input type="text" name="section" id="section"> <br> <input
			type="submit" value="登録する">
	</form>
</body>
</html>