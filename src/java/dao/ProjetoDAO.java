package dao;

import static dao.DAO.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Projeto;

/** Esta Classe é responsável por complementar a classe Projeto.java fazendo a 
/** manipulação do BD. Aqui entrarão todos os métodos referentes à acesso ao 
/** Banco de Dados
/** DAO - Data Access Object
*/
public class ProjetoDAO {
    //Método que faz a leitura da tabela PROJETO e instancia cada registro em uma posiçao de uma Array Aluno
    public static List<Projeto> obterProjetos()
        throws ClassNotFoundException, SQLException {
        Connection conexao = null; 
        Statement comando = null; 
        List<Projeto> projetos = new ArrayList<Projeto>();
        Projeto projeto = null;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM PROJETO");
            while (rs.next()){
                projeto = instanciarProjeto(rs);
                projetos.add(projeto);
            }
        }finally{
            fecharConexao(conexao, comando);
        }
        return projetos;
    }
    
    public static Projeto instanciarProjeto(ResultSet rs) throws SQLException {
        Projeto projeto = new Projeto(rs.getString("nome"), rs.getInt("cod"));
        return projeto;
    }
}
