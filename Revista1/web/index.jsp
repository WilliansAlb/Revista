<%-- 
    Document   : index
    Created on : 27/09/2019, 12:48:02 PM
    Author     : yelbetto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
        <title>REV - 104</title>
        <%@include file='/css/all_css.html'%>
    </head>
    <body>
        <%
            HttpSession s = request.getSession();
        %>
        <%
            if (s.getAttribute("usuario") == null) {

        %>
        <%@include file='views/vista_crear.html'%>
        <%            } else {
                response.sendRedirect("views/perfil.jsp");
            }
        %>
        <script src="https://code.jquery.com/jquery-3.2.1.js"></script>
    </body>
</html>
