<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
我们检测到:<br>
姓名：${username } <br>
身高：${height }<br>
年龄：${age }<br>
婚姻:${mar }<br>
省份:${prov }<br>
城市:${city }<br>
电话:${mobile }<br>
生日:
<fmt:formatDate value="${birthday }" pattern="yyyy-MM-dd"/>


</body>
</html>