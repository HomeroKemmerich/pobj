import cadastros.Empresa;
import cadastros.Pessoa;
import cadastros.PessoaFisica;
import contas.Conta;
import contas.ContaComum;
import contas.ContaEspecial;
import contas.Movimento;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import util.Datas;

public class TestarMovimentacao {
   
    @Test
    public void testMovimentacao01(){
       List<Pessoa> clientes = new ArrayList<>();
       List<Conta> contas = new ArrayList<>();
       cadastrarClientes(clientes);
       cadastrarContas(contas, clientes);
       realizarMovimentos(contas);
       realizarMovimentosIndevidos(contas);
    }

    private void cadastrarClientes(List<Pessoa> clientes) {
        try {
            // Cadastrar uma pessoa físca
            clientes.add(new PessoaFisica("232.323.323-65", Datas.strToDate("20/10/2005"), 1, "Fulano"));
            // Cadastrar uma empresa
            clientes.add(new Empresa("12.323.656/0001-98", 2, "Empresa XYZ"));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    private void cadastrarContas(List<Conta> contas, List<Pessoa> clientes) {
        try {
            // Cadastrar uma conta comum para a pessoa física Fulano
            contas.add(new ContaComum(1, clientes.get(0) , 0.0, Datas.strToDate("13/11/2020")));
            // Cadastrar uma conta especial
            contas.add(new ContaEspecial(10000.00, 2, clientes.get(1), 0.0, Datas.strToDate("13/11/2020")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    private void realizarMovimentos(List<Conta> contas) {
        mostrarExtrato(contas.get(0));
        mostrarExtrato(contas.get(1));
        // Movimentos na conta 0
        contas.get(0).deposito(5000.00);
        try {
            contas.get(0).saque(2000.00);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            // transferir para a conta 1 1000.00
            contas.get(0).transferencia(1000.00, contas.get(1));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        mostrarExtrato(contas.get(0));
        mostrarExtrato(contas.get(1));
        
        
    }

    private void mostrarExtrato(Conta c) {
        System.out.println("--------------------------------------------------");
        System.out.println("Extrado da "+c.getClass().getSimpleName()+" número: "+c.getNumero());
        System.out.println("--------------------------------------------------");
        for (Movimento m : c.getMovimentos()){
            System.out.println(m.getTipo()+" | "+m.getDataHora()+" | "+m.getValor());
        }
        System.out.println("Saldo da conta: "+c.getSaldo());
        System.out.println("--------------------------------------------------");
    }

    private void realizarMovimentosIndevidos(List<Conta> contas) {
        // Tentar fazer saque de contacomum além do saldo
        ContaComum cc = (ContaComum) contas.get(0);
        Conta ce = contas.get(1);
        try {
            cc.saque(10000.0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            cc.transferencia(10000.00, ce);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
    }
    
}
