package dao;

import static dao.DAO.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Diretoria;

/** Esta Classe é responsável por complementar a classe Diretoria.java fazendo a 
/** manipulação do BD. Aqui entrarão todos os métodos referentes à acesso ao 
/** Banco de Dados
/** DAO - Data Access Object
* detalhes do funcionamento dos comandos na classe AlunoDAO.java
*/
public class DiretoriaDAO {
    
    //Método que faz a leitura da tabela DIRETORIA e retorna um array (de objetos) contendo cada registro 
    public static List<Diretoria> obterDiretorias() throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Statement comando = null;
        List<Diretoria> diretorias = new ArrayList<Diretoria>();
        Diretoria diretoria = null;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM DIRETORIA");
            while (rs.next()){
                diretoria = instanciarDiretoria(rs);
                diretorias.add(diretoria);
            }
        }finally{
            fecharConexao(conexao, comando);
    }
    return diretorias;
}
    public static Diretoria instanciarDiretoria(ResultSet rs) throws SQLException{
        Diretoria diretoria = new Diretoria(rs.getInt("idDiretoria"), rs.getString("nome"));
        return diretoria;
    }
    public static void gravar(Diretoria diretoria) throws SQLException, ClassNotFoundException{
        Connection conexao = null;
        Statement comando = null;
        String stringSQL;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            stringSQL = "INSERT INTO EDITAL(idDiretoria, nome)VALUES("+ diretoria.getIdDiretoria()+", "+ diretoria.getNome()+",";
            stringSQL = stringSQL + ")";
            comando.execute(stringSQL);
        }finally{
            fecharConexao(conexao, comando);
        }
    }
}
