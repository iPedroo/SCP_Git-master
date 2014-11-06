package model;

public class Participacao {
    private int idProjeto;
    private Projeto projeto;
    private int idEdital;
    private Edital edital;
    private int idDiretoria;
    private Diretoria diretoria;
    private int idFomento;
    private Fomento fomento;
    private int idAluno;
    private Aluno aluno;
    private int idCurso;
    private Curso curso;
    

    public Participacao(int idProjeto, Projeto projeto, int idEdital, Edital edital, int idDiretoria, Diretoria diretoria, int idFomento, Fomento fomento, int idAluno, Aluno aluno, int idCurso, Curso curso) {
        this.idProjeto = idProjeto;
        this.projeto = projeto;
        this.idEdital = idEdital;
        this.edital = edital;
        this.idDiretoria = idDiretoria;
        this.diretoria = diretoria;
        this.idFomento = idFomento;
        this.fomento = fomento;
        this.idAluno = idAluno;
        this.aluno = aluno;
        this.idCurso = idCurso;
        this.curso = curso;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public int getIdEdital() {
        return idEdital;
    }

    public void setIdEdital(int idEdital) {
        this.idEdital = idEdital;
    }

    public Edital getEdital() {
        return edital;
    }

    public void setEdital(Edital edital) {
        this.edital = edital;
    }

    public int getIdDiretoria() {
        return idDiretoria;
    }

    public void setIdDiretoria(int idDiretoria) {
        this.idDiretoria = idDiretoria;
    }

    public Diretoria getDiretoria() {
        return diretoria;
    }

    public void setDiretoria(Diretoria diretoria) {
        this.diretoria = diretoria;
    }

    public int getIdFomento() {
        return idFomento;
    }

    public void setIdFomento(int idFomento) {
        this.idFomento = idFomento;
    }

    public Fomento getFomento() {
        return fomento;
    }

    public void setFomento(Fomento fomento) {
        this.fomento = fomento;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}