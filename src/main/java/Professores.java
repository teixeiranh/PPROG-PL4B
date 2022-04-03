public class Professores extends ElementosDaEscola implements Mensalidade {

    private String categoria;
    private float majoracaoAssistente = 0.0f;
    private float majoracaoAdjunto = 0.2f;
    private float majoracaoCoordenador = 0.5f;

    private static float salarioBase = 1500;

    private static final String CATEGORIA_POR_OMISSAO = "sem categoria";

    public Professores(String nome, int numeroIdentificacaoCivil, String categoria) {
        super(nome, numeroIdentificacaoCivil);
        this.categoria = categoria;
    }

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
