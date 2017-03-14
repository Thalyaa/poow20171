<%-- 
    Document   : q04
    Created on : 14/03/2017, 15:29:46
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>4</title>
    </head>
    <body>
        <h1>Questão 4</h1>
        <form  action="questao4_1" method="POST">
            <% String nota1  = String.valueOf(request.getAttribute("nota1")); %>
            
            <input type="text" name="nota1" value="<%=nota1 %>" disable="true"/>
            <input type="text" name="exame"/>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
