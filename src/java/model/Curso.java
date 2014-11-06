package model;

import dao.CursoDAO;
import java.sql.SQLException;
import java.util.List;

public class Curso {
    
    private int idCurso;
    private String nome;

    public Curso(int idCurso, String curso) {
        this.idCurso = idCurso;
        this.nome = curso;
    }
    
    public static List<Curso> obterCursos() 
            throws ClassNotFoundException, SQLException{
        return CursoDAO.obterCursos();
    } 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    
}
