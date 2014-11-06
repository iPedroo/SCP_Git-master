<%-- 
    Document   : pesquisarAluno
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
        <title>Pesquisa de Alunos</title>
    </head>
    <body>
        <h3>Pesquisa de Alunos</h3>
        <table border="1">
            <tr>
                <th>Matricula Aluno</th>
                <th>Nome Aluno</th>
                <th>CPF Aluno</th>
                <th colspan="2">Ação</th>
            </tr>
            <c:forEach items="${alunos}" var="aluno">
                <tr>
                    <td><c:out value="${aluno.getMatricula()}"/></td>
                    <td><c:out value="${aluno.getNome()}"/></td>
                    <td><c:out value="${aluno.getCpf()}"/></td>
                    <td><a href="ManterAlunoController?acao=prepararOperacao&operacao=Editar&idAluno=<c:out value="${aluno.getMatricula()}"/>"> Editar</a></td>
                    <td><a href="ManterAlunoController?acao=prepararOperacao&operacao=Excluir&idAluno=<c:out value="${aluno.getMatricula()}"/>">Excluir</a></td>       
                </tr>
            </c:forEach>
        </table>
        <form action="ManterAlunoController?acao=prepararOperacao&operacao=Incluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir" >
        </form>
    </body>
</html>
