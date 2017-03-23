<%-- 
    Document   : q12.jsp
    Created on : 22/03/2017, 19:21:43
    Author     : Fabin_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Questao 12</title>
    </head>
    <body>
        <form  action="questao12" method="POST">
        <%for(int i = 0;i <= 4;i++){%>
        <h2>Nome e a idade da <%=i+1%>o pessoa</h2>
            <input type="text" name="nome<%=i+1%>" placeholder="Nome..."/>
            <input type="text" name="idade<%=i+1%>" placeholder="Idade..."/>
        <%}%>
        <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
