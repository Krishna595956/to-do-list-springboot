<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Sample Details</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Mobile</th>
                </tr>
        </thead>
        <tbody>
            <c:forEach items="${students}" var="student">
                <tr>
                    <td>${student.mobile}</td>
                    </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
