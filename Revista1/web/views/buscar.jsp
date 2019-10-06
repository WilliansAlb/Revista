<%-- 
    Document   : buscar
    Created on : 6/10/2019, 03:06:07 PM
    Author     : yelbetto
--%>

<%@page import="Clases.Usuario"%>
<%@page import="Clases.Revista"%>
<%@page import="Base.Conectado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Busqueda</title>

        <link type="text/css" rel="stylesheet" href="../css/nav.css" />
        <link type="text/css" rel="stylesheet" href="../css/stylo.css" />
    </head>

    <body>
        <%
            HttpSession s = request.getSession();
        %>
        <%  Conectado c = new Conectado();
            String[] cat = c.categorias();
            String buscar = s.getAttribute("busquedas").toString();
        %>
        <%@include file="navbar1.jsp" %>
        <div name="izquierdo" id="izquierdo">
            <div id='moredat' name='moredat'>
                <center>
                    <h1>Buscar por</h1>
                    <form>
                        <input type="button" onclick="mostrar1()" class="add-to-cart" value="Categorias" id="creare"
                               name="creare" />
                    </form>
                </center>
                <center>
                    <div id="vista" name="vista">
                        <center>
                            <ul>
                                <% for (int i = 0; i < cat.length; i++) {
                                %>
                                <li id="categorias" name="categorias"><a href=""><%out.print(cat[i]);%></a></li>
                                    <%}%>
                            </ul>
                        </center>

                    </div>
                </center>

                <center>
                    <form>
                        <input type="button" onclick="mostrar()" class="add-to-cart" value="Fecha de publicacion"
                               id="creare" name="creare" />
                    </form>
                </center>
                <center>
                    <div id="alerta" name="alerta">
                        <center>
                            <ul>
                                <li id="categorias" name="categorias"><a href="">Lo de la semana</a></li>
                                <li id="categorias" name="categorias"><a href="">Hace un mes</a></li>
                                <li id="categorias" name="categorias"><a href="">Hace tres meses</a></li>
                                <li id="categorias" name="categorias"><a href="">El inicio de los tiempos</a></li>
                            </ul>
                        </center>
                    </div>
                </center>

                <center>
                    <form>
                        <input type="button" onclick="mostrar3()" class="add-to-cart" value="Precio" id="creare"
                               name="creare" />
                    </form>
                </center>
                <center>
                    <div id="alerta1" name="alerta1">
                        <center>
                            <ul>
                                <li id="categorias" name="categorias"><a href="">Mas de Q100</a></li>
                                <li id="categorias" name="categorias"><a href="">Menos de Q100</a></li>
                                <li id="categorias" name="categorias"><a href="">De Q50 a Q100</a></li>
                                <li id="categorias" name="categorias"><a href="">Menos de Q50</a></li>
                                <li id="categorias" name="categorias"><a href="">Menos de Q30</a></li>
                                <li id="categorias" name="categorias"><a href="">Menos de Q20</a></li>
                                <li id="categorias" name="categorias"><a href="">Menos de Q10</a></li>
                                <li id="categorias" name="categorias"><a href="">Gratis</a></li>
                            </ul>
                        </center>
                    </div>
                </center>

            </div>
        </div>
        <div name="central" id="central">
            <%if (c.busqueda(buscar,"a")) {%>
            <hr width="100%" />
            <center>
                <h2>
                    Revistas que coinciden
                </h2>
            </center>
            <hr width="100%" />
            <%if (c.busqueda(buscar, "r")){%>
            <div id="revistas" name="revistas" class="revistas">
                <%
                    Revista[] nuevo = c.nombreR(buscar);
                    for (int i = 0; i < nuevo.length; i++) {
                %>
                <center>
                    <div name="rev" id="rev" class="rev">
                        <center>
                            <img src="../img/revista1.png" width="90px" heigth="90px" alt="imagen del pdf">
                            <p><%out.print(nuevo[i].getRevista_name());%></p>
                            <p>Publicada: <%out.print(nuevo[i].getFecha_crea());%></p>
                            <p>Creada: <%out.print(nuevo[i].getId_creador());%></p>
                            <form>
                                <input type="button" onclick="mostrar1()" class="add-to-cart" value="Ver" id="creare"
                                       name="creare" />
                            </form>
                        </center>
                    </div>
                </center>
                <%}%>
            </div>
            <%} else {%>
            <h2>No hay ninguna revista con ese nombre</h2>
            <%}%>
            <hr width="100%" />
            <center>
                <h2>
                    Perfiles que coinciden
                </h2>
            </center>
            <hr width="100%" />
            <%if (c.busqueda(buscar, "u")){%>
            <div id="revistas" name="revistas" class="revistas">
                <%
                    
                    Usuario[] nuevou = c.nombreU(buscar);
                    for (int i = 0; i < nuevou.length; i++) {
                %>
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
                </center>
                            <%}
            } else {%>
            <h2>No hay ningun usuario con ese nombre</h2>
            <%}%>
            </div>
            <hr width="100%" />
            <%} else {%>
            <hr width="100%" />
            <center>
                <h2>
                    No hay nada en esta dimension que concuerde con su busqueda
                </h2>
            </center>
            <hr width="100%" />
            <%}%>
        </div>
        <div name="derecho" id="derecho">

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
            function mostrar3() {
                var x = document.getElementById('alerta1');
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
