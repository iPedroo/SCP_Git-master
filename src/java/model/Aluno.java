package model;

import dao.AlunoDAO;
import java.sql.SQLException;
import java.util.List;

public class Aluno extends Pessoa {  
    
      private int matricula;  
      private String naturalidade;
      private String estado;
      private String cidade;
      private String CEP;
      private String rua;
      private String numero;
      private String complemento;
      private String bairro;
      private String identidade;
      private String data_expedicao;
      private String orgao_expedidor;
      private String situacaoMilitar;
      private String certidaoMilitar;
      private String localTrabalho;
      private String telefone_trabalho;
      private String banco;
      private String agencia;
      private String contaCorrente;
      private String nomePai;
      private String identidadePai;
      private String orgaoExpedidorPai;
      private String cpfPai;
      private String nomeMae;
      private String identidadeMae;
      private String orgaoExpedidorMae;
      private String cpfMae;   
      private String tituloEleitor;
      private String secaoEleitoral;
      private String zonaEleitoral;
      private int idProjeto;
      private Curso curso;
      private int idCurso;
      private Projeto projeto;   
    
    public static List<Aluno> obterAlunos() 
            throws ClassNotFoundException, SQLException{
        return AlunoDAO.obterAlunos();
    } 

    public Aluno(
            int matricula, 
            String naturalidade, 
            String estado, 
            String cidade, 
            String CEP, 
            String rua, 
            String numero, 
            String complemento, 
            String bairro,
            String identidade,
            String data_expedicao, 
            String orgao_expedidor, 
            String situacaoMilitar, 
            String certidaoMilitar, 
            String localTrabalho, 
            String telefone_trabalho, 
            String banco, 
            String agencia, 
            String contaCorrente, 
            String nomePai, 
            String identidadePai, 
            String orgaoExpedidorPai, 
            String cpfPai, 
            String nomeMae, 
            String identidadeMae, 
            String orgaoExpedidorMae, 
            String cpfMae, 
            String tituloEleitor, 
            String secaoEleitoral, 
            String zonaEleitoral, 
            int idProjeto,
            Projeto projeto,
            int idCurso,
            Curso curso ) {
                this.matricula = matricula;
                this.naturalidade = naturalidade;
                this.estado = estado;
                this.cidade = cidade;
                this.CEP = CEP;
                this.rua = rua;
                this.numero = numero;
                this.complemento = complemento;
                this.bairro = bairro;
                this.identidade = identidade;
                this.data_expedicao = data_expedicao;
                this.orgao_expedidor = orgao_expedidor;
                this.situacaoMilitar = situacaoMilitar;
                this.certidaoMilitar = certidaoMilitar;
                this.localTrabalho = localTrabalho;
                this.telefone_trabalho = telefone_trabalho;
                this.banco = banco;
                this.agencia = agencia;
                this.contaCorrente = contaCorrente;
                this.nomePai = nomePai;
                this.identidadePai = identidadePai;
                this.orgaoExpedidorPai = orgaoExpedidorPai;
                this.cpfPai = cpfPai;
                this.nomeMae = nomeMae;
                this.identidadeMae = identidadeMae;
                this.orgaoExpedidorMae = orgaoExpedidorMae;
                this.cpfMae = cpfMae;
                this.tituloEleitor = tituloEleitor;
                this.secaoEleitoral = secaoEleitoral;
                this.zonaEleitoral = zonaEleitoral;
                this.idProjeto = idProjeto;
                this.curso = curso;
                this.idCurso = idCurso;
                this.projeto = projeto;
            }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getData_expedicao() {
        return data_expedicao;
    }

    public void setData_expedicao(String data_expedicao) {
        this.data_expedicao = data_expedicao;
    }

    public String getOrgao_expedidor() {
        return orgao_expedidor;
    }

    public void setOrgao_expedidor(String orgao_expedidor) {
        this.orgao_expedidor = orgao_expedidor;
    }

    public String getSituacaoMilitar() {
        return situacaoMilitar;
    }

    public void setSituacaoMilitar(String situacaoMilitar) {
        this.situacaoMilitar = situacaoMilitar;
    }

    public String getCertidaoMilitar() {
        return certidaoMilitar;
    }

    public void setCertidaoMilitar(String certidaoMilitar) {
        this.certidaoMilitar = certidaoMilitar;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    public String getTelefone_trabalho() {
        return telefone_trabalho;
    }

    public void setTelefone_trabalho(String telefone_trabalho) {
        this.telefone_trabalho = telefone_trabalho;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getIdentidadePai() {
        return identidadePai;
    }

    public void setIdentidadePai(String identidadePai) {
        this.identidadePai = identidadePai;
    }

    public String getOrgaoExpedidorPai() {
        return orgaoExpedidorPai;
    }

    public void setOrgaoExpedidorPai(String orgaoExpedidorPai) {
        this.orgaoExpedidorPai = orgaoExpedidorPai;
    }

    public String getCpfPai() {
        return cpfPai;
    }

    public void setCpfPai(String cpfPai) {
        this.cpfPai = cpfPai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getIdentidadeMae() {
        return identidadeMae;
    }

    public void setIdentidadeMae(String identidadeMae) {
        this.identidadeMae = identidadeMae;
    }

    public String getOrgaoExpedidorMae() {
        return orgaoExpedidorMae;
    }

    public void setOrgaoExpedidorMae(String orgaoExpedidorMae) {
        this.orgaoExpedidorMae = orgaoExpedidorMae;
    }

    public String getCpfMae() {
        return cpfMae;
    }

    public void setCpfMae(String cpfMae) {
        this.cpfMae = cpfMae;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    public String getSecaoEleitoral() {
        return secaoEleitoral;
    }

    public void setSecaoEleitoral(String secaoEleitoral) {
        this.secaoEleitoral = secaoEleitoral;
    }

    public String getZonaEleitoral() {
        return zonaEleitoral;
    }

    public void setZonaEleitoral(String zonaEleitoral) {
        this.zonaEleitoral = zonaEleitoral;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
        
}
