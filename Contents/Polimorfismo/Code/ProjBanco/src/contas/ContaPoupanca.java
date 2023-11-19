/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import cadastros.Pessoa;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author JaqsonUpf
 */
public class ContaPoupanca extends Conta {
   private Integer diaAniversario; 

    @Override
    public void saque(Double valor) throws Exception{
        Calendar hoje = Calendar.getInstance(); // pega data atual
        if (hoje.get(Calendar.DAY_OF_MONTH) != diaAniversario) 
            throw new Exception("Não está no dia do aniversário da conta.");
        if (valor > saldo)
          throw new Exception("Não tem saldo para o saque.");
        saldo -= valor;
        criarMovimento(new Movimento(null, new Date(), valor, "Saque", "Conta Poupança"));
    }
    
    @Override
    public void transferencia(Double valor, Conta destino) throws Exception {
       Calendar hoje = Calendar.getInstance(); // pega data atual
        if (hoje.get(Calendar.DAY_OF_MONTH) != diaAniversario) 
            throw new Exception("Não está no dia do aniversário da conta.");
        if (valor > saldo)
          throw new Exception("Não tem saldo para a transferência.");
        saldo -= valor;
        destino.saldo += valor;
        criarMovimento(new Movimento(
           null, new Date(), valor, "Saida por Transferência", "Para a conta: "+destino.getNumero()));
        destino.criarMovimento(new Movimento(
           null, new Date(), valor, "Entrada por Transferência", "Da conta: "+getNumero()));
    }    

    public ContaPoupanca(Integer numero) {
        super(numero);
    }

    public ContaPoupanca(Integer diaAniversario, Integer numero, Pessoa titular, Double saldo, Date dataAbertura) {
        super(numero, titular, saldo, dataAbertura);
        this.diaAniversario = diaAniversario;
    }
    
    
   
    public Integer getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(Integer diaAniversario) {
        this.diaAniversario = diaAniversario;
    }
}
