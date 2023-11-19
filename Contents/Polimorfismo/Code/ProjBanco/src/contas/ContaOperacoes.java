/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import java.util.List;

/**
 * Interface que define operações a serem impelemtadas por métodos em classes
 * Conta e suas descendentes.
 * @author JaqsonUpf
 */
public interface ContaOperacoes {
    /**
     * Este método deve ser chamado após cada operação em contas (depósito, saque, ...).
     * Deve receber um objeto que representa este movimento com dia, hora, tipo, valor e obs.
     * @param mov é o objeto que representa o movimento que deve ser adicionado a lista de movimentos
     * da conta.
     */
    public abstract void criarMovimento(Movimento mov);
    /**
     * Deve retornar a lista com todos os movimentos na conta.
     * @return 
     */
    public List<Movimento> emitirExtrato();
    
}
