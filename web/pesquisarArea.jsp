<%-- 
    Document   : pesquisarArea
    Created on : 24/09/2014, 11:44:10
    Author     : FelipeFerraz
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa de Area</title>
    </head>
    <body>
        <h3>Pesquisa de Area</h3>
        <table border="1">
            <tr>
                <th>Código Área</th>
                <th>Descrição</th>
                <th colspan="2">Ação</th>
            </tr>
            <tr>
                <c:forEach items="${areas}" var="area">

                        <td><c:out value="${area.idArea}" /></td>
                        <td><c:out value="${area.nome}"/></td>

                        <td><a href="ManterAreaController?acao=prepararOperacao&operacao=Editar&idAluno=<c:out value="${area.idArea}"/>"> Editar</a></td>
                        <td><a href="ManterAreaController?acao=prepararOperacao&operacao=Excluir&idAluno=<c:out value="${area.idArea}"/>">Excluir</a></td> 

                </c:forEach>
            </tr>        
        </table>
        <form action="ManterAreaController?acao=prepararOperacao&operacao=Incluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir" >
        </form>
    </body>
</html>
