<%-- 
    Document   : crear_usuario
    Created on : 25/09/2019, 17:28:01
    Author     : yelbetto
--%>

<%@page import="Clases.Versiones"%>
<%@page import="Clases.Revista"%>
<%@page import="Clases.Usuario"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Base.Conectado"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Document</title>
        <link type="text/css" rel="stylesheet" href="../css/nav.css" />
        <link type="text/css" rel="stylesheet" href="../css/cs1.css" />

    </head>

    <body>
        <script src="https://code.jquery.com/jquery-2.0.3.js"></script>
        <%
            HttpSession s = request.getSession();
        %>
        <%  Conectado c = new Conectado();
            Revista rev2 = c.nombreRevistas(Integer.parseInt(s.getAttribute("idrev").toString()));
            rev2.setId_revista(Integer.parseInt(s.getAttribute("idrev").toString()));
            rev2.setId_creador(s.getAttribute("idrev").toString());
            String[] cat = c.categorias();
            Usuario u = c.aspectos(s.getAttribute("idcrear").toString());
            u.setUser(s.getAttribute("idcrear").toString());
            s.setAttribute("creadorev", u);
            Versiones[] version = c.rellenandoV(rev2.getId_revista());
        %>
        <%@include file="navbar1.jsp" %>
        <div name="izquierdo" id="izquierdo">
            <div id="datosu" name='datosu'>
                <div class='imagenes'>
                    <img class='imagen' src='../ControladorIMG?user=${viendor.getId_creador()}'
                         alt='no hay' title="${viendor.getId_creador()}" height="85px" width="85px" />
                </div>
                <div class='info'>
                    <h2 id='usuario1' name='usuario1'>${viendor.getId_creador()}</h2>
                    <p id="nombre" name='nombre'>${creadorev.nombre}</p>
                    <p>Creador</p>
                </div>
            </div>
            <div id='moredat' name='moredat'>
                <center>
                    <h1>Datos de la revista</h1>
                    <div id="flex" name="flex">
                        <label>Descripcion</label>
                        <p id="justi" name="justi">${viendor.getDescripcion()}</p>

                    </div>
                    <div id="flex" name="flex">
                        <label>Costo de Suscripción</label>
                        <p>${viendor.getCosto()}</p>
                    </div>
                    <div id="flex" name="flex">
                        <label>Categoria</label>
                        <p>${viendor.getCategorias()}</p>
                    </div>
                    <div id="flex" name="flex">
                        <label>Fecha de publicación</label>
                        <p>${viendor.getFecha_crea()}</p>
                    </div>
                    <div id="flex" name="flex">
                        <label># de ediciones</label>
                        <p>tal tal tal</p>
                    </div>
                </center>

            </div>
        </div>
        <div name="central" id="central">
            <center>
                <h2>
                    Ediciones
                </h2>
            </center>
            <hr width="100%" />
            <%

            %>
            <div id="revistas" name="revistas" class="revistas">
                <center>
                    <% if (version.length > 0) {
                            for (int i = 0; i < version.length; i++) {
                    %>
                    <div name="rev" id="rev" class="rev">
                        <center>
                            <img src="../img/revista1.png" width="90px" heigth="90px" alt="imagen del pdf">
                            <p><%out.print(version[i].getVersion());%></p>
                            <p>Publicada: <%out.print(version[i].getFecha_pub());%></p>
                            <p>Comentario: <%out.print(version[i].getComentario());%></p>
                            <a href="../ControladorV?idrevista=<%out.print(version[i].getId_version());%>"><button>Ver</button></a>
                        </center>
                    </div>
                    <%}}%>
                </center>

            </div>
                    <% if (s.getAttribute("versiont")!=null){%>
                    <div id="vista" name="vista" style="display:block;">
                <center>
                    <h2>
                        ${versiont.getVersion()}
                    </h2>
                </center>
                <hr width="100%" />
                <center>
                    <embed
                        src="../ControladorPDF?idv=${versiont.getId_version()}#toolbar=0&navpanes=0&scrollbar=0"
                        type="application/pdf" width="60%" height="400px" />
                </center>
                <div id="divd" name="divd" style="background-color: brown">
                    ${versiont.getComentario()}
                </div>
                <h3>Reacciones</h3>
                <div class='comentarios1'>
                    <div class='informacion' name='informacion' id='informacion'>
                        <img class='imagen' src='../ControladorIMG?user=${usr.user}' alt='user desconocido' title="usuario"
                             height="40px" width="40px" />
                        Comentario hecho el -------
                    </div>
                    <textarea name="interes1" id="interes1" rows="5" cols="10"
                              readonly>Lorem ipsum dolor sit amet consectetur adipisicing elit. Temporibus ipsam optio, ratione eos rerum corrupti commodi explicabo quos laboriosam nisi es</textarea>
                </div>
                <div class='comentarios1'>
                    <div class='informacion' name='informacion' id='informacion'>
                        Comenta tú tambien
                    </div>
                    <textarea name="interes1" id="interes1" rows="5" cols="10" placeholder="Escribe algo chido">
                    </textarea>
                </div>
                             <%s.setAttribute("versiont",null);%>
            </div><%}%>
                <hr width="50%" style="margin:50px;"/>
        </div>
        <div name="derecho" id="derecho">
            <center>
                <form>
                    <input type="button" onclick="mostrar()" class="add-to-cart" value="Suscribete" id="creare"
                           name="creare" />
                </form>
            </center>

            <form action="../Pagos" method="POST" enctype="multipart/form-data">
                <center>
                    <div id="alerta">
                        <div class="group">
                            <label for="dinerito" class="label">Cuanto será el monto que pagaras?</label>
                            <input type="number" name="dinerito" id="dinerito" step="${viendor.getCosto()}" title="Al colocar cero la revista es gratis" min="0">
                        </div>
                        <%
                            Date dNow = new Date();
                            SimpleDateFormat ft
                                    = new SimpleDateFormat("yyyy-MM-dd");
                            String currentDate = ft.format(dNow);
                        %>

                        <div class="group">
                            <label for="start" class="label">Fecha de pago</label>
                            <input type="date" id="start" name="start" value="<%out.print(currentDate);%>" min="2008-01-01" max="<%out.print(currentDate);%>"
                                   required>
                        </div>
                        <div class="group">
                            <input type="submit" class="button" value="Pagar suscripcion">
                        </div>
                    </div>
                </center>
            </form>
            <center>
                <form>
                    <input type="button" onclick="mostrar2()" class="add-to-cart" value="Otras revistas del creador" id="creare"
                           name="creare" />
                </form>
            </center>

            <center>
                <div id="vista1" name="vista1" style="display: none;">
                    <%
                        String user12 = u.getUser();
                        int tiene = c.tieneRevistas(user12);
                        if (tiene != 0) {%>
                    <center>
                        <ul>
                            <%
                                int[] ids = c.nombreRevs(user12, tiene);
                                for (int i = 0; i < ids.length; i++) {
                                    Revista revs = c.nombreRevistas(u.getUser(), ids[i]);
                                    s.setAttribute("nombrever", revs);
                            %>
                            <li><a href="" >${nombrever.revista_name}</a></li>
                                <%} %>
                        </ul>
                    </center>
                    <%} else {%>
                    <h3>No tiene mas revistas publicadas</h3>
                    <%}%>
                </div>
            </center>
        </div>
        <script>
            function mostrarMensaje() {
                var popup = document.getElementById("myPopup");
                popup.classList.toggle("show");
            }
            window.addEventListener("load", mostrar);
            function mostrar() {
                var x = document.getElementById('alerta');
                if (x.style.display === 'none') {
                    x.style.display = 'block';
                } else {
                    x.style.display = 'none';
                }
            }
            function mostrar1() {
                var x = document.getElementById('vista');
                if (x.style.display === 'none') {
                    x.style.display = 'block';
                } else {
                    x.style.display = 'none';
                }
            }
            function mostrar2() {
                var x = document.getElementById('vista1');
                if (x.style.display === 'none') {
                    x.style.display = 'block';
                } else {
                    x.style.display = 'none';
                }
            }
        </script>
    </body>
</html>
