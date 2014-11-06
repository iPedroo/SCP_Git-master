package model;

import java.sql.SQLException;
import java.util.List;

public class Diretoria {

    private String nome;
    private int idDiretoria;

    public int getIdDiretoria() {
        return idDiretoria;
    }

    public void setIdDiretoria(int idDiretoria) {
        this.idDiretoria = idDiretoria;
    }

    public Diretoria() {
    }
    
    public static List<Diretoria> obterDiretorias() throws ClassNotFoundException, SQLException{
        return dao.DiretoriaDAO.obterDiretorias();
    }

    public Diretoria(int cod, String nome) {
        this.nome = nome;
        this.idDiretoria = idDiretoria;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
