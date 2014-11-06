package model;

import java.sql.SQLException;
import java.util.List;

public class SubArea {
    
    private String nome;
    private int cod;
    
    public static List<SubArea> obterSubAreas() 
            throws ClassNotFoundException, SQLException{
        return dao.SubAreaDAO.obterSubAreas();
    }

    public SubArea() {
    }

    public SubArea(int cod, String nome) {
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
