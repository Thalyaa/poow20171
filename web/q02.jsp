<%-- 
    Document   : q2
    Created on : 10/03/2017, 04:11:42
    Author     : Laboratorio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2</title>
    </head>
   <h1>Questão 2</h1>
        <form  action="questao2" method="POST">
            <input type="text" pattern=".{5,}" required name="nome" title="Digite pelo menos 5 caracteres"/>
            <input type="submit" value="Enviar"/>
        </form>
</html>
