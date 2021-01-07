<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>Index</h1>
	
	<ul> 
		<li>
			<c:url value="/hello" var="hello"/>
			<a href="${hello}">${hello}</a>
		</li>
		<li>
			<c:url value="/member/login" var="login"/>
			<a href="${login}">${login}</a>
		</li>
		<li>
			<c:url value="/member/search" var="search"/>
			<a href="${search}">${search}</a>
		</li>
		<li>
			<c:url value="/order/order" var="order"/>
			<a href="${order}">${order}</a>
		</li>
	</ul>


</body>
</html>