<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List,model.entity.EmployeeBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員情報-一覧</title>
</head>
<body>
	<%
List<EmployeeBean> employeeList = (List) request.getAttribute("employeeList");
%>
	<table>
		<tr>
			<th>コード</th>
			<th>氏名</th>
			<th>年齢</th>
			<th>部署</th>
		</tr>
		<%
		for (EmployeeBean employee : employeeList) {
		%>
		<tr>
			<td><%=employee.getCode()%></td>
			<td><%=employee.getName()%></td>
			<td><%=employee.getAge()%></td>
			<td><%=employee.getSection()%></td>
		</tr>
		<%
}
%>
	</table>
</body>
</html>