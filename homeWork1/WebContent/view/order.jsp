<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> Reading All Request Parameters </h2>

<hr>
<table border="1">
	<caption>Order Form</caption>
	<thead>
		<tr><th>Parameter Name</th><th>Parameter Value(s)</tr>
	</thead>
	
	<tbody>
		<tr><td>cardNum</td><td>${orderform.cardNum}</td></tr>
		<tr><td>cardType</td><td>${orderform.cardType}</td></tr>

		<tr><td>price</td><td>${orderform.price}</td></tr>
		<tr><td>inital</td><td>${orderform.inital}</td></tr>
		<tr><td>itemNum</td><td>${orderform.itemNum}</td></tr>
		<tr><td>address</td><td>${orderform.address}</td></tr>
		<tr><td>firstName</td><td>4${orderform.firstName}</td></tr>
		<tr><td>description</td><td>${orderform.description}</td></tr>
		<tr><td>lastName</td><td>${orderform.lastName}</td></tr>
	</tbody>
</table>



</body>
</html>