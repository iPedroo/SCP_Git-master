package model;

public class AvaliacaoFinal {
    private int idAvaliacaoFinal;
    private int siape;
    private Professor professor;
    private int matricula;
    private Aluno aluno;
    private String avaliacaoOrientador;
    private boolean resultadosPrograma;
    private String localResultados;

    public AvaliacaoFinal(int idAvaliacaoFinal, int siape, Professor professor, int matricula, Aluno aluno, String avaliacaoOrientador, boolean resultadosPrograma, String localResultados) {
        this.idAvaliacaoFinal = idAvaliacaoFinal;
        this.siape = siape;
        this.professor = professor;
        this.matricula = matricula;
        this.aluno = aluno;
        this.avaliacaoOrientador = avaliacaoOrientador;
        this.resultadosPrograma = resultadosPrograma;
        this.localResultados = localResultados;
    }

    public String getLocalResultados() {
        return localResultados;
    }

    public void setLocalResultados(String localResultados) {
        this.localResultados = localResultados;
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

    public String getAvaliacaoOrientador() {
        return avaliacaoOrientador;
    }

    public void setAvaliacaoOrientador(String avaliacaoOrientador) {
        this.avaliacaoOrientador = avaliacaoOrientador;
    }

    public boolean isResultadosPrograma() {
        return resultadosPrograma;
    }

    public void setResultadosPrograma(boolean resultadosPrograma) {
        this.resultadosPrograma = resultadosPrograma;
    }

    public int getIdAvaliacaoFinal() {
        return idAvaliacaoFinal;
    }

    public void setIdAvaliacaoFinal(int idAvaliacaoFinal) {
        this.idAvaliacaoFinal = idAvaliacaoFinal;
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
    

}
