/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import java.util.Date;

/**
 *
 * @author JaqsonUpf
 */
public class Movimento {
    private Integer id;
    private Date dataHora;
    private Double valor;
    private String tipo;
    private String observacao;

    public Movimento() {
    }

    public Movimento(Integer id) {
        this.id = id;
    }

    public Movimento(Integer id, Date dataHora, Double valor, String tipo, String observacao) {
        this.id = id;
        this.dataHora = dataHora;
        this.valor = valor;
        this.tipo = tipo;
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
