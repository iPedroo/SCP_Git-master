package dao;

import static dao.DAO.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.SubArea;

/** Esta Classe é responsável por complementar a classe SubArea.java fazendo a 
/** manipulação do BD. Aqui entrarão todos os métodos referentes à acesso ao 
/** Banco de Dados
/** DAO - Data Access Object
* detalhes do funcionamento dos comandos na classe AlunoDAO.java
*/
public class SubAreaDAO {
    //Método que faz a leitura da tabela SUBAREA e retorna um array (de objetos) contendo cada registro 
    public static List<SubArea> obterSubAreas() throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Statement comando = null;
        List<SubArea> subAreas = new ArrayList<SubArea>();
        SubArea subArea = null;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM SUBAREA");
            while (rs.next()){
                subArea = instanciarSubArea(rs);
                subAreas.add(subArea);
            }
        }finally{
            fecharConexao(conexao, comando);
        }
        return subAreas;
    }
    
    public static SubArea instanciarSubArea(ResultSet rs) throws SQLException{
        SubArea subAreas = new SubArea(rs.getInt("idSubArea"), rs.getString("NOME"));
        return subAreas;
    }
}
