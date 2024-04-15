<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
    <form:form method="POST" action="add" modelAttribute="myForm">
        <form:label path="name">Name</form:label>
        <form:input path="name"/><br>
        <form:errors path="name" cssClass="error"/><br>
        <input type="submit" value="Submit"/>
    </form:form>
    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
</body>
</html>
