/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Base.Conectado;
import Clases.Revista;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yelbetto
 */
public class Busqueda extends HttpServlet {

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
        HttpSession s = request.getSession();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Busqueda</title>");   
            out.println(s.getAttribute("invitacion"));
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Busqueda at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        HttpSession s = request.getSession();
        if (request.getParameter("user")!=null){
            if (request.getParameter("user").equalsIgnoreCase(s.getAttribute("usuario").toString())){
                response.sendRedirect("views/perfil.jsp");
            } else {
                String invitado = request.getParameter("user");
                s.setAttribute("invitacion", invitado);
                response.sendRedirect("views/perfili.jsp");
            }   
        }
        Conectado db = new Conectado();
        if (request.getParameter("revistar")!=null){
            int revista = Integer.parseInt(request.getParameter("revistar"));
            Revista revs = db.nombreRevistas(revista);
            if (s.getAttribute("usuario").equals(revs.getId_creador())){
                response.sendRedirect("views/perfil.jsp");
            } else {
                s.setAttribute("viendor", revs);
                s.setAttribute("idcrear", revs.getId_creador());
                s.setAttribute("idrev", revs.getId_revista());
                response.sendRedirect("views/perfil-rev.jsp");
            }
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
        HttpSession s =request.getSession();
        String bus = request.getParameter("buscar");
        s.setAttribute("busquedas", bus);  
        response.sendRedirect("views/buscar.jsp");
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
