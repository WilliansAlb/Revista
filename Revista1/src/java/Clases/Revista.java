/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.InputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yelbetto
 */
public class Revista {
    private String revista_name;
    private String categorias;
    private String descripcion;
    private double costo;
    private String id_creador;
    private String fecha_crea;
    private boolean reaccionar;
    private boolean suscripcion;
    private double costo_dia;
    InputStream archivopdf;
    private byte[] archivopdf2;
    private int id_revista;
    private boolean publicada;
    
    public Revista(){
    
    }
    
    public void rellenarRevista(HttpServletRequest request){
        HttpSession s = request.getSession();
        setRevista_name(request.getParameter("nombrer"));
        setDescripcion(request.getParameter("areat"));
        setCosto(Double.parseDouble(request.getParameter("dinerito").toString()));
        setFecha_crea(request.getParameter("start"));
        if (Integer.parseInt(request.getParameter("tipo"))==1){
            setReaccionar(true);
        } else {
            setReaccionar(false);
        }
        if (Integer.parseInt(request.getParameter("tipo2"))==1){
            setSuscripcion(true);
        } else {
            setSuscripcion(false);
        }
        setCategorias(request.getParameter("categoria"));
        setId_creador(s.getAttribute("usuario").toString());
    }

    public String getRevista_name() {
        return revista_name;
    }

    public void setRevista_name(String revista_name) {
        this.revista_name = revista_name;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getId_creador() {
        return id_creador;
    }

    public void setId_creador(String id_creador) {
        this.id_creador = id_creador;
    }

    public String getFecha_crea() {
        return fecha_crea;
    }

    public void setFecha_crea(String fecha_crea) {
        this.fecha_crea = fecha_crea;
    }

    public boolean isReaccionar() {
        return reaccionar;
    }

    public void setReaccionar(boolean reaccionar) {
        this.reaccionar = reaccionar;
    }

    public boolean isSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(boolean suscripcion) {
        this.suscripcion = suscripcion;
    }

    public double getCosto_dia() {
        return costo_dia;
    }

    public void setCosto_dia(double costo_dia) {
        this.costo_dia = costo_dia;
    }

    public InputStream getArchivopdf() {
        return archivopdf;
    }

    public void setArchivopdf(InputStream archivopdf) {
        this.archivopdf = archivopdf;
    }

    public byte[] getArchivopdf2() {
        return archivopdf2;
    }

    public void setArchivopdf2(byte[] archivopdf2) {
        this.archivopdf2 = archivopdf2;
    }

    public int getId_revista() {
        return id_revista;
    }

    public void setId_revista(int id_revista) {
        this.id_revista = id_revista;
    }

    public boolean isPublicada() {
        return publicada;
    }

    public void setPublicada(boolean publicada) {
        this.publicada = publicada;
    }
    
    
}
