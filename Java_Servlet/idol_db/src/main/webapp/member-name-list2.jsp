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
	String search_name = (String) request.getAttribute("input");
	List<String> memberList = (List<String>) request.getAttribute("memberList");
	%>
	<p>検索文字: <%=search_name%></p>

	<%
	if (memberList == null || memberList.isEmpty()) {
	%>
	<p>該当するメンバーはいません。</p>
	<%
	} else {
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