/**
 * Este programa mostra como funcionam as classes dos alunos e professores.
 * Ver ficha da prática em causa.
 */
public class Main {
    public static void main(String[] args) {

        Alunos aluno1 = new Alunos("José", 14221456, 5566, "Bolseiro", 900);
        Alunos aluno2 = new Alunos("Filipe", 13221456, 5466, "Não Bolseiro");
        Alunos aluno3 = new Alunos("Adão", 12221456, 5366, "Não Bolseiro");
        Professores professor1 = new Professores("Albino", 9945667, "Coordenador");
        Professores professor2 = new Professores("Jorge Fernando", 9945557, "Adjunto");

        ElementosDaEscola[] arrayElementos = new ElementosDaEscola[10];

        arrayElementos[0] = aluno1;
        arrayElementos[1] = aluno2;
        arrayElementos[2] = aluno3;
        arrayElementos[3] = professor1;
        arrayElementos[4] = professor2;

        for (ElementosDaEscola elementos : arrayElementos) {
            if (elementos != null && elementos instanceof Professores) {
                System.out.printf("Professor de nome %s e categoria %s.", elementos.getNome(), ((Professores) elementos).getCategoria());
                System.out.println();
            }
        }

        System.out.println("------------------------------------------------------------------------------------------------------------");

        for (ElementosDaEscola elementos : arrayElementos) {
            if (elementos != null && elementos instanceof Alunos && ((Alunos) elementos).getTipoDeAluno().equals("Não Bolseiro")) {
                System.out.printf("Número %d.", ((Alunos) elementos).getNumeroMecanografico());
                System.out.println();
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");

        for (ElementosDaEscola elementos : arrayElementos) {
            if (elementos != null)  {
                System.out.printf("Nome %s e %s.",elementos.getNome(),elementos.getClass());
                System.out.println();
            }
        }

        System.out.println("------------------------------------------------------------------------------------------------------------");

        for (ElementosDaEscola elementos : arrayElementos) {
            if (elementos != null && elementos instanceof Professores) {
                System.out.printf("Professor de nome %s e salario %f.", elementos.getNome(), ((Professores) elementos).mensalidade());
                System.out.println();
            }
        }

        System.out.println("------------------------------------------------------------------------------------------------------------");
        for (ElementosDaEscola elementos : arrayElementos) {
            if (elementos != null && elementos instanceof Alunos && ((Alunos) elementos).getTipoDeAluno().equals("Bolseiro")) {
                System.out.printf("Nome %s e bolsa %f.",elementos.getNome(),((Alunos) elementos).getBolsa());
                System.out.println();
            }
        }

        /*
            A alínea final terá de ser resolvida de forma diferente, pois não dá para tirar proveito de polimorfismo.
            A interface mensalidade terá de ser partilhada pelas classes concretas utilizadas.
         */

    }
}
