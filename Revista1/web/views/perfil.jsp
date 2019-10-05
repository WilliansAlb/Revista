<%-- 
    Document   : perfil
    Created on : 15/09/2019, 21:16:54
    Author     : willians
--%>

<%@page import="Base.Conectado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link type="text/css" rel="stylesheet" href="css/estilo.css" />

    </head>

    <body>
        <%
            HttpSession s = request.getSession();
        %>
        <%  Conectado c = new Conectado(); 
            String[] cat = c.categorias();
        %>
        <%@include file='nav_bar.html'%>
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
            <center>
                <h2>
                    Tus revistas
                </h2>
            </center>
            <hr width="80%" />

            <center>
                <h2>
                    Ultimos comentarios
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
                    <img class='imagen' src='../ControladorIMG?user=${usr.user}'alt='user desconocido'
                         title="usuario" height="40px" width="40px" />
                    Comentario hecho en la publicacion de <a href="#">NOMBRE REVISTA</a> el -------
                </div>

                <textarea name="interes1" id="interes1" rows="5" cols="10"
                          readonly>Lorem ipsum dolor sit amet consectetur adipisicing elit. Temporibus ipsam optio, ratione eos rerum corrupti commodi explicabo quos laboriosam nisi es</textarea>
            </div>
        </div>
        <div id="derecho" name="derecho">
            <center>
                
            <form>
                <input type="button" onclick="mostrar()" class="add-to-cart" value="Crear una revista" />
            </form>
            <div id="alerta">
                <div class="group">
                    <label for="nombrer" class="label">Ponle nombre a tu revista</label>
                    <input id="nombrer" name="nombrer" type="text" class="input" required>
                </div>
                <div class="group">
                    <label for="areat" class="label">Escribe una descripcion de tu revista</label>
                    <textarea id="areat" name="areat" rows="3" cols="12" required></textarea>
                </div>
                <div class="group">
                    <label for="dinerito" class="label">Costo de suscripcion (0=free)</label>
                    <input type="number" name="dinerito" min="0" max="1000">
                </div>
                <div class="group">
                    <label for="archivo1" class="label">Selecciona la revista</label>
                    <input id="archivo1" name="archivo1" type="file" class="input" required>
                </div>
                <div class="group">
                    <label for="start" class="label">Fecha de publicacion</label>
                    <input type="date" id="start" name="start" value="2019-10-09" min="2008-01-01" max="2019-10-09"
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
                        <% for (int i=0; i<cat.length;i++){
                        %>
                        <option><% out.print(cat[i]);%></option>
                        <%}%>
                    </select>
                </div>
                <div class="group">
                     <input type="submit" class="button" value="Crear revista">
                </div>
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
                         </script>

        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.stellar.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
