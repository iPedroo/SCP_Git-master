package model;

import java.sql.SQLException;
import java.util.List;

public class Edital {
    
    private String numero;
    private int idEdital;
    private String inicio;
    private String fim;
    private String descricao;
    private int idDiretoria;
    
    public static List<Edital> obterEditais() 
            throws ClassNotFoundException, SQLException{
        return dao.EditalDAO.obterEditais();
    }
//String diretoria, String inicio, String fim,
    public Edital(String numero, int idEdital, String descricao) {
        this.numero = numero;
        this.idEdital = idEdital;
        this.inicio = inicio;
        this.fim = fim;
        this.descricao = descricao;
        this.idDiretoria = idDiretoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getIdEdital() {
        return idEdital;
    }

    public void setIdEdital(int idEdital) {
        this.idEdital = idEdital;
    }

    public int getIdDiretoria() {
        return idDiretoria;
    }

    public void setIdDiretoria(int idDiretoria) {
        this.idDiretoria = idDiretoria;
    }

}
