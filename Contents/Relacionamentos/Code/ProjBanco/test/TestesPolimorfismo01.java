
import cadastros.Empresa;
import cadastros.PessoaFisica;
import contas.Conta;
import contas.ContaComum;
import contas.ContaEspecial;
import contas.ContaPoupFixa;
import contas.ContaPoupVariavel;
import contas.ContaPoupanca;
import contas.Movimento;
import java.util.Date;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JaqsonUpf
 */
public class TestesPolimorfismo01 {
    
    @Test
    public void testPolimVariavel(){
        ContaEspecial ce; // definição de variável para conter uma conta especial
        ce = new ContaEspecial(1);
        // ce = new ContaPoupanca(2); Não é permitido! São irmãs
        // ---------------------------------------------------------
        ContaPoupanca cp; // somente instancias de ContaPoupanca e suas subclasses podem ser referenciadas
        cp = new ContaPoupanca(1); // polimorfismo de variável
        cp = new ContaPoupFixa(2); // polimorfismo de variável 
        cp = new ContaPoupVariavel(3); // polimorfismo de variável
        // ----------------------------------
        Conta c; // Qualquer instância de subclasses de conta podem ser referenciadas
        c = new ContaPoupanca(1); // polimorfismo de variável
        c = new ContaPoupFixa(2); // polimorfismo de variável 
        c = new ContaPoupVariavel(3); // polimorfismo de variável
        c = new ContaEspecial(1);
        c = new ContaComum(5);
        // c = new Movimento(1); não pode. c só pode referenciar contas
        // -------------------------------------
        // Agora polimorfismo de variável com Objeto - pode referenciar qualquer coisa
        Object o;
        o = new ContaPoupanca(1);
        testar(o);
        o = new ContaEspecial(1);
        testar(o);
        o = new ContaComum(5);
        testar(o);
        o = new Movimento(1);
        testar(o);
        o = new Empresa();
        testar(o);
        o = new PessoaFisica();
        testar(o);
        o = new Date();
        testar(o);
        o = new String();
        testar(o);
        
    }

    private void testar(Object o) {
       // o. não conseguimos acessar os atributos e métodos!!!
       if (o instanceof ContaComum){
           ((ContaComum) o).setTitular(new Empresa());
           // o.deposito(10.0); precisa do cast para acessar os atibutos e métodos
           System.out.println("É uma conta comum.");
       }else if (o instanceof PessoaFisica)
           System.out.println("É uma PF.");
       else if (o instanceof Date)
           System.out.println("É uma data.");
       else 
           System.out.println("É de alguma outra classe qualquer.");
    }
    
    
    
}
