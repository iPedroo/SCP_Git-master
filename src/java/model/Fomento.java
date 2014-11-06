package model;

import java.sql.SQLException;
import java.util.List;

public class Fomento {
    
    private String nome;
    private int idFomento;

    public Fomento() {
    }

    public Fomento(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return idFomento;
    }

    public void setCod(int idFomento) {
        this.idFomento = idFomento;
    }
    
    public static List<Fomento> obterFomentos() 
            throws ClassNotFoundException, SQLException{
        return dao.FomentoDAO.obterFomentos();
    }
}
