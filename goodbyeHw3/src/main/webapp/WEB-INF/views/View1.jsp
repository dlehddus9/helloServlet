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

	<fieldset>
		<legend>
			<h2>학기별 이수 학점 조회</h2>
		</legend>

		<table class="formtable">
			<tr>
				<th>년도</th>
				<th>학기</th>
				<th>이수 학점</th>
				<th>상세보기</th>
			</tr>
			<c:forEach var="myclass" items="${myclass}">
				<p>
				<tr>
					<td>${myclass.year}</td>
					<td>${myclass.term}</td>
					<td>${myclass.grade}</td>
					<td><a
						href="${pageContext.request.contextPath}/View1Linkyear=${myclass.year}&term=${myclass.term}"><b>링크</b></a></td>
				</tr>
				</p>
			</c:forEach>
		</table>
	</fieldset>
</body>
</html>