package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Actividades_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"stylos/estiloformusuarios.css\">\n");
      out.write("        <title>Actividades</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"Actividades\" action=\"ServCrudActividades\" method=\"POST\">  \n");
      out.write("         <div class=\"logoencabezadoformUsuarios\">\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td><img src=\"img/logoencabezadoppal.jpg\" width=\"1230\" height=\"100\" alt=\"logoencabezadoppalg\"/><br>   \n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table><br>\n");
      out.write("            <div class=\"justificacionformUsuarios\">\n");
      out.write("            <table border=\"1\"width=\"1240\" heigth=\"1250\">\n");
      out.write("            <tr>\n");
      out.write("<td>        <table border=\"0\">\n");
      out.write("            <tbody>\n");
      out.write("                \n");
      out.write("         \n");
      out.write("                <tr><br>\n");
      out.write("                    <td width=\"20%\"> Id Actividad :   </td>\n");
      out.write("                    <td width=\"50%\"><input type=\"text\" size=\"53\" name=\"idActividad\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['actividad'].idActividad}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("                    <td width=\"20%\"> Actividad del proyecto :   </td>\n");
      out.write("                    <td width=\"50%\"><input type=\"text\"  size=\"80\" name=\"ActividadProyecto\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['actividad'].actividadProyecto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("  <tr>             \n");
      out.write("                    <td width=\"20%\"> Actividad de Aprendizaje :   </td>\n");
      out.write("                    <td width=\"50%\"><input type=\"text\" size=\"80\" name=\"ActividadAprendizaje\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['actividad'].actividadAprendizaje}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("                    \n");
      out.write("                    <tr><br>\n");
      out.write("                     <td width=\"20%\">               </td>\n");
      out.write("                     <td width=\"50%\"><input type=\"text\" size=\"53\" name=\"mensaje\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['mensaje'].mensaje}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" ></td>\n");
      out.write("                                       </tr>\n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("    </tr>  \n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("    \n");
      out.write("    </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table><br>\n");
      out.write("                   \n");
      out.write("                    <div class=\"botones\">  \n");
      out.write("                    <input type=\"hidden\" name=\"op\" id=\"inputOp\" value=\"0\">   \n");
      out.write("                    <input type=\"image\" value=\"Guardar\" src=\"img/guardar1.jpg\"title=\"Guardar\" width=\"40\" height=\"40\" alt=\"guardar1\" onclick=\"javascript:document.getElementById('inputOp').value='1';\"/>\n");
      out.write("                    <input type=\"image\" src=\"img/consultar2.jpg\"title=\"Consultar\"  width=\"40\" height=\"40\" alt=\"consultar2\" onclick=\"javascript:document.getElementById('inputOp').value='2';\"/>\n");
      out.write("                    <input type=\"image\" src=\"img/modificar.jpg\"title=\"Modificar\" width=\"40\" height=\"40\" alt=\"modificar\" onclick=\"javascript:document.getElementById('inputOp').value='3';\" />\n");
      out.write("                    <input type=\"image\" src=\"img/eliminar3.jpg\"title=\"Eliminar\" width=\"40\" height=\"40\" alt=\"eliminar3\" onclick=\"javascript:document.getElementById('inputOp').value='4';\"/>\n");
      out.write("                    <input type=\"image\" src=\"img/limpiar.jpg\"title=\"Limpiar\" width=\"40\" height=\"40\" alt=\"limpiar\" onclick=\"javascript:document.getElementById('inputOp').value='5';\"/>\n");
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("</td>\n");
      out.write("             </tr>\n");
      out.write("             </table>\n");
      out.write("            </tbody>\n");
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
