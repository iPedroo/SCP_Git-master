<%-- 
    Document   : pesquisarProjeto
    Created on : 18/09/2014, 10:57:57
    Author     : FelipeFerraz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa de Projetos</title>
    </head>
    <body>
        <h3>Pesquisa de Projetos</h3>
        <table border="1">
            <tr>
                <th>Cod Projeto</th>
                <th>Nome Projeto</th>
                <th colspan="2">Ação</th>
            </tr>
            <c:forEach items="${projetos}" var="projeto">
                <tr>
                    <td><c:out value="${projeto.getCod()}"/></td>
                    <td><c:out value="${projeto.getNome()}"/></td>
                    <td><a href="ManterProjetoController?acao=prepararOperacao&operacao=Editar&idProjeto=<c:out value="${projeto.getCod()}"/>"> Editar</a></td>
                    <td><a href="ManterProjetoController?acao=prepararOperacao&operacao=Excluir&idProjeto=<c:out value="${projeto.getCod()}"/>">Excluir</a></td>       
                </tr>
            </c:forEach>
        </table>
        <form action="ManterProjetoController?acao=prepararOperacao&operacao=Incluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir" >
        </form>
    </body>
</html>
