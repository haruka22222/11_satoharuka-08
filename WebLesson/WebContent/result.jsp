<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% int count = (int)request.getAttribute("count"); %>
<% int wordNum = (int)request.getAttribute("wordNum"); %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1><%= count %>件登録しました。</h1>
<p>登録件数は<%= wordNum %>件です。</p>

<p><input type="button" value="前のページへ戻る" onclick="history.back()"></p>

</body>
</html>
