<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body bgcolor="#f0f8ff" text="#000000">
<h2>英単語、日本語を登録してください。</h2>
<form action="input" method="post">
	<table>
	<tr><th>英単語</th><td><input type="text" name="english"></td></tr>
	<tr><th>日本語</th><td><input type="text" name="japanese"></td></tr>
	</table>
	<input type="submit" value="登録">
</form>
</body>
</html>
