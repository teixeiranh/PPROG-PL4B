/**
 * Um elemento da escola, mais concretamente, aluno ou professor.
 */
public abstract class ElementosDaEscola {

    private String nome;
    private int numeroIdentificacaoCivil;

    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final int NUMERO_IDENTIFICACAO_CIVIL_POR_OMISSAO = 0;

    /**
     * Contrói um elemento da escola.
     * @param nome nome do elemento da escola
     * @param numeroIdentificacaoCivil número de identificação civil
     */
    public ElementosDaEscola(String nome, int numeroIdentificacaoCivil) {
        this.nome = nome;
        this.numeroIdentificacaoCivil = numeroIdentificacaoCivil;
    }

    /**
     * Contrói um elemento da escola.
     */
    public ElementosDaEscola() {
        this.nome = NOME_POR_OMISSAO;
        this.numeroIdentificacaoCivil=NUMERO_IDENTIFICACAO_CIVIL_POR_OMISSAO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroIdentificacaoCivil() {
        return numeroIdentificacaoCivil;
    }

    public void setNumeroIdentificacaoCivil(int numeroIdentificacaoCivil) {
        this.numeroIdentificacaoCivil = numeroIdentificacaoCivil;
    }
}
