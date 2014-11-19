<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
      
     <c:forEach var="castleId" begin="1" end="${castleData.allCastles.size()}">
        <p>castleName: ${castleData.allCastles.get(castleId-1).castleName}</p>
        <p>built: ${castleData.allCastles.get(castleId-1).built}</p>
        <p>visitTime: ${castleData.allCastles.get(castleId-1).visitTime}</p>
        <p>condition: ${castleData.allCastles.get(castleId-1).condition}</p>
        <p>material: ${castleData.allCastles.get(castleId-1).material}</p>
   </c:forEach>
   
   <a href="index.jsp">Add New Castle</a>
</body>
</html>
