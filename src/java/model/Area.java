package model;

import dao.AreaDAO;
import java.sql.SQLException;
import java.util.List;

public class Area {

    private String nome;
    private int idArea;
    private int idSubArea;
    private SubArea subArea;

    public SubArea getSubArea() {
        return subArea;
    }

    public void setSubArea(SubArea subArea) {
        this.subArea = subArea;
    }
    
    public Area() {
    }

    public Area(int idArea, String nome) {
        this.nome = nome;
        this.idArea = idArea;
    }
    
    public static List<Area> obterAreas() 
            throws ClassNotFoundException, SQLException{
        return dao.AreaDAO.obterAreas();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdSubArea() {
        return idSubArea;
    }

    public void setIdSubArea(int idSubArea) {
        this.idSubArea = idSubArea;
    }
    
}
