package model;

import dao.ProjetoDAO;
import java.sql.SQLException;
import java.util.List;

public class Projeto {
    
    private String nome;
    private int cod;
    private String situacao;
    private String caracterizacaoProblema;
    private String referencialTeorico;
    private String objetivos;
    private String metodologia;
    private String resultadosEsperados;
    private String inicio;
    private String fim;
    private String orcamento;
    private String referenciasBibliograficas;    

    public Projeto(String nome, int cod) {
        this.nome = nome;
        this.cod = cod;
    }    
    
    public static List<Projeto> obterProjetos() 
            throws ClassNotFoundException, SQLException{
        return ProjetoDAO.obterProjetos();
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getCaracterizacaoProblema() {
        return caracterizacaoProblema;
    }

    public void setCaracterizacaoProblema(String caracterizacaoProblema) {
        this.caracterizacaoProblema = caracterizacaoProblema;
    }

    public String getReferencialTeorico() {
        return referencialTeorico;
    }

    public void setReferencialTeorico(String referencialTeorico) {
        this.referencialTeorico = referencialTeorico;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getResultadosEsperados() {
        return resultadosEsperados;
    }

    public void setResultadosEsperados(String resultadosEsperados) {
        this.resultadosEsperados = resultadosEsperados;
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

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    public String getReferenciasBibliograficas() {
        return referenciasBibliograficas;
    }

    public void setReferenciasBibliograficas(String referenciasBibliograficas) {
        this.referenciasBibliograficas = referenciasBibliograficas;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
}
