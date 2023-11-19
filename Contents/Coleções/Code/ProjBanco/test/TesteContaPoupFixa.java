
import cadastros.Empresa;
import cadastros.PessoaFisica;
import contas.ContaPoupFixa;
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
public class TesteContaPoupFixa {
    
    @Test
    public void testPoupancaFixa(){
        // Criarmos e inicializamos uma pessoa física
        PessoaFisica titular = new PessoaFisica("6546465", null, 1, "Mariazinha");
        // Criarmos e inicializamos uma conta poupanca fixa
        ContaPoupFixa cpf = new ContaPoupFixa(10, 1, titular, 0.0, new Date());
        // e a taxa fixa? é variável de classe!!! 
        ContaPoupFixa.setTaxaFixa(0.55);
        
               
        // Segunda conta ...
        Empresa em = new Empresa("32.322.545/00001-98", 2, "Empresa X");
        ContaPoupFixa cpf2 = new ContaPoupFixa(20, 2, em, 0.0, new Date());
        
        ContaPoupFixa.setTaxaFixa(0.40);
        
    }
}
