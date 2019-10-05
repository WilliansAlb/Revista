/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Base.Conectado;
import Clases.Usuario;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author yelbetto
 */
@WebServlet(name = "CrearUsuario", urlPatterns = {"/CrearUsuario"})
@MultipartConfig(maxFileSize = 16177215)
public class CrearUsuario extends HttpServlet {

     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Usuario usuarios = new Usuario(request);
        Conectado cdb = new Conectado();
        boolean paso = false;
        InputStream inputStream = null;
        if (request.getParameter("pass").equals(request.getParameter("pass2"))) {
            try {
                Part filePart = request.getPart("fichero");
                if (filePart.getSize() > 0) {
                    inputStream = filePart.getInputStream();
                    paso=true;
                }
            } catch (Exception ex) {
            }
        }

        
        HttpSession s = request.getSession();
        if (inputStream != null && paso) {
            usuarios.setArchivo(inputStream);
            cdb.crearConImg(usuarios);
            s.setAttribute("usr", cdb.aspectos(usuarios.getUser()));
            response.sendRedirect("views/perfil.jsp");
        } else {
            cdb.crear(usuarios);
            response.sendRedirect("views/perfil.jsp");
        }
        

    }
}
