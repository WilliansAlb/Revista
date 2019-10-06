<%-- 
    Document   : crear_usuario
    Created on : 25/09/2019, 17:28:01
    Author     : yelbetto
--%>

<%@page import="Base.Conectado"%>
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
        <%
            HttpSession s = request.getSession();
        %>
        <%  Conectado c = new Conectado();
            String[] cat = c.categorias();
        %>
        <%@include file="navbar1.jsp" %>
        <div name="izquierdo" id="izquierdo">
            <div id="datosu" name='datosu'>
                <div class='imagenes'>
                    <img class='imagen' src='../ControladorIMG?user=${usr.user}'
                         alt='no hay' title="${usr.user}" height="85px" width="85px" />
                </div>
                <div class='info'>
                    <h2 id='usuario1' name='usuario1'>${usr.user}</h2>
                    <p id="nombre" name='nombre'>${usr.nombre}</p>
                    <p>Creador</p>
                </div>
            </div>
            <div id='moredat' name='moredat'>
                <center>
                    <h1>Datos de la revista</h1>
                    <div id="flex" name="flex">
                        <label>Descripcion</label>
                        <p id="justi" name="justi">Acá irá toda la descripción Lorem ipsum dolor, sit amet consectetur
                            adipisicing elit. Possimus
                            praesentium repellendus consequuntur dicta facere laboriosam, vero aut sunt adipisci sed
                            ducimus.
                            Tempora nisi minus aperiam reiciendis accusantium? Atque, perspiciatis tempora?</p>

                    </div>
                    <div id="flex" name="flex">
                        <label>Costo de Suscripción</label>
                        <p>Q2132.00</p>
                    </div>
                    <div id="flex" name="flex">
                        <label>Categoria</label>
                        <p>Acá irá la categoria</p>
                    </div>
                    <div id="flex" name="flex">
                        <label>Fecha de publicación</label>
                        <p>1821-21-12</p>
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
            <hr width="80%" />
            <div id="revistas" name="revistas" class="revistas">
                <center>
                    <div name="rev" id="rev" class="rev">
                        <center>
                            <img src="../img/revista1.png" width="90px" heigth="90px" alt="imagen del pdf">
                            <p>${nombrerev.revista_name}</p>
                            <p>Publicada: ${nombrerev.publicada}</p>
                            <p>Creada: ${nombrerev.fecha_crea}</p>
                            <form>
                                <input type="button" onclick="mostrar1()" class="add-to-cart" value="Ver" id="creare"
                                       name="creare" />
                            </form>
                        </center>
                    </div>
                    <div name="rev" id="rev" class="rev">
                        <center>
                            <img src="../img/revista1.png" width="90px" heigth="90px" alt="imagen del pdf">
                            <p>${nombrerev.revista_name}</p>
                            <p>Publicada: ${nombrerev.publicada}</p>
                            <p>Creada: ${nombrerev.fecha_crea}</p>
                            <form>
                                <input type="button" onclick="mostrar1()" class="add-to-cart" value="Ver" id="creare"
                                       name="creare" />
                            </form>
                        </center>
                    </div>
                    <div name="rev" id="rev" class="rev">
                        <center>
                            <img src="../img/revista1.png" width="90px" heigth="90px" alt="imagen del pdf">
                            <p>${nombrerev.revista_name}</p>
                            <p>Publicada: ${nombrerev.publicada}</p>
                            <p>Creada: ${nombrerev.fecha_crea}</p>
                            <form>
                                <input type="button" onclick="mostrar1()" class="add-to-cart" value="Ver" id="creare"
                                       name="creare" />
                            </form>
                        </center>
                    </div>
                    <div name="rev" id="rev" class="rev">
                        <center>
                            <img src="../img/revista1.png" width="90px" heigth="90px" alt="imagen del pdf">
                            <p>${nombrerev.revista_name}</p>
                            <p>Publicada: ${nombrerev.publicada}</p>
                            <p>Creada: ${nombrerev.fecha_crea}</p>
                            <form>
                                <input type="button" onclick="mostrar1()" class="add-to-cart" value="Ver" id="creare"
                                       name="creare" />
                            </form>
                        </center>
                    </div>
                </center>

            </div>
            <div id="vista" name="vista">
                <center>
                    <h2>
                        Vista de la edicion
                    </h2>
                </center>
                <hr width="80%" />
                <center>
                    <embed
                        src="https://www.ucm.es/data/cont/docs/119-2014-02-19-Carroll.ATravesDelEspajo.pdf#toolbar=0&navpanes=0&scrollbar=0"
                        type="application/pdf" width="60%" height="400px" />
                </center>
                <div id="divd" name="divd" style="background-color: brown">
                    Lorem ipsum dolor, sit amet consectetur adipisicing elit. Architecto illum, quae, doloribus autem quidem
                    rem iusto dicta, incidunt provident corporis expedita quasi! Illum aut adipisci quos esse aliquid
                    veniam. Quibusdam!
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
            </div>
        </div>
        <div name="derecho" id="derecho">
            <form>
                <input type="button" onclick="mostrar()" class="add-to-cart" value="Suscribete por tan solo " id="creare"
                       name="creare" />
            </form>
            <form>
                <input type="button" onclick="mostrar()" class="add-to-cart" value="Otras revistas del creador" id="creare"
                       name="creare" />
            </form>
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
        </script>
    </body>
</html>
