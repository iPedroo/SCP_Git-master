<%-- 
    Document   : pesquisarFomento
    Created on : 24/09/2014, 11:46:54
    Author     : FelipeFerraz
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa de Fomento</title>
    </head>
    <body>
        <h3>Pesquisa de Fomento</h3>
        <table border="1">
            <tr>
                <th>Código Fomento</th>
                <th>Nome</th>
                <th colspan="2">Ação</th>
            </tr>
            <c:forEach items="${fomentos}" var="fomento">
                <tr>
                    <td><c:out value="${fomento.getCod()}"/></td>
                    <td><c:out value="${fomento.getNome()}"/></td>
                    <td><a href="ManterFomentoController?acao=prepararOperacao&operacao=Editar&idCurso=<c:out value="${fomento.getCod()}"/>"> Editar</a></td>
                    <td><a href="ManterFomentoController?acao=prepararOperacao&operacao=Excluir&idCurso=<c:out value="${fomento.getCod()}"/>">Excluir</a></td>       
                </tr>
            </c:forEach>
        </table>
        <form action="ManterFomentoController?acao=prepararOperacao&operacao=Incluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir" >
        </form>
    </body>
</html>
