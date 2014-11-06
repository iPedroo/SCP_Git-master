package dao;

import model.Curso;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/** Esta Classe é responsável por complementar a classe Curso.java fazendo a 
/** manipulação do BD. Aqui entrarão todos os métodos referentes à acesso ao 
/** Banco de Dados
/** DAO - Data Access Object
* detalhes do funcionamento dos comandos na classe AlunoDAO.java
*/
public class CursoDAO extends DAO{   
    
    //Método que faz a leitura da tabela CURSO e retorna um array (de objetos) contendo cada registro 
    public static List<Curso> obterCursos()
        throws ClassNotFoundException, SQLException {
        Connection conexao = null; 
        Statement comando = null; 
        List<Curso> cursos = new ArrayList<Curso>();
        Curso curso = null;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM CURSO");
            while (rs.next()){
                curso = instanciarCurso(rs);
                cursos.add(curso);
            }
        }finally{
            fecharConexao(conexao, comando);
        }
        return cursos;
    }
    
    public static Curso instanciarCurso(ResultSet rs) throws SQLException {
        Curso curso = new Curso(rs.getInt("idCurso"), rs.getString("nome"));
        return curso;
    }
    public static void gravar(Curso curso) throws SQLException, ClassNotFoundException{
        Connection conexao = null;
        Statement comando = null;
        String stringSQL;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            stringSQL = "INSERT INTO CURSO(idCurso, nome)VALUES("+ curso.getIdCurso() +", "+ curso.getNome()+",";
            stringSQL = stringSQL + ")";
            comando.execute(stringSQL);
        }finally{
            fecharConexao(conexao, comando);
        }
    }
}
