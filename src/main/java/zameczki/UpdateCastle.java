package zameczki;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.SessionContext;
import javax.enterprise.inject.New;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet (urlPatterns = "/soManyRoutes")

public class UpdateCastle extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		StorageService data = (StorageService) getServletContext().getAttribute("castleData");
		
		String name = req.getParameter("number");
		int x=0;
		while(x<(data.getAllCastles().size()-1))
		{
			if(data.getAllCastles().get(x).getCastleName().toLowerCase().contains(name)) break;
			x++;
		}
		
		
		data.getAllCastles().get(x).setCastleName(req.getParameter("castleName"));
		
		data.getAllCastles().get(x).setBuilt(Integer.parseInt(req.getParameter("built")));
		
		data.getAllCastles().get(x).setCastleType(req.getParameter("castleType"));
		
		String visitTime = "";
		for (String hobby : req.getParameterValues("visitTime")) {
		visitTime += hobby + ", ";
		}
		
		data.getAllCastles().get(x).setVisitTime(visitTime);
		
		data.getAllCastles().get(x).setCondition(req.getParameter("ta"));
		
		data.getAllCastles().get(x).setMaterial(req.getParameter("material"));
	
		resp.sendRedirect("showCastles.jsp");
	}
}