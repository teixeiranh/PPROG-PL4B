/**
 * Um professor da escola.
 */
public class Professores extends ElementosDaEscola implements Mensalidade {

    private String categoria;
    private float majoracaoAssistente = 0.0f;
    private float majoracaoAdjunto = 0.2f;
    private float majoracaoCoordenador = 0.5f;

    private static float salarioBase = 1500;

    private static final String CATEGORIA_POR_OMISSAO = "sem categoria";

    /**
     * Constrói um professor da escola.
     * @param nome nome do professor
     * @param numeroIdentificacaoCivil número de identificação civil do professor
     * @param categoria categoria do professor
     */
    public Professores(String nome, int numeroIdentificacaoCivil, String categoria) {
        super(nome, numeroIdentificacaoCivil);
        this.categoria = categoria;
    }

    /**
     * Constrói um professor da escola.
     */
    public Professores() {
        super();
        this.categoria = CATEGORIA_POR_OMISSAO;
    }

    public static float getSalarioBase() {
        return salarioBase;
    }

    public static void setSalarioBase(float salarioBase) {
        Professores.salarioBase = salarioBase;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Calcula o salário que o professor recebe ao fim do mês.
     * Depende da categoria do professor.
     * @return valor do salário
     */
    public float mensalidade() {
        if (this.categoria.equals("sem categoria")) {
            return salarioBase;
        } else if (this.categoria.equals("Assistente")) {
            return salarioBase * (1 + majoracaoAssistente);
        } else if (this.categoria.equals("Adjunto")) {
            return salarioBase * (1 + majoracaoAdjunto);
        }
        return salarioBase * (1 + majoracaoCoordenador);
    }


}
