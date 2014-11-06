<%-- 
    Document   : pesquisarCurso
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
        <title>Pesquisa de Cursos</title>
    </head>
    <body>
        <h3>Pesquisa de Cursos</h3>
        <table border="1">
            <tr>
                <th>Código Curso</th>
                <th>Nome Curso</th>
                <th colspan="2">Ação</th>
            </tr>
            <c:forEach items="${cursos}" var="curso">
                <tr>
                    <td><c:out value="${curso.getIdCurso()}"/></td>
                    <td><c:out value="${curso.getNome()}"/></td>
                    <td><a href="ManterCursoController?acao=prepararOperacao&operacao=Editar&idCurso=<c:out value="${curso.getIdCurso()}"/>"> Editar</a></td>
                    <td><a href="ManterCursoController?acao=prepararOperacao&operacao=Excluir&idCurso=<c:out value="${curso.getIdCurso()}"/>">Excluir</a></td>       
                </tr>
            </c:forEach>
        </table>
        <form action="ManterCursoController?acao=prepararOperacao&operacao=Incluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir" >
        </form>
    </body>
</html>
