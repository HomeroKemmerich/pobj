
import cadastros.Empresa;
import contas.Conta;
import contas.ContaEspecial;
import contas.Movimento;
import java.util.Date;
import meuFramework.MeuJPA;
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
public class TestePolimorfMeuJpa {
    @Test
    public void testMerge(){
        
        Movimento m = new Movimento(1, new Date(), 1000.00, "Deposito", "pelo caixa");
        MeuJPA.merge(m);
        
        Empresa e = new Empresa("12.212.212/0001-45", 1, "Empresa um", "54 5454 54545", null);
        MeuJPA.merge(e);
       
    }
}
