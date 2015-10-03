<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:forEach var="item" items="${ articles }">
	${ item.id }	
	${ item.title } 
	${ item.content }
	<br>
</c:forEach>
</body>
</html>
