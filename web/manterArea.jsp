<%-- 
    Document   : AdicinarArea
    Created on : 09/09/2014, 20:27:20
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link href="csp_css.css" type="text/css" rel="stylesheet" />
        <title>SCP - Adicionar Area</title>
    </head>
    <body>
        <h1 align="center">SCP - Sistema de Controle de Projetos</h1>
        <h3 align="center">Adicionar Area</h3>
        
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
            <label><h4>Área</h4></label>   
            <tr>
                <td> </td>
                <td>
                    <label id="cod">Codigo:</label>
                </td>
                <td>
                    <input type="text" id="cod" />
                </td>
            </tr>

            <tr>
                <td> </td>
                <td>
                    <label id="nome">Nome:</label> 
                </td>
                <td>
                    <input type="text" id="nome" />
                </td>
            </tr>
        </table>
        
        <table>
            <tr>
                <td>
                    <button type="button">Cancelar</button>
                    <button type="button">Enviar</button>
                </td>
            </tr>
        </table>
        </div>
        
    </body>
</html>
