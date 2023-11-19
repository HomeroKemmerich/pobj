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
public class ContaEmprestimo extends Conta{
    private static Double taxaJuro;

    public static Double getTaxaJuro() {
        return taxaJuro;
    }

    public static void setTaxaJuro(Double aTaxaJuro) {
        taxaJuro = aTaxaJuro;
    }

    public ContaEmprestimo(Integer numero) {
        super(numero);
    }

    public ContaEmprestimo(Integer numero, Pessoa titular, Double saldo, Date dataAbertura) {
        super(numero, titular, saldo, dataAbertura);
    }
    
    @Override
    public void saque(Double valor) throws Exception{
        if (valor <= saldo){
           saldo -= valor;
           criarMovimento(new Movimento(null, new Date(), valor, "Saque", "Conta Empréstimo"));
        }else
            throw new Exception("Não tem saldo para o saque.");
    }
}
