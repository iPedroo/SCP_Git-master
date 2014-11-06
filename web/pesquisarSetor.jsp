<%-- 
    Document   : pesquisarSetor
    Created on : 24/09/2014, 11:43:50
    Author     : FelipeFerraz
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisar de Setor</title>
    </head>
    <body>
        <h3>Pesquisar de Setor</h3>
        <table border="1">
            <tr>
                <th>Código Setor</th>
                <th>Nome</th>
                <th colspan="2">Ação</th>
            </tr>
            <c:forEach items="${setores}" var="setor">
                <tr>
                    <td><c:out value="${setor.getCod()}"/></td>
                    <td><c:out value="${setor.getNome()}"/></td>
                    <td><a href="ManterSetorController?acao=prepararOperacao&operacao=Editar&idCurso=<c:out value="${setor.getCod()}"/>"> Editar</a></td>
                    <td><a href="ManterSetorController?acao=prepararOperacao&operacao=Excluir&idCurso=<c:out value="${setor.getCod()}"/>">Excluir</a></td>       
                </tr>
            </c:forEach>
        </table>
        <form action="ManterSetorController?acao=prepararOperacao&operacao=Incluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir" >
        </form>
    </body>
</html>
