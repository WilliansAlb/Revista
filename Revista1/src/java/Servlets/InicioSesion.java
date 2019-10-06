/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.Usuario;
import Base.Conectado;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yelbetto
 */
@WebServlet("/InicioSesion")
@MultipartConfig(maxFileSize = 16177215)
public class InicioSesion extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   
        Usuario usuarios = new Usuario(request);
        Conectado cdb = new Conectado();
        if (cdb.ingreso(usuarios)) {
            HttpSession s = request.getSession();
            s.setAttribute("usuario", request.getParameter("user1"));
            s.setAttribute("usr", usuarios);
            response.sendRedirect("views/perfil.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usrname = request.getParameter("usrname");
        if (usrname!=null){
            response.sendRedirect("views/perfil.jsp");
        }
    }
}
