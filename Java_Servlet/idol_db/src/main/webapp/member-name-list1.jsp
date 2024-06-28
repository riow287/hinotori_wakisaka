<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>一覧</title>
</head>
<body>
	<%
	String group_name = (String) request.getAttribute("group_name");
	List<String> memberList = (List<String>) request.getAttribute("memberList");
	%>

	<%
	if (memberList == null || memberList.isEmpty()) {
	%>
	<p><%=group_name%>に所属するメンバーはいません。
	</p>
	<%
	} else {
	%>
	<p><%=group_name%>のメンバー一覧
	</p>
	<%
	for (String member_name : memberList) {
	%>
	<%=member_name%><br>
	<%
	}
	}
	%>
	<div>
		<a href="form.html">検索画面に戻る</a>
	</div>
</body>
</html>