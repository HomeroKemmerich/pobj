import cadastros.Empresa;
import cadastros.Pessoa;
import cadastros.PessoaFisica;
import java.util.Date;
import org.junit.Test;
import util.Datas;

public class TestPessoa {
    
    @Test
    public void testEmpresa(){
       // Tentar instanciar um objeto a partir de Pessoa = não pode
       // Pessoa p = new Pessoa();
       Empresa e = new Empresa("12.345.678/0001-89", 1, "Empresa X", "(54) 6565-9854", null);
       //e.setId(1); //Não pode. O id é final, devemos definír na inicialização!!
       e.setEndereco("Rua Morom", "1234", "Apto 01");
       // nosso teste será depurar esse código a partir da linha que instancia e
       System.out.println(e);
       
    }
   
    @Test
    public void testPessoaFisica(){
        Date nas = Datas.calcularVencimento(new Date(), -3650);
        PessoaFisica pf = new PessoaFisica("6.56.5.5", nas , 1, "Pedrinho");
        System.out.println("Idade "+pf.getIdade());
        
    }
   
    
    
}