<%-- 
    Document   : pasquisarSubArea
    Created on : 24/09/2014, 11:47:29
    Author     : FelipeFerraz
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisar de Sub Area</title>
    </head>
    <body>
        <h3>Pesquisa de Sub Area</h3>
        <table border="1">
            <tr>
                <th>Código Sub Área</th>
                <th>Nome</th>
                <th></th>
                <th colspan="2">Ação</th>
            </tr>
            <c:forEach items="${subareas}" var="subarea">
                <tr>
                    <td><c:out value="${subarea.getCod()}"/></td>
                    <td><c:out value="${subarea.getNome()}"/></td>
                    <td><a href="ManterSubAreaController?acao=prepararOperacao&operacao=Editar&idCurso=<c:out value="${subarea.getCod()}"/>"> Editar</a></td>
                    <td><a href="ManterSubAreaController?acao=prepararOperacao&operacao=Excluir&idCurso=<c:out value="${subarea.getCod()}"/>">Excluir</a></td>       
                </tr>
            </c:forEach>
        </table> 
        <form action="ManterSubAreaController?acao=prepararOperacao&operacao=Incluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir" >
        </form>
    </body>
</html>
