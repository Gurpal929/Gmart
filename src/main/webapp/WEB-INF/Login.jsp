<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align=center><h1>Login</h1></div>
<form action="LoginServlet" method=post>
<table>

<tr><td>User Name</td><td><input type=text name=username></td></tr>
<tr><td>Password</td><td><input type=text name=password></td></tr>
<tr><td><input type=submit value=Login></td><td><input type=Submit value=Reset></td></tr>
</table>

 </form>



</body>
</html>