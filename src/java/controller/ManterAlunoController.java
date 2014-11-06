/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Curso;

/**
 *
 * @author FelipeFerraz
 */
public class ManterAlunoController extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String acao = request.getParameter("acao");
        if (acao.equals("confirmarOperacao")){
            //confirmarOperacao(request, response);
        }else{
            if (acao.equals("prepararOperacao")){
                prepararOperacao(request, response);
            }
        }
        
    }
    
    protected void prepararOperacao(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
      try{
          String operacao = request.getParameter("operacao");
          request.setAttribute("operacao", operacao);
          request.setAttribute("cursos", Curso.obterCursos());
          if (!operacao.equals("Incluir")) {
              //int codUsuario = Integer.parseInt(request.getParameter("codUsuario"));
              //Aluno aluno = Aluno.obterAluno(codUsuario);
              //request.setAttribute("aluno", aluno);
          }
          
      RequestDispatcher view = request.getRequestDispatcher("/manterAluno.jsp");
      view.forward(request, response);
          
      }catch(ServletException e){
          throw e;
      } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManterAlunoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManterAlunoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
