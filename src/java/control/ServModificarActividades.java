/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.GuardarActividades;

/**
 *
 * @author LUIS FERNANDO URREGO
 */
@WebServlet(name = "ServModificarActividades", urlPatterns = {"/ServModificarActividades"})
public class ServModificarActividades extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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
            RequestDispatcher rd = null;
            //se definen variables para conexion
            Connection conexion=null;
            //almacena la instruccion de la bd es decir select
            java.sql.Statement modificar=null;
            ResultSet resultado=null;
            
            //instanciar modelo datos
            GuardarActividades h=new GuardarActividades();
            h.setIdActividad(Integer.parseInt(request.getParameter("idActividad")));
            h.setActividadProyecto(request.getParameter("ActividadProyecto"));
            h.setActividadAprendizaje(request.getParameter("ActividadAprendizaje"));
            /*
            //llama el controlador jar, buscarlo ruta en prestaciones
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //llama ruta base de datos, buscarla en pestaña prestaciones
            String Ruta="jdbc:sqlserver://localhost:1433;"+"databaseName=prueba";
            //digitar datos de usuario creado en sql 2012
            conexion=DriverManager.getConnection(Ruta,"sa","sa");*/
            
            
            modificar= conexion.createStatement();
            //crear setencia sql  
            String nombre = request.getParameter("ActividadProyecto");          
            modificar.executeUpdate("update Actividades set ActividadProyecto = '"+h.ActividadProyecto+"',ActividadAprendizaje = '"+h.ActividadAprendizaje+"' where idActividad = '"+h.idActividad+"'");
            rd = request.getRequestDispatcher("/Actividades.jsp");
            request.setAttribute("actividad", resultado);
            rd.forward(request, response);
           
        }catch(Exception e){
        out.println("Error de conexión"+e);
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
