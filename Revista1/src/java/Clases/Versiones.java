/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.InputStream;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yelbetto
 */
public class Versiones {
    private int id_version;
    private String version;
    InputStream version1;
    private byte[] version2;
    private String fecha_pub;
    private String comentario;
    
    public Versiones(){
    
    }
    
    public void rellenarVersion(HttpServletRequest request){
        HttpSession s = request.getSession();
        setVersion(request.getParameter("nombrer1"));
        setComentario(request.getParameter("areat1"));
        setFecha_pub(request.getParameter("start1"));
    }

    public int getId_version() {
        return id_version;
    }

    public void setId_version(int id_version) {
        this.id_version = id_version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public InputStream getVersion1() {
        return version1;
    }

    public void setVersion1(InputStream version1) {
        this.version1 = version1;
    }

    public byte[] getVersion2() {
        return version2;
    }

    public void setVersion2(byte[] version2) {
        this.version2 = version2;
    }

    public String getFecha_pub() {
        return fecha_pub;
    }

    public void setFecha_pub(String fecha_pub) {
        this.fecha_pub = fecha_pub;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
}
