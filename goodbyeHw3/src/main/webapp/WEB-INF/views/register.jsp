<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>
	<a class="home" href="${pageContext.request.contextPath}"><h2>학사
			관리 시스템</h2></a>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<a href="javascript:document.getElementById('logout').submit()"><b
			class="right">Logout</b></a>
		<br />
		<hr />
	</c:if>
	<fieldset>
		<legend>
			<h2>수강 신청</h2>
		</legend>
		<form id="logout" action="<c:url value='/logout' />" method="post">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
		<sf:form method="post"
			action="${pageContext.request.contextPath}/docreate"
			modelAttribute="myclass">
	code : <sf:input type="text" path="code" />
			<br />

	subject : <sf:input type="text" path="subject" />
			<br />
			<input type="submit" value="register" />
		</sf:form>
	</fieldset>
</body>
</html>