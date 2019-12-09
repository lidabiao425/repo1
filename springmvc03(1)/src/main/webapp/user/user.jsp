<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="user2.do" method="post">
likes <input type="checkbox" name="likes" value="apple">苹果
<input type="checkbox" name="likes" value="pear">鸭梨
<input type="checkbox" name="likes" value="peach">桃子
<br>

电话1： <input type="text" name="addrList[0].mobile"><br>
电话2： <input type="text" name="addrList[1].mobile"><br>
<input type="submit" value="注册">

</form>

</body>
</html>