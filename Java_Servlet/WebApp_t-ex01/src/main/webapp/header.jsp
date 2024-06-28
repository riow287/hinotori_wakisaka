<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List,model.entity.UserBean"%>
<%
// ユーザ情報取得
String userId = (String) session.getAttribute("userId");
%>
<p>
	ログインユーザ: <%=userId%></p>