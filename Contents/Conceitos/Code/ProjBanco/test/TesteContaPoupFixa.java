
import cadastros.Empresa;
import cadastros.PessoaFisica;
import contas.ContaPoupFixa;
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
        ContaPoupFixa cpf = new ContaPoupFixa();
        cpf.setNumero(1);
        cpf.setDiaAniversario(10);
        // titular
        PessoaFisica pf = new PessoaFisica();
        pf.setId(1);
        pf.setNome("Mariazinha");
        cpf.setTitular(pf);
        // e a taxa fixa? é variável de classe!!! 
        ContaPoupFixa.setTaxaFixa(0.55);
        
        // Segunda conta ...
        ContaPoupFixa cpf2 = new ContaPoupFixa();
        cpf2.setNumero(2);
        cpf2.setDiaAniversario(20);
        // titular
        Empresa em = new Empresa();
        em.setId(2);
        em.setNome("Empresa X");
        cpf2.setTitular(em);        
        
        ContaPoupFixa.setTaxaFixa(0.40);
        
    }
}
