<%-- 
    Document   : q11.jsp
    Created on : 22/03/2017, 18:54:33
    Author     : Fabin_000
--%>

<%@page import="servlets.Questao11"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=Questao11.titulo%></h1>
        <form  action="questao11" method="POST">
            <label for="n1">Primeiro número: </label>
            <input type="text" name="n1"/>
            <label for="n2">Segundo número: </label>
            <input type="text" name="n2"/>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
