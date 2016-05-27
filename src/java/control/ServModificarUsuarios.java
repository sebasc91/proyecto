/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.GuardarUsuarios;

/**
 *
 * @author LUIS FERNANDO URREGO
 */
@WebServlet(name = "ServModificarUsuarios", urlPatterns = {"/ServModificarUsuarios"})
public class ServModificarUsuarios extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
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
            GuardarUsuarios h=new GuardarUsuarios();
            h.setIdUsuario(Integer.parseInt(request.getParameter("idUsuario")));
            h.setNombreUsuario(request.getParameter("NombreUsuario"));
            h.setNombre(request.getParameter("Nombre"));
            h.setApellidos(request.getParameter("Apellidos"));
            h.setCorreo(request.getParameter("Correo"));
            h.setPassword(request.getParameter("Password"));
            h.setPerfil(request.getParameter("Perfil"));
          //  h.setIdPerfil(Integer.parseInt(request.getParameter("IdPerfil")));
            //llama el controlador jar, buscarlo ruta en prestaciones
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //llama ruta base de datos, buscarla en pestaña prestaciones
            String Ruta="jdbc:sqlserver://localhost:1433;"+"databaseName=prueba";
            //digitar datos de usuario creado en sql 2012
            conexion=DriverManager.getConnection(Ruta,"sa","sa");
            modificar= conexion.createStatement();
            //crear setencia sql  
            String nombre = request.getParameter("NombreUsuario");
            
            modificar.executeUpdate("update Usuarios set NombreUsuario = '"+h.NombreUsuario+"',Nombre = '"+h.Nombre+"',Apellidos = '"+h.Apellidos+"' ,Correo ='"+h.Correo+"',Password = '"+h.Password+"' where idUsuario = '"+h.idUsuario+"'");
        
            
            rd = request.getRequestDispatcher("/Usuarios.jsp");
            request.setAttribute("usuario", resultado);
            rd.forward(request, response);
           
          
        }catch(Exception e){
        out.println("Error de conexión"+e);
        } finally {
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServModificarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServModificarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServModificarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServModificarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
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
