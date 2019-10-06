package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Base.Conectado;

public final class perfil_002drev_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/views/navbar1.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"../css/nav.css\" />\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"../css/cs1.css\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");

            HttpSession s = request.getSession();
        
      out.write("\n");
      out.write("        ");
  Conectado c = new Conectado();
            String[] cat = c.categorias();
        
      out.write("\n");
      out.write("    ");
      out.write("<header id='hola' name='hola'>\n");
      out.write("    <nav>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"#\">Inicio</a></li>\n");
      out.write("            <li><a href=\"perfil.jsp\" id=\"pad\" name=\"pad\"><div name=\"probando\" id=\"probando\">\n");
      out.write("                        <img src=\"../ControladorIMG?user=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usr.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                             width=\"40px\" height=\"40px\" id=\"foto\" name=\"foto\"/>Perfil\n");
      out.write("                    </div></a></li>\n");
      out.write("            <li><a href=\"#\">Categorias</a>\n");
      out.write("                <ul>\n");
      out.write("                    ");
 for (int i = 0; i < cat.length; i++) {
                    
      out.write("\n");
      out.write("                    <li><a href=\"\">");
out.print(cat[i]);
      out.write("</a></li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <form name=\"formbuscar\" id=\"formbuscar\">\n");
      out.write("                <input type=\"text\" name=\"buscar\" id=\"buscar\" placeholder=\"Que buscas?\">\n");
      out.write("                <button type=\"submit\" name=\"buscarb\" id=\"buscarb\" class=\"botonimagen\"></button> \n");
      out.write("            </form>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("</header>");
      out.write("\n");
      out.write("    <div name=\"izquierdo\" id=\"izquierdo\">\n");
      out.write("        <div id=\"datosu\" name='datosu'>\n");
      out.write("            <div class='imagenes'>\n");
      out.write("                <img class='imagen' src='https://i.pinimg.com/564x/d5/05/26/d505267763f981dce971bd015320ae27.jpg'\n");
      out.write("                    alt='no hay' title=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usr.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" height=\"85px\" width=\"85px\" />\n");
      out.write("            </div>\n");
      out.write("            <div class='info'>\n");
      out.write("                <h2 id='usuario1' name='usuario1'>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usr.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                <p id=\"nombre\" name='nombre'>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usr.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                <p>Creador</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id='moredat' name='moredat'>\n");
      out.write("            <center>\n");
      out.write("                <h1>Datos de la revista</h1>\n");
      out.write("                <div id=\"flex\" name=\"flex\">\n");
      out.write("                    <label>Descripcion</label>\n");
      out.write("                    <p id=\"justi\" name=\"justi\">Acá irá toda la descripción Lorem ipsum dolor, sit amet consectetur\n");
      out.write("                        adipisicing elit. Possimus\n");
      out.write("                        praesentium repellendus consequuntur dicta facere laboriosam, vero aut sunt adipisci sed\n");
      out.write("                        ducimus.\n");
      out.write("                        Tempora nisi minus aperiam reiciendis accusantium? Atque, perspiciatis tempora?</p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div id=\"flex\" name=\"flex\">\n");
      out.write("                    <label>Costo de Suscripción</label>\n");
      out.write("                    <p>Q2132.00</p>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"flex\" name=\"flex\">\n");
      out.write("                    <label>Categoria</label>\n");
      out.write("                    <p>Acá irá la categoria</p>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"flex\" name=\"flex\">\n");
      out.write("                    <label>Fecha de publicación</label>\n");
      out.write("                    <p>1821-21-12</p>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"flex\" name=\"flex\">\n");
      out.write("                    <label># de ediciones</label>\n");
      out.write("                    <p>tal tal tal</p>\n");
      out.write("                </div>\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div name=\"central\" id=\"central\">\n");
      out.write("        <center>\n");
      out.write("            <h2>\n");
      out.write("                Ediciones\n");
      out.write("            </h2>\n");
      out.write("        </center>\n");
      out.write("        <hr width=\"80%\" />\n");
      out.write("        <div id=\"revistas\" name=\"revistas\" class=\"revistas\">\n");
      out.write("            <center>\n");
      out.write("                <div name=\"rev\" id=\"rev\" class=\"rev\">\n");
      out.write("                    <center>\n");
      out.write("                        <img src=\"../img/revista1.png\" width=\"90px\" heigth=\"90px\" alt=\"imagen del pdf\">\n");
      out.write("                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.revista_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Publicada: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.publicada}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Creada: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.fecha_crea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <form>\n");
      out.write("                            <input type=\"button\" onclick=\"mostrar1()\" class=\"add-to-cart\" value=\"Ver\" id=\"creare\"\n");
      out.write("                                name=\"creare\" />\n");
      out.write("                        </form>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("                <div name=\"rev\" id=\"rev\" class=\"rev\">\n");
      out.write("                    <center>\n");
      out.write("                        <img src=\"../img/revista1.png\" width=\"90px\" heigth=\"90px\" alt=\"imagen del pdf\">\n");
      out.write("                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.revista_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Publicada: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.publicada}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Creada: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.fecha_crea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <form>\n");
      out.write("                            <input type=\"button\" onclick=\"mostrar1()\" class=\"add-to-cart\" value=\"Ver\" id=\"creare\"\n");
      out.write("                                name=\"creare\" />\n");
      out.write("                        </form>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("                <div name=\"rev\" id=\"rev\" class=\"rev\">\n");
      out.write("                    <center>\n");
      out.write("                        <img src=\"../img/revista1.png\" width=\"90px\" heigth=\"90px\" alt=\"imagen del pdf\">\n");
      out.write("                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.revista_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Publicada: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.publicada}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Creada: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.fecha_crea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <form>\n");
      out.write("                            <input type=\"button\" onclick=\"mostrar1()\" class=\"add-to-cart\" value=\"Ver\" id=\"creare\"\n");
      out.write("                                name=\"creare\" />\n");
      out.write("                        </form>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("                <div name=\"rev\" id=\"rev\" class=\"rev\">\n");
      out.write("                    <center>\n");
      out.write("                        <img src=\"../img/revista1.png\" width=\"90px\" heigth=\"90px\" alt=\"imagen del pdf\">\n");
      out.write("                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.revista_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Publicada: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.publicada}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Creada: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.fecha_crea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <form>\n");
      out.write("                            <input type=\"button\" onclick=\"mostrar1()\" class=\"add-to-cart\" value=\"Ver\" id=\"creare\"\n");
      out.write("                                name=\"creare\" />\n");
      out.write("                        </form>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"vista\" name=\"vista\">\n");
      out.write("            <center>\n");
      out.write("                <h2>\n");
      out.write("                    Vista de la edicion\n");
      out.write("                </h2>\n");
      out.write("            </center>\n");
      out.write("            <hr width=\"80%\" />\n");
      out.write("            <center>\n");
      out.write("                <embed\n");
      out.write("                    src=\"https://www.ucm.es/data/cont/docs/119-2014-02-19-Carroll.ATravesDelEspajo.pdf#toolbar=0&navpanes=0&scrollbar=0\"\n");
      out.write("                    type=\"application/pdf\" width=\"60%\" height=\"400px\" />\n");
      out.write("            </center>\n");
      out.write("            <div id=\"divd\" name=\"divd\" style=\"background-color: brown\">\n");
      out.write("                Lorem ipsum dolor, sit amet consectetur adipisicing elit. Architecto illum, quae, doloribus autem quidem\n");
      out.write("                rem iusto dicta, incidunt provident corporis expedita quasi! Illum aut adipisci quos esse aliquid\n");
      out.write("                veniam. Quibusdam!\n");
      out.write("            </div>\n");
      out.write("            <h3>Reacciones</h3>\n");
      out.write("            <div class='comentarios1'>\n");
      out.write("                <div class='informacion' name='informacion' id='informacion'>\n");
      out.write("                    <img class='imagen' src='../ControladorIMG?user=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usr.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' alt='user desconocido' title=\"usuario\"\n");
      out.write("                        height=\"40px\" width=\"40px\" />\n");
      out.write("                    Comentario hecho el -------\n");
      out.write("                </div>\n");
      out.write("                <textarea name=\"interes1\" id=\"interes1\" rows=\"5\" cols=\"10\"\n");
      out.write("                    readonly>Lorem ipsum dolor sit amet consectetur adipisicing elit. Temporibus ipsam optio, ratione eos rerum corrupti commodi explicabo quos laboriosam nisi es</textarea>\n");
      out.write("            </div>\n");
      out.write("            <div class='comentarios1'>\n");
      out.write("                <div class='informacion' name='informacion' id='informacion'>\n");
      out.write("                    Comenta tú tambien\n");
      out.write("                </div>\n");
      out.write("                <textarea name=\"interes1\" id=\"interes1\" rows=\"5\" cols=\"10\" placeholder=\"Escribe algo chido\">\n");
      out.write("                </textarea>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div name=\"derecho\" id=\"derecho\">\n");
      out.write("        <form>\n");
      out.write("            <input type=\"button\" onclick=\"mostrar()\" class=\"add-to-cart\" value=\"Suscribete por tan solo \" id=\"creare\"\n");
      out.write("                name=\"creare\" />\n");
      out.write("        </form>\n");
      out.write("        <form>\n");
      out.write("            <input type=\"button\" onclick=\"mostrar()\" class=\"add-to-cart\" value=\"Otras revistas del creador\" id=\"creare\"\n");
      out.write("                name=\"creare\" />\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        function mostrarMensaje() {\n");
      out.write("            var popup = document.getElementById(\"myPopup\");\n");
      out.write("            popup.classList.toggle(\"show\");\n");
      out.write("        }\n");
      out.write("        window.addEventListener(\"load\", mostrar);\n");
      out.write("        function mostrar() {\n");
      out.write("            var x = document.getElementById('alerta');\n");
      out.write("            if (x.style.display === 'none') {\n");
      out.write("                x.style.display = 'block';\n");
      out.write("            } else {\n");
      out.write("                x.style.display = 'none';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function mostrar1() {\n");
      out.write("            var x = document.getElementById('vista');\n");
      out.write("            if (x.style.display === 'none') {\n");
      out.write("                x.style.display = 'block';\n");
      out.write("            } else {\n");
      out.write("                x.style.display = 'none';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
