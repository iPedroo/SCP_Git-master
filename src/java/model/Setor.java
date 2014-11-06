package model;

import java.sql.SQLException;
import java.util.List;

public class Setor {

    private String nome;
    private int cod;
    
    public Setor() {
    }

     public static List<Setor> obterSetores() 
            throws ClassNotFoundException, SQLException{
        return dao.SetorDAO.obterSetores();
    }

    public Setor(int cod, String nome) {
        this.nome = nome;
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    } 
}
