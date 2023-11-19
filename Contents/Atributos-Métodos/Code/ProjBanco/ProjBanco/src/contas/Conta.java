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
public abstract class Conta {
   private final Integer numero;
   private Pessoa titular; 
    protected Double saldo;
    private Date dataAbertura;

    public Conta(Integer numero) {
        this.numero = numero;
    }

    public Conta(Integer numero, Pessoa titular, Double saldo, Date dataAbertura) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }
   
    public abstract void saque(Double valor) throws Exception; 
    
    public final void deposito(Double valor){
        saldo += valor;
    }
    
    public void transferencia(Double valor, Conta destino) throws Exception{
        if (valor <= saldo){
            saldo -= valor;
            destino.saldo += valor;
        } else
            throw new Exception("Não tem saldo para a transferência.");
    }
    
   
    public Integer getNumero() {
        return numero;
    }

    /*
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    */

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    /* Não vamos permitir mexer no saldo ser por meio de um movimento
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    */
    
    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
}

