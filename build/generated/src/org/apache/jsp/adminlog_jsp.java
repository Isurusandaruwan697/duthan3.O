package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      \n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Login</title>\n");
      out.write("      <link href=\"StaffCss/user.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("     \n");
      out.write("    <input type=\"hidden\" id=\"status\" value=\"");
      out.print(request.getAttribute("status") );
      out.write("\">\n");
      out.write("    \n");
      out.write("        <label id=\"icon\" class=\"menu1\">\n");
      out.write("            <i class=\"fa fa-bars\"></i>\n");
      out.write("        </label>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("    <div class=\"center\">   \n");
      out.write("        <img src=\"user-286.png\" class=\"avatar\">\n");
      out.write("        <h1></h1>\n");
      out.write("        \n");
      out.write("   <form action=\"adminLog\" method=\"post\">\n");
      out.write("  <div class=\"txt_field\">\n");
      out.write("    <input type=\"text\" placeholder=\"\" name=\"uname\" required>\n");
      out.write("    <span></span>\n");
      out.write("     <label for=\"uname\"><b>Admin Email</b></label>\n");
      out.write("  </div> \n");
      out.write("    \n");
      out.write("   <div class=\"txt_field\">    \n");
      out.write("    <input type=\"password\" placeholder=\"\" name=\"psw\" required>\n");
      out.write("    <span></span>\n");
      out.write("     <label for=\"psw\"><b>Password</b></label>\n");
      out.write("   </div> \n");
      out.write("     \n");
      out.write("       <input type=\"submit\" value=\"Log-In\">&ensp;\n");
      out.write("    <label>\n");
      out.write("     \n");
      out.write("      <div class=\"singn-up\">\n");
      out.write("     Let's <a href=\"adminReg.jsp\">Sign-Up</a>\n");
      out.write("    </label>\n");
      out.write("     </div>  \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("      </center>\n");
      out.write("</form>\n");
      out.write("             <link rel=\" stylesheet\" href=\"alret/dist/sweetalert.css\">\n");
      out.write("        <script>\n");
      out.write("            var status=document.getElementById(\"status\").value;\n");
      out.write("            if(status === \"failed\"){\n");
      out.write("                alert(\"wrong user name or password!\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
