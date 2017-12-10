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
	<a class="home" href="${pageContext.request.contextPath}"><h2>�л�
			���� �ý���</h2></a>
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
			<td><a href="${pageContext.request.contextPath}/View1">�б⺰
					�̼� ���� ��ȸ</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/View2">�̼�
					���к� ���� ��ȸ</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/register">����
					��û�ϱ�</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/View3">���� ��û
					��ȸ</a></td>
		</tr>
	</table>

</body>
</html>
