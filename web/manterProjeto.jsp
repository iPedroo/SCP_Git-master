<%-- 
    Document   : AdicionarProjeto
    Created on : 09/09/2014, 20:22:37
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="csp_css.css" type="text/css" rel="stylesheet" />
        <title>SCP - Adicionar Projeto</title>
    </head>
    <body>
        <h1 align="center">SCP - Sistema de Controle de Projetos</h1>
        <h3 align="center">Adicionar Projeto</h3>

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
            <label><h4>Professor</h4></label> 
            <table>
                <tr>
                    <td>
                        <label id="nome">Nome:</label>
                    </td>
                    <td>
                        <input type="text" id="nome" />
                    </td>
                    <td>
                        <label id="palavra">Palavra-Chave:</label>
                    </td>
                    <td>
                        <input type="text" id="palavra" />
                    </td>
                    <td>
                        <label id="area">Area de Conhecimento::</label>
                        <select id="area">
                            <option value="area1">area1</option>
                            <option value="area2">area2</option>
                        </select>
                    </td>
                </tr>

                <tr><td>Descrição:</tr></td>
                <tr><td colspan="4">
                        <textarea rows="4" cols="50">
                        </textarea>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
