package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menuprincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("        \n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"stylos/estilomenppal.css\"></link>\n");
      out.write("<title>Menu principal</title>\n");
      out.write("</head>\n");
      out.write("<body style=\"font-family: sans-serif;\">\n");
      out.write("\n");
      out.write("    <div class=\"menu\">      \n");
      out.write("    <div class=\"menudesplegable\">\n");
      out.write("    <ul  class=\"menudesplegable\">\n");
      out.write("        \n");
      out.write("        <table border=\"0\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th><img src=\"img/encabezado.png\" width=\"1200\" height=\"100\" alt=\"encabezado\"/>\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            </tbody>\n");
      out.write("        </table><br>\n");
      out.write("        <b>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"Motos.jsp\">Motos</a>\n");
      out.write("            <ul>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"\">Administrador</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"Usuarios.jsp\">Usuarios</a></li>\n");
      out.write("                <li><a href=\"Proyecto.jsp\">Partes y Repuestos</a></li>\n");
      out.write("                <li><a href=\"Fases.jsp\">Técnicos</a></li>\n");
      out.write("                <li><a href=\"menuprincipal.jsp\">Parámetros</a>\n");
      out.write("                            <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"TipoVehiculo.jsp\">Tipo Vehículo</a></li>\n");
      out.write("                            <li><a href=\"MarcaVehiculo.jsp\">Marca Vehículo</a></li>\n");
      out.write("                            <li><a href=\"ReferenciaVehiculo.jsp\">Referencias Vehículo</a></li>\n");
      out.write("                            <li><a href=\"Aseguradoras.jsp\">Aseguradoras</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li>\n");
      out.write("            <a href=\"\">Servicio Técnico</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"Clientes.jsp\">Clientes</a></li>\n");
      out.write("                <li><a href=\"Vehículos.jsp\">Vehículos</a></li>\n");
      out.write("                <li><a href=\"OrdenesdeServicio.jsp\">Ordenes de Servicio</a></li>\n");
      out.write("                <li><a href=\"OrdenesSalida.jsp\">Ordenes de Salida</a></li>\n");
      out.write("                <li><a href=\"ConsultaInformes.jsp\">Consultas e Informes</a>\n");
      out.write("                    <ul class=\"submenu\">\n");
      out.write("                        <li><a href=\"HojaVidaVehiculo.jsp\">Hoja de Vida Vehiculo</a></li>\n");
      out.write("                        <li><a href=\"EstadoOrdenServicio.jsp\">Estado Orden de Servicio</a></li>\n");
      out.write("                        <li><a href=\"ResumenTecnico.jsp\">Resumen por Técnico</a></li>\n");
      out.write("                        <li><a href=\"ResumenCliente.jsp\">Resumen por Cliente</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("                <li>\n");
      out.write("            <a href=\"\">Técnico taller</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"ActualizacionEstado.jsp\">Actualización Estado Ordenes</a></li>\n");
      out.write("                <li><a href=\"Asignacion.jsp\">Asignación Tareas o Partes</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("                        <li>\n");
      out.write("            <a href=\"\">Cliente</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"ConsultaInformes.jsp\">Consultas e Informes</a>\n");
      out.write("                    <ul class=\"submenu\">\n");
      out.write("                        <li><a href=\"HojaVidaVehiculo.jsp\">Hoja de Vida Vehículo</a></li>\n");
      out.write("                        <li><a href=\"EstadoOrdenServicio.jsp\">Estado Orden de Servicio</a></li>\n");
      out.write("                        <li><a href=\"ResumenCliente.jsp\">Resumen por Cliente</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("             </ul>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"ProgramacionHorario.jsp\">Preguntas, Quejas o Reclamos</a>\n");
      out.write("        </li>\n");
      out.write("               \n");
      out.write("        <b>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"login.jsp\">Salir</a>\n");
      out.write("            <ul>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </ul>\n");
      out.write("</div><br>\n");
      out.write("       \n");
      out.write("        <div class=\"fondoazul\">\n");
      out.write("        <table border=\"0\" width=\"1200\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th><div class=\"letrabienvenidos\"><h1><b> B i e n v e n i d o s <BR>\n");
      out.write("                        Servicio Técnico Cóndor<BR>\n");
      out.write("                        </b> </h1>\n");
      out.write("                    <th><img src=\"img/condor.jpg\" width=\"400\" height=\"370\" alt=\" \"/></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                </div>\n");
      out.write("                <tr>\n");
      out.write("                    <td>---------Copyright INGESOFT2 POLITECNICO, todos los derechos reservados-------Mayo 2016------- <br>\n");
      out.write("                         </td>  \n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table> \n");
      out.write("       \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
