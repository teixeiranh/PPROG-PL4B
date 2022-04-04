/**
 * Um aluno da escola.
 */
public class Alunos extends ElementosDaEscola {

    private int numeroMecanografico;
    private String tipoDeAluno;
    private float bolsa;

    private static final int NUMERO_MECANOGRAFICO_POR_OMISSAO = 0;
    private static final String TIPO_DE_ALUNO_POR_OMISSAO = "sem tipo";
    private static final float BOLSA_POR_OMISSAO = 0;

    /**
     * Constrói um aluno da escola.
     * @param nome nome do aluno
     * @param numeroIdentificacaoCivil número de identificação civil do aluno
     * @param numeroMecanografico número mecanográfico do aluno
     * @param tipoDeAluno tipo de aluno (bolseiro ou não bolseiro)
     */
    public Alunos(String nome, int numeroIdentificacaoCivil, int numeroMecanografico,String tipoDeAluno) {
        super(nome, numeroIdentificacaoCivil);
        this.numeroMecanografico = numeroMecanografico;
        this.tipoDeAluno = tipoDeAluno;
        this.bolsa = BOLSA_POR_OMISSAO;

    }

    /**
     * Constrói um aluno da escola.
     * @param nome nome do aluno
     * @param numeroIdentificacaoCivil número de identificação civil do aluno
     * @param numeroMecanografico número mecanográfico do aluno
     * @param tipoDeAluno tipo de aluno (bolseiro ou não bolseiro)
     * @param bolsa valor da bolsa que o aluno recebe
     */
    public Alunos(String nome, int numeroIdentificacaoCivil, int numeroMecanografico,String tipoDeAluno,float bolsa) {
        super(nome, numeroIdentificacaoCivil);
        this.numeroMecanografico = numeroMecanografico;
        this.tipoDeAluno = tipoDeAluno;
        this.bolsa = bolsa;
    }


    /**
     * Constrói um aluno da escola.
     */
    public Alunos() {
        super();
        this.numeroMecanografico = NUMERO_MECANOGRAFICO_POR_OMISSAO;
        this.tipoDeAluno = TIPO_DE_ALUNO_POR_OMISSAO;
        this.bolsa = BOLSA_POR_OMISSAO;
    }

    public int getNumeroMecanografico() {
        return numeroMecanografico;
    }

    public void setNumeroMecanografico(int numeroMecanografico) {
        this.numeroMecanografico = numeroMecanografico;
    }

    public String getTipoDeAluno() {
        return tipoDeAluno;
    }

    public void setTipoDeAluno(String tipoDeAluno) {
        this.tipoDeAluno = tipoDeAluno;
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
