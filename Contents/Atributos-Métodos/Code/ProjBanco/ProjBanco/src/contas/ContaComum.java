/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import cadastros.Pessoa;
import java.util.Date;

/**
 *
 * @author JaqsonUpf
 */
public class ContaComum extends Conta{

    /* Não podemos substituir método final
    @Override
    public final void deposito(Double valor){
        saldo += valor;
    }
    */      
    
    @Override
    public void saque(Double valor) throws Exception{
        if (valor <= saldo)
           saldo -= valor;
        else
            throw new Exception("Não tem saldo para o saque.");
    }

    public ContaComum(Integer numero) {
        super(numero);
    }

    public ContaComum(Integer numero, Pessoa titular, Double saldo, Date dataAbertura) {
        super(numero, titular, saldo, dataAbertura);
    }    
    
}
