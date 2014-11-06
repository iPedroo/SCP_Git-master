<%-- 
    Document   : adicionarBolsa
    Created on : 07/09/2014, 20:36:11
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="csp_css.css" type="text/css" rel="stylesheet" />
        <title>SCP - Adicionar Bolsista</title>
    </head>
    <body>
        <h1 align="center">SCP - Sistema de Controle de Projetos</h1>
        <h3 align="center">Adicionar Bolsista</h3>

        <div id="index">
            <a class="itemMenu" href="PesquisarAlunoController">Pesquisar Aluno</a> . 
            <a class="itemMenu" href="PesquisarAreaController">Pesquisar Área</a> . 
            <a class="itemMenu" href="PesquisarCursoController">Pesquisar Curso</a> . 
            <a class="itemMenu" href="PesquisarDiretoriaController">Pesquisar Diretoria</a> . 
            <a class="itemMenu" href="PesquisarEditalController">Pesquisar Edital</a><hr/>
            <a class="itemMenu" href="PesquisarFomentoController">Pesquisar Fomento</a> . 
            <a class="itemMenu" href="PesquisarProfessorController">Pesquisar Professor</a> . 
            <a class="itemMenu" href="PesquisarProjetoController">Pesquisar Projeto</a> .
            <a class="itemMenu" href="PesquisarSetorController">Pesquisar Setor</a> . 
            <a class="itemMenu" href="PesquisarSubAreaController">Pesquisar Sub-Área</a>
        </div>   
        
        <div align="left" class="cadastro">
            <table>
                <label><h4>Bolsista</h4></label>
                <tr>
                    <td>
                        <label id="matricula">Matricula:</label>
                    </td>
                    <td>
                        <input type="text" id="matricula" /> 
                    </td>
                    <td>
                </tr>
                <tr>
                    <td>
                        <label id="nome">Nome:</label>
                    </td>
                    <td>
                        <input type="text" id="nome" />
                    </td>
                    <td>
                        <label id="curso">Curso:</label>
                    </td>
                    <td>
                        <select name="optCurso" >
                            <c:forEach items="${cursos}" var="curso">
                                <option value="${curso.idCurso}" 
                                    <c:if test="${curso.idCurso == aluno.idCurso}"> selected </c:if>
                                > ${curso.nome} </option>
                            </c:forEach>
                        </select>
                    </td>

                </tr>
                <br>
                <tr>
                    <td>
                        <label id="nasc">Data de Nascimento:</label>
                    </td>
                    <td>
                        <input type="text" id="nasc" />
                    </td>
                    <td>
                        <label id="natu">Naturalidade:</label>
                    </td>
                    <td>
                        <input type="text" id="natu" />
                    </td>
                    <td>
                        <label id="nacio">Nacionalidade:</label>
                    </td>
                    <td>
                        <input type="text" id="nacio" />
                    </td>

                </tr>

                <tr>
                    <td>
                        <label id="estado">Estado:</label>
                    </td>
                    <td>
                        <select id="estado">
                            <option value="mg">Minas Gerais</option>
                            <option value="rj">Rio de Janeiro</option>
                            <option value="sp">Sao Paulo</option>
                        </select>
                    </td>
                    <td>
                        <label id="cid">Cidade:</label>
                    </td>
                    <td>
                        <input type="text" id="cid" />
                    </td>
                    <td>
                        <label id="cep">CEP:</label>
                    </td>
                    <td>
                        <input type="text" id="cep" />
                    <td>
                </tr>

                <tr>
                    <td>
                        <label id="end">Rua:</label>
                    </td>
                    <td>
                        <input type="text" id="end" />
                    </td>
                    <td>
                        <label id="num">Numero:</label>
                    </td>
                    <td>
                        <input type="text" id="num" />
                    </td>
                    <td>
                        <label id="compl">Complemento:</label>
                    </td>
                    <td>
                        <input type="text" id="compl" />
                    </td>
                    <td>
                        <label id="bairro">Bairro:</label>
                    </td>
                    <td>
                        <input type="text" id="bairro" />
                    </td>
                </tr>

                <tr><td><b>Contatos:</b></td></tr>

                <tr>
                    <td>
                        <label id="res">Residencial:</label>
                    </td>
                    <td>
                        <input type="text" id="res" />
                    </td>
                    <td>
                        <label id="cel">Celular:</label>
                    </td>
                    <td>
                        <input type="text" id="cel" />
                    </td>
                    <td>
                        <label id="email">Email:</label>
                    </td>
                    <td>
                        <input type="text" id="email" />
                    </td>
                </tr>

                <tr><td><label><h4>Documentos</h4></label></td></tr>

                <tr>
                    <td>
                        <label id="id">Identidade:</label>
                    </td>
                    <td>
                        <input type="text" id="res" />
                    </td>
                    <td>
                        <label id="orgex">Oragao Expeditor:</label>
                    </td>
                    <td>
                        <input type="text" id="orgex" />
                    </td>
                    <td>
                        <label id="datexp">Data Expedição:</label>
                    </td>
                    <td>
                        <input type="text" id="datexp" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <label id="cpf">CPF:</label>
                    </td>
                    <td>
                        <input type="text" id="cpf" />
                    </td>
                    <td>
                        <label id="situmil">Situacao Militar:</label>
                    </td>
                    <td>
                        <input type="text" id="orgex" />
                    </td>
                    <td>
                        <label id="certmil">Certidao Militar:</label>
                    </td>
                    <td>
                        <input type="text" id="certmil" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <label id="trab"><b>Trabalha?</b></label>
                        <input type="checkbox" id="trab" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <label id="loctrab">Local de Trabalho:</label>
                    </td>
                    <td>
                        <input type="text" id="loctrab" />
                    </td>
                    <td>
                        <label id="teltrab">Telefone:</label>
                    </td>
                    <td>
                        <input type="text" id="teltrab" />
                    </td>
                    </form>
                </tr>

                <tr><td colspan="3"><label><h4>Dados da Conta Corrente (o bolsista deve ser o titular)</h4></label></td></tr>

                <tr>
                    <td>
                        <label id="banco">Banco?</label>
                    </td>
                    <td>
                        <input type="text" id="banco" />
                    </td>
                    <td>
                        <label id="angencia">Agencia:</label>
                    </td>
                    <td>
                        <input type="text" id="angencia" />
                    </td>
                    <td>
                        <label id="numconta">Numero da Conta Corrente:</label>
                    </td>
                    <td>
                        <input type="text" id="numconta" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <input type="submit" value="Enviar">
                        <button type="button" >Confirmar</button>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
