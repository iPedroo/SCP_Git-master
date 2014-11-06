package dao;

import static dao.DAO.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Setor;

/** Esta Classe é responsável por complementar a classe Setor.java fazendo a 
/** manipulação do BD. Aqui entrarão todos os métodos referentes à acesso ao 
/** Banco de Dados
/** DAO - Data Access Object
*/
public class SetorDAO {
    
    //Método que faz a leitura da tabela SETOR e instancia cada registro em uma posiçao de uma Array Aluno
    public static List<Setor> obterSetores() throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Statement comando = null;
        List<Setor> setores = new ArrayList<Setor>();
        Setor setor = null;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM SETOR");
            while (rs.next()){
                setor = instanciarSetor(rs);
                setores.add(setor);
            }
        }finally{
            fecharConexao(conexao, comando);
        }
        return setores;
    }
    
    public static Setor instanciarSetor(ResultSet rs) throws SQLException{
        Setor setor = new Setor(rs.getInt("idSetor"), rs.getString("Nome"));
        return setor;
    }
}
