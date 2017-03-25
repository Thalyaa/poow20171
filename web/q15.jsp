<%-- 
    Document   : q15
    Created on : 22/03/2017, 20:51:09
    Author     : Thalya
--%>

<%@page import="pkg.NumeroPrimo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>15</title>
    </head>
    <body>
        <h1>Questão 15</h1>
        <%for(int i = 1;i<=100;++i){%>
            <% if(NumeroPrimo.ehPrimo(i)) { %>
            <p> <%=i%> </p>
            <br>
            <% }%>        
        <%}%>
    </body>
</html>
