package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userDash_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>user Dashbord</title>\n");
      out.write("        <link href=\"StaffCss/hover.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.1.2/css/fontawesome.min.css\" integrity=\"sha384-X8QTME3FCg1DLb58++lPvsjbQoCT9bp3MsUU3grbIny/3ZwUJkRNO8NPW6zqzuW9\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <h1>Hello ");
      out.print(session.getAttribute("uname") );
      out.write("</h1></center>\n");
      out.write("      \n");
      out.write("         <div class=\"container\">\n");
      out.write("       <div class=\"box\">\n");
      out.write("       <div class=\"icon\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i></div>\n");
      out.write("       <div class=\"content\"><h3><a href=\"userProfile.jsp\" style=\"text-decoration: none; color: #ffffff; font-weight: bold\">User</a></h3>\n");
      out.write("       <p>The user can acess the user dashboard through the user profile </p>\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <div class=\"box\">\n");
      out.write("            <div class=\"icon\">\n");
      out.write("                <i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i></div>\n");
      out.write("                <div class=\"content\"><h3><a href=\" userUpdate.jsp\" style=\"text-decoration: none; color: #ffffff; font-weight: bold\">User Profile Update</a></h3>\n");
      out.write("       <p>User can view their profile details by using this option</p>\n");
      out.write("       </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"box\">\n");
      out.write("            <div class=\"icon\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></div>\n");
      out.write("            <div class=\"content\"><h3><a href=\"SerchFlight.jsp\" style=\"text-decoration: none; color: #ffffff; font-weight: bold\">Search Flights</a></h3>\n");
      out.write("       <p>User can search all the flight details through this option</p>\n");
      out.write("       </div>\n");
      out.write("            </div>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("        <div class=\"box\">\n");
      out.write("        <div class=\"icon\"><i class=\"fa fa-plane\" aria-hidden=\"true\"></i></div>\n");
      out.write("        <div class=\"content\"><h3><a href=\"viewFlight.jsp\" style=\"text-decoration: none; color: #ffffff; font-weight: bold\">View All Flights</a></h3>\n");
      out.write("       <p>Through the view flight option user can get all the flight details</p>\n");
      out.write("       </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("        <div class=\"icon\"><i class=\"fa fa-lock\" aria-hidden=\"true\"></i></div>\n");
      out.write("        <div class=\"content\"><h3><a href=\"seats.jsp\"style=\"text-decoration: none; color: #ffffff; font-weight: bold\">Reserve Seats</a> </h3>\n");
      out.write("       <p>User can reserve the flight seats by using this option</p>\n");
      out.write("       </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"icon\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i></div>\n");
      out.write("            <div class=\"content\"><h3><a href=\"Logout\"style=\"text-decoration: none; color: #ffffff; font-weight: bold\">Log Out</a> </h3>\n");
      out.write("       <p>User can logout the system by ussing this</p>\n");
      out.write("       </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("    </body>\n");
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
