package dao;

import static dao.DAO.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Area;

/** Esta Classe é responsável por complementar a classe Area.java fazendo a 
/** manipulação do BD. Aqui entrarão todos os métodos referentes à acesso ao 
/** Banco de Dados
/** DAO - Data Access Object
* detalhes do funcionamento dos comandos na classe AlunoDAO.java
*/
public class AreaDAO {
    
    //Método que faz a leitura da tabela AREA e retorna um array (de objetos) contendo cada registro 
    public static List<Area> obterAreas() throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Statement comando = null;
        List<Area> areas = new ArrayList<Area>();
        Area area = null;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM AREA");
            while (rs.next()){
                area = instanciarArea(rs);
                areas.add(area);
            }
        }finally{
            fecharConexao(conexao, comando);
        }
        return areas;
    }
   
    
    public static Area instanciarArea(ResultSet rs) throws SQLException{
        Area area = new Area(rs.getInt("idArea"), rs.getString("nome"));
        return area;
    }
    public static void gravar(Area area) throws SQLException, ClassNotFoundException{
        Connection conexao = null;
        Statement comando = null;
        String stringSQL;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            stringSQL = "INSERT INTO AREA(idArea, nome, SubArea_idSubArea)VALUES("+ area.getIdArea()+", "+ area.getNome()+", "+area.getIdSubArea()+",";
            
            if(area.getSubArea() == null){
                stringSQL = stringSQL + null;
            }
            else{
                stringSQL = stringSQL + area.getIdSubArea();
            }
            stringSQL = stringSQL + ")";
            comando.execute(stringSQL);
        }finally{
            fecharConexao(conexao, comando);
        }
    }
}
