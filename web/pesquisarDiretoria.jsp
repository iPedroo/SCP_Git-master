<%-- 
    Document   : pesquisarDiretoria
    Created on : 24/09/2014, 11:45:52
    Author     : FelipeFerraz
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa de Diretoria</title>
    </head>
    <body>
        <h3>Pesquisa de Diretoria</h3>
        <table border="1">
            <tr>
                <th>Código Diretoria</th>
                <th>Nome</th>
                <th colspan="2">Ação</th>
            </tr>
            <c:forEach items="${diretorias}" var="diretoria">
                <tr>
                    <td><c:out value="${diretoria.getCod()}"/></td>
                    <td><c:out value="${diretoria.getNome()}"/></td>
                    <td><a href="ManterDiretoriaController?acao=prepararOperacao&operacao=Editar&idCurso=<c:out value="${diretoria.getCod()}"/>"> Editar</a></td>
                    <td><a href="ManterDiretoriaController?acao=prepararOperacao&operacao=Excluir&idCurso=<c:out value="${diretoria.getCod()}"/>">Excluir</a></td>       
                </tr>
            </c:forEach>
        </table>
        <form action="ManterDiretoriaController?acao=prepararOperacao&operacao=Incluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir" >
        </form>
    </body>
</html>
