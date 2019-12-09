<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="reg6.do" method="post">
username <input type="text" name="uname"><br>
your height <input type="text" name="height"><br>
your age <input type="text" name="age"><br>
isMarried <input type="radio" name="mar" value="true">婚 
<input type="radio" name="mar" value="false">否<br>
birthday<input type="text" name="birthday">(yyyy-MM-dd 例如： 1996-08-12)<br>
所在省份 <input type="text" name="address.prov"><br>
所在城市 <input type="text" name="address.city"><br>
联系电话 <input type="text" name="address.mobile"><br>
<input type="submit" value="注册">
</form>
</body>
</html>