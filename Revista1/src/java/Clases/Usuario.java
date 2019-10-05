/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author yelbetto
 */
public class Usuario {
    private String user;
    private String password;
    private String nombre;
    private String interes;
    private String hobbies;
    private String descripcion;
    private String tipo;
    private byte[] imagen;
    InputStream archivo;
    
    public Usuario(HttpServletRequest request){
        if (request.getParameter("user1")!=null && request.getParameter("pass1")!=null){
            user = request.getParameter("user1");
            password = request.getParameter("pass1");
        } else {
            user = request.getParameter("user");
            password = request.getParameter("pass");
            nombre = request.getParameter("nombre");
            if (request.getParameter("tipo").equalsIgnoreCase("s")){
            tipo = "S";
            } else {
            tipo = "E";
            }
        }
    }

    public Usuario() {
        
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public InputStream getArchivo() {
        return archivo;
    }

    public void setArchivo(InputStream archivo) {
        this.archivo = archivo;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
