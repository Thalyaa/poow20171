<%-- 
    Document   : q03
    Created on : 13/03/2017, 11:07:58
    Author     : BPE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>3</title>
    </head>
    <body>
        <h1>Questão 03</h1>
        <form  action="questao3" method="POST">
            <label for="idade">Idade</label>
            <br>
            <input type="text"  name="idade" placeholder="Digite sua idade..."/>
            <br>
            <label for="estadoCivil">Estado Civil</label>
            <br>
            <input type="radio" name="estadoCivil" value="solteiro" checked> Solteiro<br>
            <input type="radio" name="estadoCivil" value="casado"> Casado<br>
            <input type="radio" name="estadoCivil" value="viuvo"> Viúvo
            <br>
            <label for="escolaridade">Escolaridade</label>
            <br>
            <input type="radio" name="escolaridade" value="fundamental" checked> Fundamental Completo<br>
            <input type="radio" name="escolaridade" value="medio"> Médio Completo<br>
            <input type="radio" name="escolaridade" value="superior"> Superior Completo
            <br>
            <input type="submit" value="Enviar"/>
    </body>
</html>
