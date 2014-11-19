<%@page import="zameczki.AllCastlesData"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Message board</title>
</head>
<body>
<jsp:useBean id="singleCastle" class="zameczki.Castle" scope="session" />
<jsp:useBean id="castleData" class="zameczki.StorageService" scope="application"/>
    <h2>Add Your castle!</h2>
   
    <form action="addCastle" method="post">
        castleName: <input type="text" name="castleName" value="${singleCastle.castleName}"><br/>
        builtDate: <input type="text" name="built" value="${singleCastle.built}"><br/>
		castleType:<br> Gothic <input type="radio" name="castleType" value="gothic" <%= (singleCastle.getCastleType().contains("gothic"))?("checked='checked'"):""%>>
					<br> NeoRomantic <input type="radio" name="castleType" value="neoromantic" <%= (singleCastle.getCastleType().contains("neoromantic"))?("checked='checked'"):""%>>
					<br> Regular <input type="radio" name="castleType" value="regular" <%= (singleCastle.getCastleType().contains("regular"))?("checked='checked'"):""%>>
		<br> visitTime :
		<br>from 7 to 10 <input type="checkbox" name="visitTime" value="From 7 to 10" <%= (singleCastle.getVisitTime().contains("7 to 10"))?("checked='checked'"):""%>>
		<br>from 10 to 13 <input type="checkbox" name="visitTime" value="From 10 to 13" <%= (singleCastle.getVisitTime().contains("10 to 13"))?("checked='checked'"):""%>>
		<br>from 13 to 16 <input type="checkbox" name="visitTime" value="From 13 to 16" <%= (singleCastle.getVisitTime().contains("13 to 16"))?("checked='checked'"):""%>>
		<br>describe castle's condition: <textarea name="ta"  rows="4" cols="50">${singleCastle.condition}</textarea>
		<br> <select name="material">
				<option value="Brick" <%= (singleCastle.getMaterial().contains("Brick"))?("selected='selected'"):""%> >Brick</option>
				<option value="Wood" <%= (singleCastle.getMaterial().contains("Wood"))?("selected='selected'"):""%>>Wood</option>
				<option value="Stone" <%= (singleCastle.getMaterial().contains("Stone"))?("selected='selected'"):""%>>Stone</option>
			</select>
		
		
        <input type="submit" value="Add">
    </form>
    <a href="clear.jsp">Clear Castles Data</a><br>
    <a href="showCastles.jsp">Show All Castles</a><br>
    <form action="updateCastle" method="post">
    <br> Tell me what you want to update<input type="text" name="castleUpdateNumber" value="type castle number here 1 - ${castleData.size()} [1 - 0 mean there are no castles yet]">
    <input type="submit" value="update this shi.Castle">
    </form>
</body>
</html>
