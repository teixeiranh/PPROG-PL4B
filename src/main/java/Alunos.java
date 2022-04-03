public class Alunos extends ElementosDaEscola {

    private int numeroMecanografico;
    private String tipoDeAluno;
    private float bolsa;

    private static final int NUMERO_MECANOGRAFICO_POR_OMISSAO = 0;
    private static final String TIPO_DE_ALUNO_POR_OMISSAO = "sem tipo";
    private static final float BOLSA_POR_OMISSAO = 0;

    public Alunos(String nome, int numeroIdentificacaoCivil, int numeroMecanografico,String tipoDeAluno,float bolsa) {
        super(nome, numeroIdentificacaoCivil);
        this.numeroMecanografico = numeroMecanografico;
        this.tipoDeAluno = tipoDeAluno;
        this.bolsa = bolsa;
    }

    public Alunos() {
        super();
        this.numeroMecanografico = NUMERO_MECANOGRAFICO_POR_OMISSAO;
        this.tipoDeAluno = TIPO_DE_ALUNO_POR_OMISSAO;
        this.bolsa = BOLSA_POR_OMISSAO;
    }


}
