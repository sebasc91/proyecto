/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.sql.*;
import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.datos;

/**
 *
 * @author Administrador
 */
@WebServlet(name = "consultar", urlPatterns = {"/consultar"})
public class consultar extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            //se definen variables para conexion
            Connection conexion=null;
            //almacena la instruccion de la bd es decir select
            java.sql.Statement consulta=null;
            ResultSet resultado=null;
            
            //instanciar modelo datos
            datos h=new datos();
            h.setIdPrograma(Integer.parseInt (request.getParameter("idPrograma")));
             //llama el controlador jar, buscarlo ruta en prestaciones
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //llama ruta base de datos, buscarla en pestaña prestaciones
            String Ruta="jdbc:sqlserver://localhost:1433;"+"databaseName=prueba";
            //digitar datos de usuario creado en sql 2012
            conexion=DriverManager.getConnection(Ruta,"sa","sa");
            consulta= conexion.createStatement();
            //crear setencia sql  
            resultado=consulta.executeQuery("select* from Programas where idPrograma=("+h.getIdPrograma()+")");
            
            
            while(resultado.next()){
                
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet consultar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table>");
            out.println("<tr><td>"+resultado.getInt("idPrograma")+"</td>"+"<td>"+resultado.getString("NombrePrograma")+"</td></tr>");
            out.println("<h1>Servlet consultar " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            
            }
            
            
            /* TODO output your page here. You may use following sample code. */
           
        } catch(Exception e){
        out.println("Error de conexión"+e);
        
        }finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
