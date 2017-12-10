<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>
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
	<form id="logout" action="<c:url value='/logout' />" method="post">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<table class="formtable">
		<tr>
			<td><a href="${pageContext.request.contextPath}/View1">학기별
					이수 학점 조회</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/View2">이수
					구분별 학점 조회</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/register">수강
					신청하기</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/View3">수강 신청
					조회</a></td>
		</tr>
	</table>

</body>
</html>
