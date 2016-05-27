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
import modelo.GuardarFases;

/**
 *
 * @author LUIS FERNANDO URREGO
 */
@WebServlet(name = "ServCrudFases", urlPatterns = {"/ServCrudFases"})
public class ServCrudFases extends HttpServlet {

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
              GuardarFases h=new GuardarFases();
            
            switch(opc){
                case 1:
                    request.getRequestDispatcher("/ServInsertarFases").forward(request, response); 
                break;        
                case 2:
                    request.getRequestDispatcher("/ServConsultarFases").forward(request, response);
                break;    
                case 3:
                    request.getRequestDispatcher("/ServModificarFases").forward(request, response);   
                break;
                 case 4:
                    request.getRequestDispatcher("/ServEliminarFases").forward(request, response);   
                break;
                 case 5:
                    request.getRequestDispatcher("/ServLimpiarFases").forward(request, response);   
                break;   
            }
               
            if  (opc==2)
            {
               
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServCrudFases</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServCrudFases at " + request.getContextPath() + "</h1>");
            out.println("<h1>" + h.idFase+ "</h1>");
            out.println("<h1>" + h.NombreFase+ "</h1>");
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
