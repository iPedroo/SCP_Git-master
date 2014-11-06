<%-- 
    Document   : AdicionarEdital
    Created on : 09/09/2014, 20:14:27
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="csp_css.css" type="text/css" rel="stylesheet" />
        <title>SCP - Adicionar Edital</title>
    </head>
    <body>
        <h1 align="center">SCP - Sistema de Controle de Projetos</h1>
        <h3 align="center">Adicionar Edital</h3>

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
            <label><h4>Edital</h4></label>  
                <tr>
                    <td>
                        <label id="numed">Numero do Edital:</label>
                    </td>
                    <td>
                        <input type="text" id="numed" />
                    </td>

                    <td>
                        <label id="diretoria">Diretoria:</label>
                    </td>
                    <td>
                        <select id="diretoria">
                            <option value="extensao">Extensão</option>
                            <option value="pesquisa">Pesquisa</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td>
                        <label id="datincio">Data de Inicio:</label>
                    </td>
                    <td>
                        <input type="text" id="datincio" />
                    </td>
                    <td>
                        <label id="datfim">Data de Final:</label>
                    </td>
                    <td>
                        <input type="text" id="datfim" />
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
