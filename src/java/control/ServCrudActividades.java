/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ServCrudActividades", urlPatterns = {"/ServCrudActividades"})
public class ServCrudActividades extends HttpServlet {

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
              String op = request.getParameter("op");
              int opc = Integer.parseInt(op);
              GuardarActividades h=new GuardarActividades();
            
            switch(opc){
                case 1:
                    request.getRequestDispatcher("/ServInsertarActividades").forward(request, response); 
                break;        
               case 2:
                    request.getRequestDispatcher("/ServConsultarActividades").forward(request, response);
                break;    
                case 3:
                    request.getRequestDispatcher("/ServModificarActividades").forward(request, response);   
                break;
                 case 4:
                    request.getRequestDispatcher("/ServEliminarActividades").forward(request, response);   
                break;
                 case 5:
                    request.getRequestDispatcher("/ServLimpiarActividades").forward(request, response);   
                break;  
            }
               
            if  (opc==1)
            {
               
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServCrudActividades</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServCrudActividades at " + request.getContextPath() + "</h1>");
            out.println("<h1>" + h.TipoIdentificacion+ "</h1>");
            out.println("<h1>" + h.Identificacion+ "</h1>");
            out.println("<h1>" + h.Nombres+ "</h1>");
            out.println("<h1>" + h.Apellidos+ "</h1>");
            out.println("<h1>" + h.Direccion+ "</h1>");
            out.println("<h1>" + h.TelefonoFijo+ "</h1>");
            out.println("<h1>" + h.Celular+ "</h1>");
            out.println("<h1>" + h.Correo+ "</h1>");
            out.println("<h1>" + h.CodigoCiudad+ "</h1>");
            out.println("<h1>" + h.TipoTercero+ "</h1>");
            out.println("</body>");
            out.println("</html>");
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
