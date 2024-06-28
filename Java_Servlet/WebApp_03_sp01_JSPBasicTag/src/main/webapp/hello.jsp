<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello 10 times</title>
</head>
<body>
	<%-- カウンタ--%>
	<%-- 変数countは、JSPへの初回アクセス時に0で初期化される--%>
	<%!int count = 0;%>
	<%-- 変数countは、JSPにアクセスがあるたびにインクリメントされる--%>
	<%
count++;
%>
	<%-- 変数countの値は、サーバが起動している間、保持される。--%>
	カウンタ：<%=count%><br>
	<%-- Helloを10回表示--%>
	<%
	for (int i = 1; i <= 10; i++) {
	%>
	<%=i%>回目：Hello
	<br>
	<%
}
%>
</body>
</html>