<%@page import="zameczki.AllCastlesData"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Message board</title>
</head>
<body>
    <jsp:useBean id="storage" class="zameczki.AllCastlesData" scope="application" />

    <h2>Message board</h2>
    <br>

    <c:forEach var="castle" items="${storage.allCastlesData}">
        <p>castleName: ${castle.castleName}</p>
        <p>builtDate: ${castle.builtDate}</p>
		<p>castleType: ${castle.castleType}</p>
		<p>visitable: ${castle.visitable}</p>
		<p>condition: ${castle.condition}</p>
    </c:forEach>

    <br/>

    <p>Add new castle:</p>

    <form action="add.jsp" method="post">
        castleName: <input type="text" name="castleName"><br/>
        builtDate: <input type="text" name="builtDate"><br/>
		castleType:<br> Gothic <input type="radio" name="castleType" value="gothic">
					<br> NeoRomantic <input type="radio" name="castleType" value="neoromantic">
					<br> Regular <input type="radio" name="castleType" value="regular">
		<br> visitable <input type="checkbox" name="visit" value="true" checked>
		<br> condition : <input type="text" name="condition">
        <input type="submit" value="Add">
    </form>
    <a href="clear.jsp">Clear Castles Data</a>
</body>
</html>
