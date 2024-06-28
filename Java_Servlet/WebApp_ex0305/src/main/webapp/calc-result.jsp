<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>計算結果</title>
</head>
<body>
	<%
	try {
		// 金額
		int amount = Integer.parseInt(request.getParameter("amount"));
		// 人数
		int people = Integer.parseInt(request.getParameter("people"));

		// 金額や人数に0以下の数値が入力された場合
		if (amount <= 0 || people <= 0) {
			throw new IllegalArgumentException("金額や人数には、正の整数を入力してください");
		} else {
			// 一人あたりの金額
			int result = amount / people;
			// 端数
			int fraction = amount % people;
	%>
	<h1>割り算計算結果</h1>
	<p>
		一人あたり：<%=result%>円<br> 端数：<%=fraction%>円
	</p>
	<a href="input-amount.html">戻る</a>
	<%
		}
	}
	// 金額や人数に整数以外が入力された場合
	catch (NumberFormatException e) {
	throw new NumberFormatException("For input string:" + request.getParameter("amount"));
	}
	%>
</body>
</html>