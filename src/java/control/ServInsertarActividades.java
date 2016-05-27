/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import conexion.ConexionSQLServer;
import java.io.IOException;
import java.io.PrintWriter;
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
import modelo.GuardarActividades;


@WebServlet(name = "ServInsertarActividades", urlPatterns = {"/ServInsertarActividades"})
public class ServInsertarActividades extends HttpServlet {

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
            java.sql.Statement insertar=null;
            ResultSet resultado=null;
            
            //instanciar modelo datos
            GuardarActividades h=new GuardarActividades();
            h.setTipoIdentificacion(request.getParameter("tipoIdentificacion"));
            h.setIdentificacion(Integer.parseInt(request.getParameter("identificacion")));
            h.setNombres(request.getParameter("nombres"));
            h.setApellidos(request.getParameter("apellidos"));
            h.setDireccion(request.getParameter("direccion"));
            h.setTelefonoFijo(request.getParameter("telefonoFijo"));
            h.setCelular(request.getParameter("celular"));
            h.setCorreo(request.getParameter("correo"));
            h.setCodigoCiudad(Integer.parseInt(request.getParameter("codigoCiudad")));
            h.setTipoTercero(Integer.parseInt(request.getParameter("tipoTercero")));
            
            /*
             //llama el controlador jar, buscarlo ruta en prestaciones
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //llama ruta base de datos, buscarla en pestaña prestaciones
            String Ruta="jdbc:sqlserver://localhost:1433;"+"databaseName=prueba";
            //digitar datos de usuario creado en sql 2012
            conexion=DriverManager.getConnection(Ruta,"sa","sa"); */
            
            ConexionSQLServer conexionSQLServer = new ConexionSQLServer();
            conexion = conexionSQLServer.conectar();
            
            insertar= conexion.createStatement();
            //crear setencia sql  
            String nombre = request.getParameter("Nombres");
            insertar.executeUpdate("insert into Clientes (TipoIdentificacion,Identificacion,Nombres,Apellidos,Direccion,TelefonoFijo,Celular,Correo,CodigoCiudad,TipoTercero) values ("+h.TipoIdentificacion+",'"+h.Identificacion+"','"+h.Nombres+"','"+h.Apellidos+"','"+h.Direccion+"','"+h.TelefonoFijo+"','"+h.Celular+"','"+h.Correo+"','"+h.CodigoCiudad+"','"+h.TipoTercero+"')");
            rd = request.getRequestDispatcher("/Clientes.jsp");
            request.setAttribute("clientes", null);
            rd.forward(request, response);
            
            }catch(NumberFormatException e){
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
            Logger.getLogger(ServInsertarActividades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServInsertarActividades.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ServInsertarActividades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServInsertarActividades.class.getName()).log(Level.SEVERE, null, ex);
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
