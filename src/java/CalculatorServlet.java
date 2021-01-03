/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import compute.Computation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dilip J Sarvaiya
 */
@WebServlet(urlPatterns = {"/CalculatorServlet"})
public class CalculatorServlet extends HttpServlet {
    @EJB Computation obj;
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html><head><title>Answer | Dilip Sarvaiya</title>"
                    + "<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /></head>"
                    + "<body>");               
            double amt = Double.parseDouble(request.getParameter("amt"));
            if(request.getParameter("type").equals("r2d")) {
                out.println("<div  style=\"padding-top:10px;float:left;width:500px;\" class=\"container\">");
                out.println("<div class=\"alert alert-success\" role=\"alert\"> "+amt+" Rupees = "+obj.r2Dollor(amt)+" Dollors");
                out.println("</div>");
            }
            if(request.getParameter("type").equals("d2r"))
            {
                out.println("<div  style=\"padding-top:10px;float:left;width:500px;\" class=\"container\">");
                out.println("<div class=\"alert alert-success\" role=\"alert\"> "+amt+" Dollors = "+obj.d2Rupees(amt)+" Rupees");
                out.println("</div>");
            }
             out.println("</body></html>");
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
