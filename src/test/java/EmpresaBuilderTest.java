import org.example.Empresa;
import org.example.EmpresaBuilder;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpresaBuilderTest {
    @Test
    public void deveRetornarExcecaoParaEmpresaSemCnpj() {
        try {
            EmpresaBuilder empresaBuilder = new EmpresaBuilder();
            Empresa empresa = empresaBuilder
                    .setNome("UFJF")
                    .setSetor("Ensino")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CNPJ inválido", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaEmpresaSemNome() {
        try {
            EmpresaBuilder empresaBuilder = new EmpresaBuilder();
            Empresa empresa = empresaBuilder
                    .setCnpj(1234)
                    .setCidade("Juiz de Fora")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    public void deveRetornarEmpresaValida() {
        EmpresaBuilder empresaBuilder = new EmpresaBuilder();
        Empresa empresa = empresaBuilder
                .setCnpj(1234)
                .setNome("Empresa x")
                .build();

        assertNotNull(empresa);
    }
}
