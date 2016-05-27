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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.GuardarSedes;
import modelo.GuardarUsuarios;
import modelo.MensajeError;

/**
 *
 * @author LUIS FERNANDO URREGO
 */
@WebServlet(name = "ServConsultarSedes", urlPatterns = {"/ServConsultarSedes"})
public class ServConsultarSedes extends HttpServlet {

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
            //se definen variables para conexion
            Connection conexion=null;
            //almacena la instruccion de la bd es decir select
            java.sql.Statement consulta=null;
            ResultSet resultado=null;
            RequestDispatcher rd = null;
            
            
            
            MensajeError mensaje = new MensajeError();
            rd = request.getRequestDispatcher("/Sedes.jsp");
            //Extraer el id del request
            String idConsulta = request.getParameter("idSede");
            
            int idConsultaInt=0;
            boolean filtroValido = true;
            try{
                //Convierte string a entero y genera error si no es entero
                idConsultaInt = Integer.parseInt(idConsulta);
            }catch(NumberFormatException ex){
                filtroValido = false;
            }
            
            if (!filtroValido){
                mensaje.setMensaje("El id ingresado no es valido");    
                request.setAttribute("mensaje", mensaje);
                rd.forward(request, response);
                
                
            }else{
                //instanciar modelo datos
                GuardarSedes h=new GuardarSedes();
                h.setIdSede(idConsultaInt);
            
                //llama el controlador jar, buscarlo ruta en prestaciones
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               //llama ruta base de datos, buscarla en pestaña prestaciones
               String Ruta="jdbc:sqlserver://localhost:1433;"+"databaseName=prueba";
               //digitar datos de usuario creado en sql 2012
               conexion=DriverManager.getConnection(Ruta,"sa","sa");
               consulta= conexion.createStatement();

               //crear setencia sql

               PreparedStatement prepStatement = conexion.prepareStatement("select * from Sedes where idSede = ?");
               prepStatement.setInt(1, h.getIdSede());
               resultado= prepStatement.executeQuery();
     

               GuardarSedes resultadoSede = new GuardarSedes();              
               //verifica si entra al ciclo
                   boolean encontrado = false;
                 
                   while(resultado.next()){
                   Integer res1 = resultado.getInt("idSede");
                   String res2 = resultado.getString("NombreSede");
                   String res3 = resultado.getString("DireccionSede");
                   
                   resultadoSede.setIdSede(res1);
                   resultadoSede.setNombreSede(res2);
                   resultadoSede.setDireccionSede(res3);
                   
                   request.setAttribute("sede", resultadoSede);
                   encontrado = true;
                   }

                   if(!encontrado)
                       mensaje.setMensaje("No se encontró");     

               request.setAttribute("mensaje", mensaje);
               rd.forward(request, response);
            }
        } catch(Exception e){
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
