<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/docreate"> 
	
	<table class="formtable">
		<tr><td class="label"> Name:</td> <td><input class="control" type="text" name="name"/>	</td>	</tr>
		<tr><td class="label"> Email:</td> <td><input class="control" type="text" name="email"/>	</td>	</tr>
		<tr><td class="label"> Offer:</td> <td><textarea class="control" name="text" rows="10" cols="10"> </textarea></td></tr>
		<tr><td class="label"> </td> <td><input class="control" type="submit" name="새 제안"/>	</td>	</tr>
	
	</table>
	
	</form>
	
</body>
</html>