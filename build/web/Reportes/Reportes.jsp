<%@page import="net.sf.jasperreports.engine.export.JRPdfExporter"%>
<%@page import="net.sf.jasperreports.engine.util.JRLoader"%>
<%@page import="net.sf.jasperreports.engine.*"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="conexion.ConexionSQLServer"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            response.setHeader("Cache-conrol", "no-cache");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
            response.setContentType("application/pdf");
            try {
                ServletOutputStream salida = response.getOutputStream();
                ConexionSQLServer conexionSQL = new ConexionSQLServer();
                Connection conexion = conexionSQL.conectar();
                Map parametro = new HashMap();
                parametro.put("id", Integer.parseInt(request.getParameter("idUsuario")));
                JasperReport reporte = (JasperReport) JRLoader.loadObject(getServletContext().getRealPath("Reportes/newReport.jasper"));
                JasperPrint jPrint=JasperFillManager.fillReport(reporte, parametro, conexion);
                JRExporter exportar = new JRPdfExporter();
                exportar.setParameter(JRExporterParameter.JASPER_PRINT, jPrint);   
                exportar.setParameter(JRExporterParameter.OUTPUT_STREAM, salida);
                exportar.exportReport();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        %>
    </body>
</html>
