<%-- 
    Document   : q04
    Created on : 14/03/2017, 15:29:46
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% String situacao = request.getParameter("situacao");%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>4</title>
    </head>
    <body>
        <% if(situacao == null) {%>
        <h1>Questão 4</h1>
        <label> Sua Nota </label>
        <form  action="questao4" method="POST">

            <input type="text" name="nota1"/>

            <input type="text" name="nota"/>

            <input type="submit" value="Enviar"/>
        </form>
        <% }else{ %>
        <h1>Exame!</h1>
        <label> Sua Nota no exame</label>
        <form  action="questao4" method="POST">
            <input type="text" name="notaexame"/>
            <input type="submit" value="Enviar"/>
        </form>
        <% } %>
    </body>
</html>
