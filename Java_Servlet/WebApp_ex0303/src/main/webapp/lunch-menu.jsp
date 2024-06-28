<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List, java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lunch Menu</title>
</head>
<body>
	<%
	// メニューデータを登録する
	List<String> menuList = new ArrayList<String>();
	menuList.add("生姜焼き定食");
	menuList.add("鶏のから揚げ定食");
	menuList.add("鯖の味噌煮定食");
	menuList.add("カツ丼");
	menuList.add("親子丼");
	%>

	<table>
		<thead>
			<tr>
				<th>ランチメニュー</th>
			</tr>
		</thead>
		<tbody>
			<%
			// メニューを表示する
			for (String menu : menuList) {
			%>
			<tr>
				<td><%=menu%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	
</body>
</html>
