<header id='hola' name='hola'>
    <nav class="listado2">
        <ul class="listado1">
            <li class="enlace1"><a href="#">Inicio</a></li>
            <li class="enlace1"><a href="perfil.jsp" id="pad" name="pad"><div name="probando" id="probando">
                        <img src="../ControladorIMG?user=${usr.user}"
                             width="40px" height="40px" id="foto" name="foto"/>Perfil
                    </div></a></li>
            <li class="enlace1"><a href="#">Categorias</a>
                <ul>
                    <% for (int i = 0; i < cat.length; i++) {
                    %>
                    <li><a href=""><%out.print(cat[i]);%></a></li>
                    <%}%>
                </ul>
            </li>
            <form name="formbuscar" id="formbuscar" action="../Busqueda" method="POST">
                <input type="text" name="buscar" id="buscar" placeholder="Que buscas?">
                <button type="submit" name="buscarb" id="buscarb" class="botonimagen"></button> 
            </form>
        </ul>
    </nav>
</header>