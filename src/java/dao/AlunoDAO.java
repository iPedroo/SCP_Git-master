package dao;

import static dao.DAO.fecharConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import model.Curso;
import model.Projeto;

/** Esta Classe é responsável por complementar a classe Aluno.java fazendo a 
/** manipulação do BD. Aqui entrarão todos os métodos referentes à acesso ao 
/** Banco de Dados
/** DAO - Data Access Object
*/

public class AlunoDAO {
    
    //Método que faz a leitura da tabela ALUNO e retorna um array (de objetos) contendo cada registro 
    public static List<Aluno> obterAlunos()
        throws ClassNotFoundException, SQLException {
        Connection conexao = null; 
        Statement comando = null; 
        List<Aluno> alunos = new ArrayList<Aluno>();
        Aluno aluno = null;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM ALUNO");
            while (rs.next()){//enquanto o próximo registro for != de null
                aluno = instanciarAluno(rs);
                alunos.add(aluno);
            }
        }finally{//executa o conteúdo em qualquer situação (inclusive se houver erro)
            fecharConexao(conexao, comando);
        }
        return alunos;
    }
    
    public static Aluno instanciarAluno(ResultSet rs) throws SQLException {
        Aluno aluno;
        aluno = new Aluno(
                rs.getInt("matricula"),
                rs.getString("naturalidade"),
                rs.getString("estado"),
                rs.getString("cidade"),
                rs.getString("CEP"),
                rs.getString("rua"),
                rs.getString("numero"),
                rs.getString("complemento"),
                rs.getString("bairro"),
                rs.getString("identidade"),
                rs.getString("data_expedicao"),
                rs.getString("orgao_expedidor"), 
                rs.getString("situacaoMilitar"),
                rs.getString("certidaoMilitar"),
                rs.getString("localTrabalho"),
                rs.getString("telefone_trabalho"),
                rs.getString("banco"),
                rs.getString("agencia"),
                rs.getString("contaCorrente"),
                rs.getString("nomePai"),
                rs.getString("identidadePai"),
                rs.getString("orgaoExpedidorPai"),
                rs.getString("cpfPai"),
                rs.getString("nomeMae"),
                rs.getString("identidadeMae"),
                rs.getString("orgaoExpedidorMae"),
                rs.getString("cpfMae"),
                rs.getString("tituloEleitor"),
                rs.getString("secaoEleitoral"),
                rs.getString("zonaEleitoral"),
                rs.getInt("idProjeto"),
                null,//curso
                rs.getInt("idCurso"),
                null   
        );
        return aluno;
    }
    
    public static void gravar(Aluno aluno) throws SQLException, ClassNotFoundException{
        Connection conexao = null;
        Statement comando = null;
        String stringSQL;
        try{
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            stringSQL = "INSERT INTO ALUNO(matricula, "+ "nome, "+ "curso, "+ "data_nascimento, "+ "naturalidade, "+ "nacionalidade, "+ "estado, "+ "cidade, "+ "CEP, "+ "rua, "+ "numero, "+ "complemento, "+ "bairro, "+ "telefone_residencial, "+ "celular, "
                    + "email, "
                    + "identidade, "
                    + "data_emissao, "
                    + "orgao_expeditor, "
                    + "data_expedissao, "
                    + "CPF, "
                    + "situação_militar, "
                    + "certidão_militar, "
                    + "local_trabalho, "
                    + "telefone_trabalho, "
                    + "banco, "
                    + "agencia, "
                    + "conta_corrente, "
                    + "nome_pai, "
                    + "identidade_pai, "
                    + "orgao_expedidor_pai, "
                    + "cpf_pai, "
                    + "nome_mae, "
                    + "identidade_mae, "
                    + "orgao_expedidor_mae, "
                    + "cpf_mae, "
                    + "Curso_idCurso, "
                    + "Projeto_idProjeto "
                    + ")VALUES("
                    + aluno.getNome() +", "
                    + aluno.getIdCurso() +", "
                    + aluno.getDataNascimento() +", "
                    + aluno.getNaturalidade()+", "
                    + aluno.getNacionalidade()+", "
                    + aluno.getEstado()+", "
                    + aluno.getCidade()+", "
                    + aluno.getCEP()+", "
                    + aluno.getRua()+", "
                    + aluno.getNumero()+", "
                    + aluno.getComplemento()+", "
                    + aluno.getBairro()+", "
                    + aluno.getTelefone()
                    + aluno.getCelular()+", "
                    + aluno.getEmail()+", "
                    + aluno.getIdentidade()+", "
                    + aluno.getData_expedicao()+", "
                    + aluno.getCpf()+", "
                    + aluno.getSituacaoMilitar()+", "
                    + aluno.getCertidaoMilitar()+", "
                    + aluno.getLocalTrabalho()+", "
                    + aluno.getTelefone_trabalho()+", "
                    + aluno.getBanco()+", "
                    + aluno.getAgencia()+", "
                    + aluno.getContaCorrente()+", "
                    + aluno.getNomePai()+", "
                    + aluno.getIdentidadePai()+", "
                    + aluno.getOrgaoExpedidorPai()+", "
                    + aluno.getCpfPai()+", "
                    + aluno.getNomeMae()+", "
                    + aluno.getIdentidadeMae()+", "
                    + aluno.getOrgaoExpedidorMae()+", "
                    + aluno.getCpfMae()+", ";
            
            if(aluno.getCurso() == null){
                stringSQL = stringSQL + null;
            }
            else{
                stringSQL = stringSQL + aluno.getIdCurso();
            }
            stringSQL = stringSQL + ")";
            comando.execute(stringSQL);
        }finally{
            fecharConexao(conexao, comando);
        }
    }
}