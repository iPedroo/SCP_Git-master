package model;

public class AcompanhamentoMensal {
    private int idAcompanhamentoMensal;
    private int siape;
    private Professor professor;
    private int matricula;
    private Aluno aluno;
    private String data;
    private int pagamento;
    private String outras_infos;
    private float interesseAluno;
    private float progressoAlcancado;
    private int cumprimentoCargaHoraria;
    private String justificativas;
    
    public AcompanhamentoMensal(int idAcompanhamentoMensal, int siape, Professor professor, int matricula, Aluno aluno, String data, int pagamento, String outras_infos, float interesseAluno, float progressoAlcancado, int cumprimentoCargaHoraria, String justificativas) {
        this.idAcompanhamentoMensal = idAcompanhamentoMensal;
        this.siape = siape;
        this.professor = professor;
        this.matricula = matricula;
        this.aluno = aluno;
        this.data = data;
        this.pagamento = pagamento;
        this.outras_infos = outras_infos;
        this.interesseAluno = interesseAluno;
        this.progressoAlcancado = progressoAlcancado;
        this.cumprimentoCargaHoraria = cumprimentoCargaHoraria;
        this.justificativas = justificativas;
    }

    public String getJustificativas() {
        return justificativas;
    }

    public void setJustificativas(String justificativas) {
        this.justificativas = justificativas;
    }

    public int getIdAcompanhamentoMensal() {
        return idAcompanhamentoMensal;
    }

    public void setIdAcompanhamentoMensal(int idAcompanhamentoMensal) {
        this.idAcompanhamentoMensal = idAcompanhamentoMensal;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPagamento() {
        return pagamento;
    }

    public void setPagamento(int pagamento) {
        this.pagamento = pagamento;
    }

    public String getOutras_infos() {
        return outras_infos;
    }

    public void setOutras_infos(String outras_infos) {
        this.outras_infos = outras_infos;
    }

    public float getInteresseAluno() {
        return interesseAluno;
    }

    public void setInteresseAluno(float interesseAluno) {
        this.interesseAluno = interesseAluno;
    }

    public float getProgressoAlcancado() {
        return progressoAlcancado;
    }

    public void setProgressoAlcancado(float progressoAlcancado) {
        this.progressoAlcancado = progressoAlcancado;
    }

    public int getCumprimentoCargaHoraria() {
        return cumprimentoCargaHoraria;
    }

    public void setCumprimentoCargaHoraria(int cumprimentoCargaHoraria) {
        this.cumprimentoCargaHoraria = cumprimentoCargaHoraria;
    }
}
