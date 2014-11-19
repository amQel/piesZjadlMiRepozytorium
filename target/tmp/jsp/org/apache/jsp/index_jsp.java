package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import zameczki.AllCastlesData;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Message board</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      zameczki.Castle singleCastle = null;
      synchronized (session) {
        singleCastle = (zameczki.Castle) _jspx_page_context.getAttribute("singleCastle", PageContext.SESSION_SCOPE);
        if (singleCastle == null){
          singleCastle = new zameczki.Castle();
          _jspx_page_context.setAttribute("singleCastle", singleCastle, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("    <h2>Add Your castle!</h2>\n");
      out.write("   \n");
      out.write("    <form action=\"addCastle\" method=\"post\">\n");
      out.write("        castleName: <input type=\"text\" name=\"castleName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleCastle.castleName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br/>\n");
      out.write("        builtDate: <input type=\"text\" name=\"built\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleCastle.built}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br/>\n");
      out.write("\t\tcastleType:<br> Gothic <input type=\"radio\" name=\"castleType\" value=\"gothic\" ");
      out.print( (singleCastle.getCastleType().contains("gothic"))?("checked='checked'"):"");
      out.write(">\n");
      out.write("\t\t\t\t\t<br> NeoRomantic <input type=\"radio\" name=\"castleType\" value=\"neoromantic\" ");
      out.print( (singleCastle.getCastleType().contains("neoromantic"))?("checked='checked'"):"");
      out.write(">\n");
      out.write("\t\t\t\t\t<br> Regular <input type=\"radio\" name=\"castleType\" value=\"regular\" ");
      out.print( (singleCastle.getCastleType().contains("regular"))?("checked='checked'"):"");
      out.write(">\n");
      out.write("\t\t<br> visitTime :\n");
      out.write("\t\t<br>from 7 to 10 <input type=\"checkbox\" name=\"visitTime\" value=\"From 7 to 10\" ");
      out.print( (singleCastle.getVisitTime().contains("7 to 10"))?("checked='checked'"):"");
      out.write(">\n");
      out.write("\t\t<br>from 10 to 13 <input type=\"checkbox\" name=\"visitTime\" value=\"From 10 to 13\" ");
      out.print( (singleCastle.getVisitTime().contains("10 to 13"))?("checked='checked'"):"");
      out.write(">\n");
      out.write("\t\t<br>from 13 to 16 <input type=\"checkbox\" name=\"visitTime\" value=\"From 13 to 16\" ");
      out.print( (singleCastle.getVisitTime().contains("13 to 16"))?("checked='checked'"):"");
      out.write(">\n");
      out.write("\t\t<br>describe castle's condition: <textarea name=\"ta\"  rows=\"4\" cols=\"50\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleCastle.condition}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("\t\t<br> <select name=\"material\">\n");
      out.write("\t\t\t\t<option ");
      out.print( ("Brick".equals(singleCastle))?("selected='selected'"):"");
      out.write(" >Brick</option>\n");
      out.write("\t\t\t\t<option ");
      out.print( ("Wood".equals(singleCastle))?("selected='selected'"):"");
      out.write(">Wood</option>\n");
      out.write("\t\t\t\t<option ");
      out.print( ("Stone".equals(singleCastle))?("selected='selected'"):"");
      out.write(">Stone</option>\n");
      out.write("\t\t\t</select>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("        <input type=\"submit\" value=\"Add\">\n");
      out.write("    </form>\n");
      out.write("    <a href=\"clear.jsp\">Clear Castles Data</a>\n");
      out.write("    <a href=\"showCastles.jsp\">Show All Castles</a>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
