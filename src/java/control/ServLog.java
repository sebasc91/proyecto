/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;
import conexion.ConexionSQLServer;
import java.sql.*;
import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Login;





/**
 *
 * @author LUIS FERNANDO URREGO
 */
@WebServlet(name = "ServLog", urlPatterns = {"/ServLog"})
public class ServLog extends HttpServlet {
    
    
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
             boolean existeUsuario = false;
            //se definen variables para conexion
            Connection conexion=null;
            //almacena la instruccion de la bd es decir select
            java.sql.Statement consulta=null;
            ResultSet Login=null;
            
            //instanciar modelo datos
            Login h=new Login();
            
            /*****************************************************************/
            /******* clase conexión*/
            h.setNombreUsuario(request.getParameter("usuario"));
            h.setPassword(request.getParameter("password"));
//             //llama el controlador jar, buscarlo ruta en prestaciones
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            //llama ruta base de datos, buscarla en pestaña prestaciones
//            String Ruta= "jdbc:sqlserver://localhost:1433;"+"databaseName=prueba";
//            //digitar datos de usuario creado en sql 2012
//            conexion=DriverManager.getConnection(Ruta,"sa","sa");
            
            ConexionSQLServer conexionSQLServer = new ConexionSQLServer();
            conexion = conexionSQLServer.conectar();
            /*****************************************************************/
            
            /*****************************************************************/
            /********* clase dao */
            consulta= conexion.createStatement();
           
            Login=consulta.executeQuery("select* from Usuarios where (NombreUsuario='"+h.getNombreUsuario()+"' and Password='"+h.getPassword()+"')");
            
            String Usuario="";
            String Password="";
            while(Login.next()){
                //En caso de existir una coincidencia
                existeUsuario = true;
                // reemplaza los atributos de dicho Usuario
                Usuario = Login.getString("NombreUsuario");
                Password = Login.getString("Password");
            }
            /*****************************************************************/
 
            conexionSQLServer.desconectar(conexion);
            out.print(existeUsuario);
            if(existeUsuario){
                out.print("Usuario es valido");
                request.setAttribute("error", null);
                //Para el usuario existente:
                //Reemplazo atributos que se obtienen desde el jsp
                request.setAttribute("Nombre", h.getNombreUsuario());
                request.setAttribute("Password", h.getPassword());
                //Envío estos atributos a la página principal.jsp
                request.getRequestDispatcher("/menuprincipal.jsp").forward(request, response);
            }else{
                //De lo contrario vamos a la página errorLogin.jsp
                request.setAttribute("error", "error de autenticación.");
                  out.print("Usuario es invalido");
                  request.getRequestDispatcher("/login.jsp").forward(request, response);
                  
            }       
            
            
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
            Logger.getLogger(ServLog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServLog.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ServLog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServLog.class.getName()).log(Level.SEVERE, null, ex);
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

    private static class con {

        private static PreparedStatement prepareStatement(Statement consulta) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public con() {
        }
    }

}
