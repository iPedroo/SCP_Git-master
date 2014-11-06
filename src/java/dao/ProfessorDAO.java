package dao;

import static dao.DAO.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Professor;

/** Esta Classe é responsável por complementar a classe Professor.java fazendo a 
/** manipulação do BD. Aqui entrarão todos os métodos referentes à acesso ao 
/** Banco de Dados
/** DAO - Data Access Object
* detalhes do funcionamento dos comandos na classe AlunoDAO.java
*/
public class ProfessorDAO {
    
    //Método que faz a leitura da tabela PROFESSOR e retorna um array (de objetos) contendo cada registro 
    public static List<Professor> obterProfessores()
        throws ClassNotFoundException, SQLException {
        Connection conexao = null; 
        Statement comando = null; 
        List<Professor> professores = new ArrayList<Professor>();
        Professor professor = null;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM PROFESSOR");
            while (rs.next()){
                professor = instanciarProfessor(rs);
                professores.add(professor);
            }
        }finally{
            fecharConexao(conexao, comando);
        }
        return professores;
    }
    
    public static Professor instanciarProfessor(ResultSet rs) throws SQLException {
        Professor professor = new Professor(rs.getInt("siape"), rs.getString("nome"));
        return professor;
    }
}