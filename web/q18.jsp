<%-- 
    Document   : q18
    Created on : 25/03/2017, 01:46:25
    Author     : Fabin_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>18</title>
    </head>
    <body>
        <form  action="questao18" method="POST">
            <%for(int i = 0;i <= 9;i++){%>
                <h2>Nome e a idade da <%=i+1%>o pessoa</h2>
                <input type="text" name="nome<%=i+1%>" placeholder="Nome..."/>
                <input type="text" name="idade<%=i+1%>" placeholder="Idade..."/>
                <input type="text" name="altura<%=i+1%>" placeholder="Altura..."/>
            <%}%>
            <input type="submit" value="Enviar"/>
        </form>      
    </body>
</html>
