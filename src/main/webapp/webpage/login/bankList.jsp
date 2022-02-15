<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>三</title>
</head>
<body>

<form action="">
<table>
	<tr>
		<td>id</td>
		<td>code</td>
		<td>name</td>
	</tr>
	<c:forEach items="${list }" var="item">
	<tr>
		<td>${item.id }</td>
		<td>${item.code }</td>
		<td>${item.name }</td>
	</tr>
	</c:forEach>

</table>


</form>

</body>
</html>
