/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import cadastros.Pessoa;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JaqsonUpf
 */
public abstract class Conta implements ContaOperacoes, LogConsole {
   private final Integer numero;
   private Pessoa titular; 
    protected Double saldo;
    private Date dataAbertura;
    // referência para as partes = movimentos
    private List<Movimento> movimentos;

    @Override
    public List<Movimento> emitirExtrato() {
       return getMovimentos(); 
    }

    @Override
    public void criarMovimento(Movimento mov) {
       // por ser composição a parte deve referenciar o todo e o todo ter referencia das partes
       getMovimentos().add(mov); // o todo recebe a parte
       mov.setConta(this); // a parte referencia o todo
       mostrarMovNoConsole(mov);
    }

    @Override
    public void mostrarMovNoConsole(Movimento mov) {
        System.out.println(
            this.getClass().getSimpleName()+" | "+
            this.numero+" | "+
            mov.getTipo()+" | "+
            mov.getValor()+" | "+
            mov.getDataHora());
    }
    
    public Conta(Integer numero) {
        this.numero = numero;
        movimentos = new ArrayList<>();
    }

    public Conta(Integer numero, Pessoa titular, Double saldo, Date dataAbertura) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        movimentos = new ArrayList<>();
    }
   
    public abstract void saque(Double valor) throws Exception; 
    
    public final void deposito(Double valor){
        System.out.println("Depósito pelo caixa. ");
        saldo += valor;
        criarMovimento(new Movimento(
                null, new Date(), valor, "Deposito", "Pelo caixa"));
    }
    
    public final void deposito(Double valor, Integer idTerminal){
        System.out.println("Depósito por terminal id: "+idTerminal);
        saldo += valor;
        criarMovimento(new Movimento(
                null, new Date(), valor, "Deposito", "Pelo terminal id: "+idTerminal));
    }
    
    public final void deposito(Double valor, String idSessao){
        System.out.println("Depósito por web sessão: "+idSessao);
        saldo += valor;
        criarMovimento(new Movimento(
                null, new Date(), valor, "Deposito", "Pela web sessão: "+idSessao));
    }    
    
    public void transferencia(Double valor, Conta destino) throws Exception{
        if (valor <= saldo){
            saldo -= valor;
            destino.saldo += valor;
            criarMovimento(new Movimento(
                null, new Date(), valor, "Saida por Transferência", "Para a conta: "+destino.numero));
            destino.criarMovimento(new Movimento(
                null, new Date(), valor, "Entrada por Transferência", "Da conta: "+numero));
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

    public List<Movimento> getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(List<Movimento> movimentos) {
        this.movimentos = movimentos;
    }
    
}

