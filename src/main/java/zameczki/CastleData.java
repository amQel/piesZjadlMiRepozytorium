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

@WebServlet (urlPatterns = "/addCastle")

public class CastleData extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter writer = resp.getWriter();
		StorageService data = (StorageService) getServletContext().getAttribute("castleData");
		
		if(req.getSession().getAttribute("singleCastle") == null)
		{
			req.getSession().setAttribute("singleCastle", new Castle());
		}
		
		Castle castle = (Castle) req.getSession().getAttribute("singleCastle");
		
		castle.setCastleName(req.getParameter("castleName"));
		
		castle.setBuilt(Integer.parseInt(req.getParameter("built")));
		
		castle.setCastleType(req.getParameter("castleType"));
		
		String visitTime = "";
		for (String hobby : req.getParameterValues("visitTime")) {
		visitTime += hobby + ", ";
		}
		
		castle.setVisitTime(visitTime);
		
		castle.setCondition(req.getParameter("ta"));
		
		castle.setMaterial(req.getParameter("material"));
		
		data.add(castle);
		resp.sendRedirect("showCastles.jsp");
	}
	
	@Override
	public void init() throws ServletException {
		if(getServletContext().getAttribute("castleData") == null)
		{
			getServletContext().setAttribute("castleData", new StorageService());
		}
	}

}
