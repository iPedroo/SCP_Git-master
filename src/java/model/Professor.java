package model;

import dao.ProfessorDAO;
import java.sql.SQLException;
import java.util.List;

public class Professor extends Pessoa{
    
    private String campus;
    private String homePageLattes;
    private int siape;

    public Professor(int siape, String nome) {
        this.siape = siape;
        this.setNome(nome);
    }
    
    public static List<Professor> obterProfessores() 
            throws ClassNotFoundException, SQLException{
        return ProfessorDAO.obterProfessores();
    } 
 
    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getHomePageLattes() {
        return homePageLattes;
    }

    public void setHomePageLattes(String homePageLattes) {
        this.homePageLattes = homePageLattes;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }
    
}
