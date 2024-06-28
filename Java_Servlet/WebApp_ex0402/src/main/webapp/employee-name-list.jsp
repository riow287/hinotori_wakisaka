<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員名一覧表示</title>
</head>
<body>
	<%
	String section = (String) request.getAttribute("section");
	List<String> nameList = (List<String>) request.getAttribute("nameList");
	%>

	<%
	if (nameList.isEmpty()) {
	%>
	<p><%=section%>に所属する従業員はいませんでした。
	</p>
	<%
	} else {
	%>
	<p><%=section%>の従業員名一覧
	</p>
	<%
	for (String name : nameList) {
	%>
	<%=name%><br>
	<%
	}
	}
	%>
</body>
</html>