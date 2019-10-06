package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Base.Conectado;

public final class buscar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Busqueda</title>\n");
      out.write("        \n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"../css/nav.css\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"../css/stylo.css\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            HttpSession s = request.getSession();
        
      out.write("\n");
      out.write("        ");
  Conectado c = new Conectado();
            String[] cat = c.categorias();
        
      out.write("\n");
      out.write("        ");
      out.write("<header id='hola' name='hola'>\n");
      out.write("    <nav class=\"listado2\">\n");
      out.write("        <ul class=\"listado1\">\n");
      out.write("            <li class=\"enlace1\"><a href=\"#\">Inicio</a></li>\n");
      out.write("            <li class=\"enlace1\"><a href=\"perfil.jsp\" id=\"pad\" name=\"pad\"><div name=\"probando\" id=\"probando\">\n");
      out.write("                        <img src=\"../ControladorIMG?user=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usr.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                             width=\"40px\" height=\"40px\" id=\"foto\" name=\"foto\"/>Perfil\n");
      out.write("                    </div></a></li>\n");
      out.write("            <li class=\"enlace1\"><a href=\"#\">Categorias</a>\n");
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
      out.write("        <div name=\"izquierdo\" id=\"izquierdo\">\n");
      out.write("            <div id='moredat' name='moredat'>\n");
      out.write("                <center>\n");
      out.write("                    <h1>Buscar por</h1>\n");
      out.write("                    <form>\n");
      out.write("                        <input type=\"button\" onclick=\"mostrar1()\" class=\"add-to-cart\" value=\"Categorias\" id=\"creare\"\n");
      out.write("                               name=\"creare\" />\n");
      out.write("                    </form>\n");
      out.write("                </center>\n");
      out.write("                <center>\n");
      out.write("                    <div id=\"vista\" name=\"vista\">\n");
      out.write("                        <center>\n");
      out.write("                            <ul>\n");
      out.write("                                ");
 for (int i = 0; i < cat.length; i++) {
                                
      out.write("\n");
      out.write("                                <li id=\"categorias\" name=\"categorias\"><a href=\"\">");
out.print(cat[i]);
      out.write("</a></li>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </center>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </center>\n");
      out.write("\n");
      out.write("                <center>\n");
      out.write("                    <form>\n");
      out.write("                        <input type=\"button\" onclick=\"mostrar()\" class=\"add-to-cart\" value=\"Fecha de publicacion\"\n");
      out.write("                               id=\"creare\" name=\"creare\" />\n");
      out.write("                    </form>\n");
      out.write("                </center>\n");
      out.write("                <center>\n");
      out.write("                    <div id=\"alerta\" name=\"alerta\">\n");
      out.write("                        <center>\n");
      out.write("                            <ul>\n");
      out.write("                                <li id=\"categorias\" name=\"categorias\"><a href=\"\">Lo de la semana</a></li>\n");
      out.write("                                <li id=\"categorias\" name=\"categorias\"><a href=\"\">Hace un mes</a></li>\n");
      out.write("                                <li id=\"categorias\" name=\"categorias\"><a href=\"\">Hace tres meses</a></li>\n");
      out.write("                                <li id=\"categorias\" name=\"categorias\"><a href=\"\">El inicio de los tiempos</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                </center>\n");
      out.write("\n");
      out.write("                <center>\n");
      out.write("                    <form>\n");
      out.write("                        <input type=\"button\" onclick=\"mostrar3()\" class=\"add-to-cart\" value=\"Precio\" id=\"creare\"\n");
      out.write("                               name=\"creare\" />\n");
      out.write("                    </form>\n");
      out.write("                </center>\n");
      out.write("                <center>\n");
      out.write("                    <div id=\"alerta1\" name=\"alerta1\">\n");
      out.write("                        <center>\n");
      out.write("                            <ul>\n");
      out.write("                                <li id=\"categorias\" name=\"categorias\"><a href=\"\">Mas de Q100</a></li>\n");
      out.write("                                <li id=\"categorias\" name=\"categorias\"><a href=\"\">Menos de Q100</a></li>\n");
      out.write("                                <li id=\"categorias\" name=\"categorias\"><a href=\"\">De Q50 a Q100</a></li>\n");
      out.write("                                <li id=\"categorias\" name=\"categorias\"><a href=\"\">Menos de Q50</a></li>\n");
      out.write("                                <li id=\"categorias\" name=\"categorias\"><a href=\"\">Menos de Q30</a></li>\n");
      out.write("                                <li id=\"categorias\" name=\"categorias\"><a href=\"\">Menos de Q20</a></li>\n");
      out.write("                                <li id=\"categorias\" name=\"categorias\"><a href=\"\">Menos de Q10</a></li>\n");
      out.write("                                <li id=\"categorias\" name=\"categorias\"><a href=\"\">Gratis</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                </center>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div name=\"central\" id=\"central\">\n");
      out.write("            <hr width=\"100%\" />\n");
      out.write("            <center>\n");
      out.write("                <h2>\n");
      out.write("                    Revistas que coinciden\n");
      out.write("                </h2>\n");
      out.write("            </center>\n");
      out.write("            <hr width=\"80%\" />\n");
      out.write("            <div id=\"revistas\" name=\"revistas\" class=\"revistas\">\n");
      out.write("                <center>\n");
      out.write("                    <div name=\"rev\" id=\"rev\" class=\"rev\">\n");
      out.write("                        <center>\n");
      out.write("                            <img src=\"../img/revista1.png\" width=\"90px\" heigth=\"90px\" alt=\"imagen del pdf\">\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.revista_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <p>Publicada: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.publicada}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <p>Creada: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.fecha_crea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <form>\n");
      out.write("                                <input type=\"button\" onclick=\"mostrar1()\" class=\"add-to-cart\" value=\"Ver\" id=\"creare\"\n");
      out.write("                                       name=\"creare\" />\n");
      out.write("                            </form>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("            <hr width=\"100%\" />\n");
      out.write("            <center>\n");
      out.write("                <h2>\n");
      out.write("                    Perfiles que coinciden\n");
      out.write("                </h2>\n");
      out.write("            </center>\n");
      out.write("            <hr width=\"80%\" />\n");
      out.write("            <div id=\"revistas\" name=\"revistas\" class=\"revistas\">\n");
      out.write("                <center>\n");
      out.write("                    <div name=\"rev\" id=\"rev\" class=\"rev\">\n");
      out.write("                        <center>\n");
      out.write("                            <img src=\"../img/revista1.png\" width=\"90px\" heigth=\"90px\" alt=\"imagen del pdf\">\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.revista_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <p>Publicada: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.publicada}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <p>Creada: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombrerev.fecha_crea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <form>\n");
      out.write("                                <input type=\"button\" onclick=\"mostrar1()\" class=\"add-to-cart\" value=\"Ver\" id=\"creare\"\n");
      out.write("                                       name=\"creare\" />\n");
      out.write("                            </form>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("            <hr width=\"100%\" />\n");
      out.write("        </div>\n");
      out.write("        <div name=\"derecho\" id=\"derecho\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function mostrarMensaje() {\n");
      out.write("                var popup = document.getElementById(\"myPopup\");\n");
      out.write("                popup.classList.toggle(\"show\");\n");
      out.write("            }\n");
      out.write("            window.addEventListener(\"load\", mostrar);\n");
      out.write("            function mostrar() {\n");
      out.write("                var x = document.getElementById('alerta');\n");
      out.write("                if (x.style.display === 'none') {\n");
      out.write("                    x.style.display = 'block';\n");
      out.write("                } else {\n");
      out.write("                    x.style.display = 'none';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function mostrar3() {\n");
      out.write("                var x = document.getElementById('alerta1');\n");
      out.write("                if (x.style.display === 'none') {\n");
      out.write("                    x.style.display = 'block';\n");
      out.write("                } else {\n");
      out.write("                    x.style.display = 'none';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function mostrar1() {\n");
      out.write("                var x = document.getElementById('vista');\n");
      out.write("                if (x.style.display === 'none') {\n");
      out.write("                    x.style.display = 'block';\n");
      out.write("                } else {\n");
      out.write("                    x.style.display = 'none';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
