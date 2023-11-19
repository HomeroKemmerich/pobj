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
public final class ContaEspecial extends Conta{

    private Double limite;

    @Override
    public void transferencia(Double valor, Conta destino) throws Exception {
        if (valor <= (saldo + limite)){
            saldo -= valor;
            destino.saldo += valor;
            criarMovimento(new Movimento(
                null, new Date(), valor, "Saida por Transferência", "Para a conta: "+destino.getNumero()));
            destino.criarMovimento(new Movimento(
                null, new Date(), valor, "Entrada por Transferência", "Da conta: "+getNumero()));
        } else
            throw new Exception("Não tem saldo para a transferência.");        
    }
    
    @Override
    public void saque(Double valor) throws Exception{
        if (valor <= (saldo + getLimite())){
           saldo -= valor;
           criarMovimento(new Movimento(null, new Date(), valor, "Saque", "Conta Especial"));
        }else
            throw new Exception("Não tem saldo para o saque.");
    }

    public ContaEspecial(Integer numero) {
        super(numero);
    }

    public ContaEspecial(Double limite, Integer numero, Pessoa titular, Double saldo, Date dataAbertura) {
        super(numero, titular, saldo, dataAbertura);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    
    
    
}
