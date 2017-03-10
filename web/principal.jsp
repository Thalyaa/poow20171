<%-- 
    Document   : principal
    Created on : 24/02/2017, 02:34:43
    Author     : Laboratorio
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%-- comentario do jsp--%>
        <h1>Hello World!</h1>
        
        <%! 
            int contaVisitantes=0;
        %>
        
         <%-- PRIMEIRA FORMA DE DECLARAR SCRIPTLET--%>
        <%--SCRIPTLET --%>
        <%
            out.println("Mais um jeito de código java");
            out.println("visitantes: " +(++contaVisitantes));
        %>
          <%-- SEGUNDA FORMA DE DECLARAR SCRIPTLET--%>
         <jsp:scriptlet>
            
         </jsp:scriptlet>
        <%-- EXPRESSION --%>
        <br>
        
        Data: <%=(new Date()) .toLocaleString() %>
    </body>
</html>
