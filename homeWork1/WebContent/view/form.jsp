<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	This is a form page

	<form action="/homeWork1/order" method="get">
	
	

		Item Number : <input type="text" name="item" /> <br />
		Description : <input type="text" name="des" /> <br /> 
		Price Each : <input type="text" name="price" /> <br />
		<hr />
		First Name : <input type="text" name="fsname" /> <br /> 
		Last Name : <input type="text" name="lsname" /> <br />
		 Middle Inital : <input	type="text" name="midint" /> <br /> 
		 Shipping Address <textarea rows="5" cols="30"  name="address">write here</textarea> <br /> 
		 Credit Card : 
		 <br />
		 <input type="radio" name="card" value="Visa"> Visa <br /> 
		 <input type="radio" name="card" value="MasterCard"> MasterCard<br /> 
		 <input type="radio" name="card" value=" American Express"> American Express<br />
		 <input type="radio" name="card" value="Discover"> Discover<br />
		 <input type="radio" name="card" value="Java SmartCard"> Java SmartCard<br />
		 Credit Card Number : <input type="password" name="number"> <br /> 
		 Repeat Credit Card Number : <input type="password" name="number1"> <br /> 
		 
		 <input type="submit" value="Submit Order" />

	</form> 


</body>
</html>