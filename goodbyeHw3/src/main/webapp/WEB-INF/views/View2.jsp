<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>
	<a class="home" href="${pageContext.request.contextPath}" ><h2>학사 관리 시스템</h2></a>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<a href="javascript:document.getElementById('logout').submit()"><b class="right">Logout</b></a>
		<br />
		<hr />
	</c:if>
	<form id="logout" action="<c:url value='/logout' />" method="post">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<fieldset>
		<legend>
			<h2>이수별 구분 학점 조회</h2>
		</legend>
		<table class="formtable">
			<tr>
				<c:forEach var="myclass" items="${myclass}">
					<th>${mylecture.subject}</th>
				</c:forEach>
				<th>총학점</th>
			</tr>
			<tr>
				<c:forEach var="myclass" items="${myclass}">
					<td>${myclass.division}</td>
				</c:forEach>
				<td><b>${total.grade}</b></td>
			</tr>
		</table>
	</fieldset>
</body>
</html>