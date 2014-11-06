package dao;

import static dao.DAO.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Edital;

/** Esta Classe é responsável por complementar a classe Edital.java fazendo a 
/** manipulação do BD. Aqui entrarão todos os métodos referentes à acesso ao 
/** Banco de Dados
/** DAO - Data Access Object
* detalhes do funcionamento dos comandos na classe AlunoDAO.java
*/
public class EditalDAO {
    
    //Método que faz a leitura da tabela EDITAL e retorna um array (de objetos) contendo cada registro 
    public static List<Edital> obterEditais() throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Statement comando = null;
        List<Edital> editais = new ArrayList<Edital>();
        Edital edital = null;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM EDITAL");
            while (rs.next()){
                edital = instanciarEdital(rs);
                editais.add(edital);
            }
        }finally{
            fecharConexao(conexao, comando);
        }
        return editais;
    }
    
    public static Edital instanciarEdital(ResultSet rs) throws SQLException{
        Edital edital = new Edital(rs.getString("Numero"), rs.getInt("idEdital"), rs.getString("Descricao"));
        return edital;
    }
    public static void gravar(Edital edital) throws SQLException, ClassNotFoundException{
        Connection conexao = null;
        Statement comando = null;
        String stringSQL;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            stringSQL = "INSERT INTO CURSO("
                    + "idEdital, "
                    + "Numero, "
                    + "Inicio, "
                    + "Fim, "
                    + "Descricao, "
                    + "Diretoria_idDiretoria"
                    + ")VALUES("
                    + edital.getIdEdital()+", "
                    + edital.getNumero()+","
                    + edital.getInicio()+","
                    + edital.getFim()+","
                    + edital.getDescricao()+","
                    + edital.getIdDiretoria()+",";
            stringSQL = stringSQL + ")";
            comando.execute(stringSQL);            
        }finally{
            fecharConexao(conexao, comando);
        }
    }
    
}
