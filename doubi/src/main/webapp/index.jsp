<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
	<h2>Hello World!</h2>
<c:forEach items="${aaa }" var="items">
	<c:out value="${items.id }"></c:out> <br/>
	<c:out value="${items.name }"></c:out> <br/>
	<c:out value="${items.price }"></c:out> <br/>
	<c:out value="${items.detail }"></c:out> <br/>
	<c:out value="${items.pic }"></c:out> <br/>
	<c:out value="${items.createTime }"></c:out> <br/>
</c:forEach>

</body>
</html>
