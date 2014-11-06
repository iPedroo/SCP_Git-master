package dao;

import static dao.DAO.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Fomento;

/** Esta Classe é responsável por complementar a classe Fomento.java fazendo a 
/** manipulação do BD. Aqui entrarão todos os métodos referentes à acesso ao 
/** Banco de Dados
/** DAO - Data Access Object
* detalhes do funcionamento dos comandos na classe AlunoDAO.java
*/
public class FomentoDAO {
    
    //Método que faz a leitura da tabela FOMENTO e retorna um array (de objetos) contendo cada registro 
    public static List<Fomento> obterFomentos() throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Statement comando = null;
        List<Fomento> fomentos = new ArrayList<Fomento>();
        Fomento fomento = null;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM Fomento");
            while (rs.next()){
                fomento = instanciarFomento(rs);
                fomentos.add(fomento);
            }
        }finally{
            fecharConexao(conexao, comando);
        }
        return fomentos;
    }
    
    public static Fomento instanciarFomento(ResultSet rs) throws SQLException{
        Fomento fomento = new Fomento(rs.getInt("idFomento"), rs.getString("Nome"));
        return fomento;
    }
}
