<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>You can update your castel as many did!</title>
</head>
<body>
	<jsp:useBean id="updateCastle" class="zameczki.Castle" scope="session" />
	<h2>Update Your castle! </h2>
   
    <form action="soManyRoutes" method="post">
    oryginal castle name : <input type="text" name="number" value="${updateCastle.castleName}" readonly><br><br><br>
        castleName: <input type="text" name="castleName" value="${updateCastle.castleName}"><br/>
        builtDate: <input type="text" name="built" value="${updateCastle.built}"><br/>
		castleType:<br> Gothic <input type="radio" name="castleType" value="gothic" <%= (updateCastle.getCastleType().contains("gothic"))?("checked='checked'"):""%>>
					<br> NeoRomantic <input type="radio" name="castleType" value="neoromantic" <%= (updateCastle.getCastleType().contains("neoromantic"))?("checked='checked'"):""%>>
					<br> Regular <input type="radio" name="castleType" value="regular" <%= (updateCastle.getCastleType().contains("regular"))?("checked='checked'"):""%>>
		<br> visitTime :
		<br>from 7 to 10 <input type="checkbox" name="visitTime" value="From 7 to 10" <%= (updateCastle.getVisitTime().contains("7 to 10"))?("checked='checked'"):""%>>
		<br>from 10 to 13 <input type="checkbox" name="visitTime" value="From 10 to 13" <%= (updateCastle.getVisitTime().contains("10 to 13"))?("checked='checked'"):""%>>
		<br>from 13 to 16 <input type="checkbox" name="visitTime" value="From 13 to 16" <%= (updateCastle.getVisitTime().contains("13 to 16"))?("checked='checked'"):""%>>
		<br>describe castle's condition: <textarea name="ta"  rows="4" cols="50">${updateCastle.condition}</textarea>
		<br> <select name="material">
				<option <%= (updateCastle.getMaterial().contains("Brick"))?("selected='selected'"):""%> >Brick</option>
				<option <%= (updateCastle.getMaterial().contains("Wood"))?("selected='selected'"):""%>>Wood</option>
				<option <%= (updateCastle.getMaterial().contains("Stone"))?("selected='selected'"):""%>>Stone</option>
			</select>
        <input type="submit" value="Update">
        
    </form>
	
</body>
</html>