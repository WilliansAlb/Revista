<%-- 
    Document   : perfil
    Created on : 15/09/2019, 21:16:54
    Author     : willians
--%>

<%@page import="Clases.Revista"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="Base.Conectado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel='stylesheet' href='estructura.css'>
        <link rel='stylesheet' href='../css/estilo.css'>
        
        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700%7CMuli:400,700" rel="stylesheet">

        <!-- Bootstrap -->

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- Custom stlylesheet -->
        <link rel='stylesheet' href='../css/nav.css'>

    </head>

    <body>
        <%
            HttpSession s = request.getSession();
        %>
        <%  Conectado c = new Conectado();
            String[] cat = c.categorias();
        %>
        <%@include file='navbar1.jsp'%>
        <div id='izquierdo' name='izquierdo'>
            <div id="datosu" name='datosu'>
                <div class='imagenes'>
                    <img class='imagen' src='../ControladorIMG?user=${usr.user}' alt='no hay'
                         title="${usr.user}" height="85px" width="85px" />
                </div>
                <div class='info'>
                    <h2 id='usuario1' name='usuario1'>${usr.user}</h2>
                    <p id="nombre" name='nombre'>${usr.nombre}</p>
                    <button class='botoncin'>Editar Perfil</button>
                </div>
            </div>
            <div id='moredat' name='moredat'>
                <label for="interes">Descripcion</label>
                <textarea name="interes" id="interes" rows="3" cols="10"
                          readonly>${usr.descripcion}</textarea>
            </div>
            <div id='moredat' name='moredat'>
                <label for="gustos">¿Cuáles son tus intereses?</label>
                <textarea name="interes" id="interes" rows="3" cols="10"
                          readonly>${usr.interes}</textarea>
            </div>
            <div id='moredat' name='moredat'>
                <label for="gustos">¿Tienes hobbies?</label>
                <textarea name="interes" id="interes" rows="3" cols="10"
                          readonly>${usr.hobbies}</textarea>
            </div>
        </div>
        <div id='central' name='central'>
            <% String user12 = s.getAttribute("usuario").toString();
                int tiene = c.tieneRevistas(user12);
                if (tiene != 0) {
                    int[] ids = c.nombreRevs(user12, tiene);
            %>
            <center>
                <h2>
                    Tus revistas
                </h2>
            </center>
            <hr width="80%" />
            <div id="revistas" name="revistas" class="revistas">
                <%
                    for (int i = 0; i < ids.length; i++) {
                        Revista revs = c.nombreRevistas(user12, ids[i]);
                        s.setAttribute("nombrerev", revs);
                %>
                <center>
                    <div name="rev" id="rev" class="rev">
                        <img src="../img/revista1.png" width="90px" heigth="90px" alt="imagen del pdf">
                        <p>${nombrerev.revista_name}</p>
                        <p>Publicada: ${nombrerev.publicada}</p>
                        <p>Creada: ${nombrerev.fecha_crea}</p>
                        <a href="www.google.com">Agregar nueva edicion</a>
                        <a href="www.google.com">Ver ediciones</a>
                    </div>
                </center>
                <%}%>
            </div>
            <%
            } else {%>
            <center>
                <h3>¿Qué esperas para publicar una revista?</h3>
                <hr width="80%" />
            </center>
            <%}%>
            <center>
                <h2>
                    Ultimos comentarios hechos por ti
                </h2>
            </center>
            <hr width="80%" />
            <!-- /comentario creado por mí -->
            <div class='comentarios1'>
                <div class='informacion' name='informacion' id='informacion'>
                    <img class='imagen' src='../ControladorIMG?user=${usr.user}' alt='user desconocido'
                         title="usuario" height="40px" width="40px" />
                    Comentario hecho en la publicacion de <a href="#">NOMBRE REVISTA</a> el -------
                </div>
                <textarea name="interes1" id="interes1" rows="5" cols="10"
                          readonly>Lorem ipsum dolor sit amet consectetur adipisicing elit. Temporibus ipsam optio, ratione eos rerum corrupti commodi explicabo quos laboriosam nisi es</textarea>
            </div>
                         <!-- /comentario creado por mí -->
            <div class='comentarios1'>
                <div class='informacion' name='informacion' id='informacion'>
                    <img class='imagen' src='../ControladorIMG?user=${usr.user}' alt='user desconocido'
                         title="usuario" height="40px" width="40px" />
                    Comentario hecho en la publicacion de <a href="#">NOMBRE REVISTA</a> el -------
                </div>
                <textarea name="interes1" id="interes1" rows="5" cols="10"
                          readonly>Lorem ipsum dolor sit amet consectetur adipisicing elit. Temporibus ipsam optio, ratione eos rerum corrupti commodi explicabo quos laboriosam nisi es</textarea>
            </div>
        </div>
        <div id="derecho" name="derecho">
            <center>
                <c:if test="${usr.tipo == 'E'}">
                    <form>
                        <input type="button" onclick="mostrar()" class="add-to-cart" value="Crear una revista" id="creare" name="creare"/>
                    </form>
                    <form action="../ControladorPDF" method="POST" enctype="multipart/form-data">
                        <div id="alerta">
                            <div class="group">
                                <label for="nombrer" class="label">Ponle nombre a tu revista</label>
                                <input id="nombrer" name="nombrer" type="text" class="input" required>
                            </div>
                            <div class="group">
                                <label for="areat" class="label">Escribe una descripcion:</label>
                                <textarea id="areat" name="areat" rows="3" cols="10" required></textarea>
                            </div>
                            <div class="group">
                                <label for="dinerito" class="label">Precio suscripcion:</label>
                                <input type="number" name="dinerito" id="dinerito" step="any" title="Al colocar cero la revista es gratis">
                            </div>
                            <div class="group">
                                <label for="archivo1" class="label">Selecciona la primera edición</label>
                                <input id="archivo1" name="archivo1" type="file" required>
                            </div>
                            <%
                                Date dNow = new Date();
                                SimpleDateFormat ft
                                        = new SimpleDateFormat("yyyy-MM-dd");
                                String currentDate = ft.format(dNow);
                            %>

                            <div class="group">
                                <label for="start" class="label">Fecha de publicacion</label>
                                <input type="date" id="start" name="start" value="<%out.print(currentDate);%>" min="2008-01-01" max="<%out.print(currentDate);%>"
                                       required>
                            </div>
                            <div class="group">
                                <label for="tipo" class="label">Bloquear reacciones ?</label>
                                <input type="radio" name="tipo" id="tipo" value="1">Sí
                                <input type="radio" name="tipo" id="tipo" value="0">No
                            </div>
                            <div class="group">
                                <label for="tipo2" class="label">Permitir suscripciones ?</label>
                                <input type="radio" name="tipo2" id="tipo2" value="1">Sí
                                <input type="radio" name="tipo2" id="tipo2" value="0">No
                            </div>
                            <div class="group">
                                <label for="categoria" class="label">Cual es la categoria ?</label>
                                <select name="categoria" id="categoria">
                                    <% for (int i = 0; i < cat.length; i++) {
                                    %>
                                    <option value="<% out.print(cat[i]);%>"><% out.print(cat[i]);%></option>
                                    <%}%>
                                </select>
                            </div>
                            <div class="group">
                                <input type="submit" class="button" value="Solicitar publicación">
                            </div>
                        </div>        
                    </form>
                    <form>
                        <input type="button" onclick="mostrar1()" class="add-to-cart" value="Agregar edicion nueva" id="creare" name="creare"/>
                    </form>
                    <form action="" method="POST" enctype="multipart/form-data">
                        <div id="alerta1">
                            <%if (tiene > 0) {%>
                            <div class="group">
                                <label for="revistal" class="label">Para que revista?</label>
                                <select name="revistal" id="revistal">

                                    <%
                                        int[] ids = c.nombreRevs(user12, tiene);
                                        for (int i = 0; i < ids.length; i++) {
                                            Revista revs = c.nombreRevistas(user12, ids[i]);
                                            s.setAttribute("nombrerev", revs);
                                    %>
                                    <option value="<%out.print(ids[i]);%>">${nombrerev.revista_name}</option>
                                    <%}%>
                                </select>
                            </div>
                            <div class="group">
                                <label for="nombrer1" class="label">Ponle nombre a la edicion</label>
                                <input id="nombrer1" name="nombrer1" type="text" class="input" required>
                            </div>
                            <div class="group">
                                <label for="areat1" class="label">Escribe a la descripcion</label>
                                <textarea id="areat1" name="areat1" rows="3" cols="12" required></textarea>
                            </div>
                            <div class="group">
                                <label for="archivo2" class="label">Selecciona la revista</label>
                                <input id="archivo2" name="archivo2" type="file" class="input">
                            </div>
                            <div class="group">
                                <label for="start1" class="label">Fecha de publicacion</label>
                                <input type="date" id="start1" name="start1" value="<%out.print(currentDate);%>" min="2008-01-01" max="<%out.print(currentDate);%>"
                                       required>
                            </div>
                            <div class="group">
                                <input type="submit" class="button" value="Publicar edicion">
                            </div>
                            <%} else {%>
                            <h3>NO HAS CREADO NINGUNA REVISTA</h3>
                            <%}%>
                        </div>        
                    </form>
                </c:if> 
                <c:if test="${usr.tipo == 'S'}">
                    <form>
                        <input type="button" class="add-to-cart" value="Quieres ser editor?" id="creare" name="creare"/>
                    </form>
                </c:if>
                <button>
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
                var x = document.getElementById('alerta1');
                if (x.style.display === 'none') {
                    x.style.display = 'block';
                } else {
                    x.style.display = 'none';
                }
            }
        </script>

        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.stellar.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
