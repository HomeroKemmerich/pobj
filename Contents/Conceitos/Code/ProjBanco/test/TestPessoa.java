import cadastros.Empresa;
import cadastros.Pessoa;
import org.junit.Test;

public class TestPessoa {
    
    @Test
    public void testPessoa(){
       // Tentar instanciar um objeto a partir de Pessoa = não pode
       // Pessoa p = new Pessoa();
       Empresa e = new Empresa();
       System.out.println(e);
       e.setCnpj("12.345.678/0001-89");
       e.setId(1);
       e.setNome("Empresa X");
       e.setTelefone("(54) 6565-9854");
       e.setEndereco("Rua Morom", "1234", "Apto 01");
       // nosso teste será depurar esse código a partir da linha que instancia e
    }
   
    
    
}