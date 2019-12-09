<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="color:red;">
${error }
</div>
	<form action="add.do" method="post">
	name <input type="text" name="name"><br>
	price <input type="text" name="price"><br>
	cdate <input type="text" name="createDate"><br>
	<input type="submit" value="添加">
	</form>
</body>
</html>