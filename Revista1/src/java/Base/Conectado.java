/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import Clases.Excepciones;
import Clases.Revista;
import Clases.Usuario;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yelbetto
 */
public class Conectado {

    private final String user = "root";
    private final String password = "Cristeptesico_65";
    private final String urlConnection = "jdbc:mysql://localhost:3306/Revista";
    Connection db = null;
    PreparedStatement ps = null;

    public Conectado() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            db = DriverManager.getConnection(urlConnection, user, password);
        } catch (SQLException ex) {

        } catch (Exception e){
        
        }
    }

    public boolean ingreso(Usuario usuario) {
        int aceptar = 5;
        String sql = "SELECT COUNT(*) as total FROM Usuarios WHERE user_name= ? AND pass= ?";

        try {
            ps = db.prepareStatement(sql);
            ps.setString(1, usuario.getUser());
            ps.setString(2, usuario.getPassword());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                aceptar = rs.getInt("total");
            }
        } catch (SQLException ex) {

        }
        if (aceptar!=0){
            String sql2 = "SELECT * FROM Usuarios WHERE user_name= ?";
            try{
            ps = db.prepareStatement(sql2);
            ps.setString(1, usuario.getUser());
            ResultSet rs2 = ps.executeQuery();
            while(rs2.next()){
                usuario.setDescripcion(rs2.getString("descripcion"));
                usuario.setHobbies(rs2.getString("hobbies"));
                usuario.setInteres(rs2.getString("intereses"));
                usuario.setNombre(rs2.getString("nombre"));
                usuario.setTipo(rs2.getString("tipo"));
            }
            }catch(SQLException ex){
            
            }
        }
        return aceptar != 0;
    }

    
    public void crear(Usuario usuarios){
        String sql = "INSERT INTO Usuarios(user_name,nombre,tipo,pass) VALUES(?,?,?,?)";

        try {
            ps = db.prepareStatement(sql);
            ps.setString(1, usuarios.getUser());
            ps.setString(2, usuarios.getNombre());
            ps.setString(3, usuarios.getTipo());
            ps.setString(4, usuarios.getPassword());
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
    }
    
    public void crearConImg(Usuario usuarios){
        
        String sql= "INSERT INTO Usuarios(user_name,nombre,imagen,tipo,pass) VALUES(?,?,?,?,?)";

        try {
            ps = db.prepareStatement(sql);
            ps.setString(1, usuarios.getUser());
            ps.setString(2, usuarios.getNombre());
            ps.setBlob(3, usuarios.getArchivo());
            ps.setString(4, usuarios.getTipo());
            ps.setString(5, usuarios.getPassword());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            
        }
    }
    
    public void mostrarImg(String user, HttpServletResponse response) throws IOException{
        response.setContentType("/Image*");      
        InputStream input = null;
        OutputStream output = null;
        BufferedInputStream bufinput = null;
        BufferedOutputStream bufout = null;
       
        try{
            ps = db.prepareStatement("SELECT imagen FROM Usuarios WHERE user_name ='"+user+"'");
            ResultSet rs = ps.executeQuery();
            output = response.getOutputStream();            
            if (rs.next()){
                input = rs.getBinaryStream("imagen");
            }
            
            bufinput = new BufferedInputStream(input);
            bufout = new BufferedOutputStream(output);
            int i= 0;
            while((i=bufinput.read())!=-1){
                bufout.write(i);
            }
        }catch(SQLException e){
        }catch(Exception ex){
            PrintWriter s = response.getWriter();
            s.print(ex.getMessage());
        }   
    }
   
    public Usuario aspectos(String user){
        String sql = "SELECT * FROM Usuarios WHERE user_name= ?";
        Usuario nuevo = new Usuario();
        try{
            ps = db.prepareStatement(sql);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                nuevo.setDescripcion(rs.getString("descripcion"));
                nuevo.setHobbies(rs.getString("hobbies"));
                nuevo.setInteres(rs.getString("intereses"));
                nuevo.setTipo(rs.getString("tipo"));
                nuevo.setNombre(rs.getString("nombre"));
            }
        }catch(SQLException e){
        
        }
        return nuevo;
    }
    
    public String[] categorias(){
        String sql0 = "SELECT COUNT(*) AS total FROM Categorias";
        int total = 0;
        try{
            ps = db.prepareStatement(sql0);
            ResultSet rs1 = ps.executeQuery();
            while (rs1.next()){
                total = rs1.getInt("total");
            }
        } catch (SQLException es){
        
        }
        String sql = "SELECT nombre_cat FROM Categorias";
        String[] categorias = new String[total];
        int contador = 0;
        try{
            ps = db.prepareStatement(sql);
            ResultSet rs2 = ps.executeQuery();
            while (rs2.next()){
                categorias[contador] = rs2.getString("nombre_cat");
                contador++;
            }
        } catch (SQLException es){
        
        }
        return categorias;
    }

    public void crearRevista(Revista r){
        String sql0 = "SELECT id_categoria FROM Categorias WHERE nombre_cat = ?";
        int categoria = 0;
        try{
            ps = db.prepareStatement(sql0);
            ps.setString(1, r.getCategorias());
            ResultSet res = ps.executeQuery();
            while(res.next()){
                categoria = res.getInt("id_categoria");
            }
        } catch (SQLException esa){
        
        }
        
        String sql = "INSERT INTO Revistas(revista_name,categorias,descripcion,costo,id_creador,fecha_crea,publicada,reaccionar,suscripcion) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            ps = db.prepareStatement(sql);
            ps.setString(1, r.getRevista_name());
            ps.setInt(2,categoria);
            ps.setString(3, r.getDescripcion());
            ps.setDouble(4, r.getCosto());
            ps.setString(5, r.getId_creador());
            ps.setString(6, r.getFecha_crea());
            ps.setBoolean(7, false);
            ps.setBoolean(8, r.isReaccionar());
            ps.setBoolean(9, r.isSuscripcion());
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
    }
    
    public Connection getDb() {
        return db;
    }

    public void setDb(Connection db) {
        this.db = db;
    }
    
}
