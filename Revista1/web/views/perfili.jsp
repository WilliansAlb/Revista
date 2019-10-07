<%-- 
    Document   : perfili
    Created on : 6/10/2019, 06:10:19 PM
    Author     : yelbetto
--%>

<%@page import="Clases.Usuario"%>
<%@page import="Base.Conectado"%>
<%@page import="Clases.Revista"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            HttpSession s = request.getSession();
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil de <%out.print(s.getAttribute("invitacion"));%></title>
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
        
        <%  Conectado c = new Conectado();
            Usuario u = c.aspectos(s.getAttribute("invitacion").toString());
            u.setUser(s.getAttribute("invitacion").toString());
            s.setAttribute("in", u);
            String[] cat = c.categorias();
        %>
        <%@include file='navbar1.jsp'%>
        <div id='izquierdo' name='izquierdo'>
            <div id="datosu" name='datosu'>
                <div class='imagenes'>
                    <img class='imagen' src='../ControladorIMG?user=${in.user}' alt='no hay'
                         title="${in.user}" height="85px" width="85px" />
                </div>
                <div class='info'>
                    <h2 id='usuario1' name='usuario1'>${in.user}</h2>
                    <p id="nombre" name='nombre'>${in.nombre}</p>
                </div>
            </div>
            <div id='moredat' name='moredat'>
                <label for="interes">Descripcion</label>
                <textarea name="interes" id="interes" rows="3" cols="10"
                          readonly>${in.descripcion}</textarea>
            </div>
            <div id='moredat' name='moredat'>
                <label for="gustos">¿Cuáles son tus intereses?</label>
                <textarea name="interes" id="interes" rows="3" cols="10"
                          readonly>${in.interes}</textarea>
            </div>
            <div id='moredat' name='moredat'>
                <label for="gustos">¿Tienes hobbies?</label>
                <textarea name="interes" id="interes" rows="3" cols="10"
                          readonly>${in.hobbies}</textarea>
            </div>
        </div>
        <div id='central' name='central'>
            <% String user12 = s.getAttribute("invitacion").toString();
                int tiene = c.tieneRevistas(user12);
                if (tiene != 0) {
                    int[] ids = c.nombreRevs(user12, tiene);
            %>
            <center>
                <h2>
                    Sus revistas
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
                <c:if test="${in.tipo == 'E'}">
                    <h1>Editor</h1>
                </c:if> 
                <c:if test="${in.tipo == 'S'}">
                    <h1>Suscriptor</h1>
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
