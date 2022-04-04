import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProfessorTest {
    private Professores professor1;

    @BeforeEach
    public void initTest() {
        professor1 = new Professores("Albino", 2222, "Assistente");
    }

    @Test
    public void testProfessor() {
        Assertions.assertEquals(1500,professor1.mensalidade());
    }
}
