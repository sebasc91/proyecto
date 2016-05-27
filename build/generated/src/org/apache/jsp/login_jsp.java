package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\"  href=\"stylos/estilologin.css\"  type=\"text/css\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            function loginAprendiz() {\n");
      out.write("                //    alert(\"hizo click0\");\n");
      out.write("\n");
      out.write("                document.forms.login.action = \"Aprendiz.jsp\";\n");
      out.write("                document.forms.login.submit();\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            String error = (String) request.getAttribute("error");

        
      out.write("\n");
      out.write("\n");
      out.write("        <form name=\"login\" action=\"ServLog\" method=\"POST\">   \n");
      out.write("            <table border=\"0\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><img src=\"img/encabezado.png\" width=\"1230\" height=\"100\" alt=\"encabezado\"/><br><br>\n");
      out.write("                <div class=\"fondologinusuario\"></div>\n");
      out.write("                <div class=\"alineacionimagenreloj\">\n");
      out.write("                    <div class=\"fondoazullogin\">  \n");
      out.write("\n");
      out.write("                        <table border=\"0\">\n");
      out.write("                            <tr><br><br>\n");
      out.write("                            <td><img src=\"img/principal.png\" width=\"600\" height=\"300\" alt=\"principal\"/>\n");
      out.write("                            </td>                   \n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <td> <table border=\"0\" width=\"150\"> <br>\n");
      out.write("\n");
      out.write("                                    <div class=\"justificacioncuadrologin\" align=\"center\">                        \n");
      out.write("                                        <div class=\"h1\"><h1>...........Autenticación..........</h1> \n");
      out.write("                                        ");
                           if (error != null) {
                                        
      out.write("\n");
      out.write("                                        <h3>");
      out.print(error);
      out.write("</h3>    \n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div id=\"fondologinusuario\">\n");
      out.write("                                            <div class=\"hover\"><br>\n");
      out.write("\n");
      out.write("                                                Usuario   <br><input type=\"text\"  name=\"usuario\" ><br>\n");
      out.write("                                                Contraseña<br><input  type=\"password\" name=\"password\"><br>\n");
      out.write("                                                <input type=\"checkbox\"  name=\"recordar\" value=\"ON\"> Recordar<br><br><br> \n");
      out.write("                                                <input type=\"submit\" name=\"aceptar\" value=\"Aceptar\">\n");
      out.write("                                                <div class=\"olvidocontraseña\">\n");
      out.write("                                                    <h4>¿Olvidó su contraseña?</h4></div>   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </table>\n");
      out.write("                        </table>\n");
      out.write("                        </table>\n");
      out.write("                        </form>\n");
      out.write("                        </thead>    \n");
      out.write("                        </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
