<%-- 
    Document   : pesquisarProfessor
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
        <title>Pesquisa de Professores</title>
    </head>
    <body>
        <h3>Pesquisa de Professores</h3>
        <table border="1">
            <tr>
                <th>Matricula Professor</th>
                <th>Nome Professor</th>
                <th colspan="2">Ação</th>
            </tr>
            <c:forEach items="${professores}" var="professor">
                <tr>
                    <td><c:out value="${professor.getSiape()}"/></td>
                    <td><c:out value="${professor.getNome()}"/></td>
                    <td><a href="ManterProfessorController?acao=prepararOperacao&operacao=Editar&idProfessor=<c:out value="${professor.getSiape()}"/>"> Editar</a></td>
                    <td><a href="ManterProfessorController?acao=prepararOperacao&operacao=Excluir&idProfessor=<c:out value="${professor.getSiape()}"/>">Excluir</a></td>       
                </tr>
            </c:forEach>
        </table>
        <form action="ManterProfessorController?acao=prepararOperacao&operacao=Incluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir" >
        </form>
    </body>
</html>
