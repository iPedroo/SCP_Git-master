<%-- 
    Document   : pesquisarEdital
    Created on : 24/09/2014, 11:46:23
    Author     : FelipeFerraz
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa de Edital</title>
    </head>
    <body>
        <h3>Pesquisa de Edital</h3>
        <table border="1">
            <tr>
                <th>Código Edital</th>
                <th>Numero Edital</th>
                <th>Descrição</th>
                <th colspan="2">Ação</th>
            </tr>
            <c:forEach items="${editais}" var="edital">
                <tr>
                    <td><c:out value="${edital.getCod()}"/></td>
                    <td><c:out value="${edital.getNumero()}"/></td>
                    <td><c:out value="${edital.getDescricao()}"/></td>
                    <td><a href="ManterEditalController?acao=prepararOperacao&operacao=Editar&idCurso=<c:out value="${edital.getCod()}"/>"> Editar</a></td>
                    <td><a href="ManterEditalController?acao=prepararOperacao&operacao=Excluir&idCurso=<c:out value="${edital.getCod()}"/>">Excluir</a></td>       
                </tr>
            </c:forEach>
        </table>
        <form action="ManterDiretoriaController?acao=prepararOperacao&operacao=Incluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir" >
        </form>
    </body>
</html>
