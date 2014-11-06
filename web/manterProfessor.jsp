<%-- 
    Document   : RegistarProfessor
    Created on : 07/09/2014, 22:49:02
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="csp_css.css" type="text/css" rel="stylesheet" />
        <title>SCP - Adicionar Professor</title>
    </head>
    <body>
        <h1 align="center">SCP - Sistema de Controle de Projetos</h1>
        <h3 align="center">Adicionar Professor</h3>

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
            <tr>
                <td>
                    <label id="nome">Nome:</label>
                </td>
                <td>
                    <input type="text" id="nome" />
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
                    <label id="datnasc">Data de Nascimento:</label>
                </td>
                <td>
                    <input type="text" id="datnasc" />
                </td>
                <td>
                    <label id="nacio">Nacionalidade:</label>
                </td>
                <td>
                    <input type="text" id="nacio" />
                </td>
            </tr>

            <tr><td><b>Contatos:</b></td></tr>

            <tr>
                <td>
                    <label id="email">Email:</label>
                </td>
                <td>
                    <input type="text" id="email" />
                </td>
                <td>
                    <label id="homepag">Home page do curriculo lattes:</label>
                </td>
                <td>
                    <input type="text" id="homepag" />
                </td>
            </tr>

            <tr>
                <td>
                    <label id="estado">Campus:</label>
                </td>
                <td>
                    <select id="campus">
                        <option value="jf">Juiz de Fora</option>
                        <option value="rb">Rio Pomba</option>
                        <option value="bq">Barbacena</option>
                    </select>
                </td>
                <td>
                    <label id="setor">Setor:</label>
                </td>
                <td>
                    <input type="text" id="setor" />
                </td>
            </tr>

            <tr><td><b>Telefones:</b></td></tr>

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
                    <label id="cid">Cidade:</label>
                </td>
                <td>
                    <input type="text" id="cid" />
                </td>
            </tr>
        </table>
    </body>
</html>
