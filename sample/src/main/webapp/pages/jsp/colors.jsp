<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="colors" value="${['Red', 'Green', 'Blue', 'Yellow']}"/>

<ul>
    <c:forEach items="${colors}" var="color">
        <li>${color}</li>
    </c:forEach>
</ul>
