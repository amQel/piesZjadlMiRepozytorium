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

@WebServlet (urlPatterns = "/updateCastle")

public class UpdateCastleRedirect extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		StorageService data = (StorageService) getServletContext().getAttribute("castleData");
		
		if(req.getSession().getAttribute("updateCastle") == null)
		{
			req.getSession().setAttribute("updateCastle", new Castle());
		}
		
		Castle castle = (Castle) req.getSession().getAttribute("updateCastle");
		
		String castleNumber = req.getParameter("castleUpdateNumber");
		int cNumber = Integer.parseInt(castleNumber);
		cNumber--;
		castle.setCastleName(data.getAllCastles().get(cNumber).getCastleName());
		
		castle.setBuilt(data.getAllCastles().get(cNumber).getBuilt());
		
		castle.setCastleType(data.getAllCastles().get(cNumber).getCastleType());
		
		castle.setVisitTime(data.getAllCastles().get(cNumber).getVisitTime());
		
		castle.setCondition(data.getAllCastles().get(cNumber).getCondition());
		
		castle.setMaterial(data.getAllCastles().get(cNumber).getMaterial());
		
		resp.sendRedirect("updateCastle.jsp");
	}
}
