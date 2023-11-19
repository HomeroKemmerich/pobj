/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manutencao;

import java.io.Serializable;

/**
 *
 * @author JaqsonUpf
 */
public class Material implements Serializable{
    private Integer id;
    private String nome;

    public Material() {
    }

    public Material(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Material(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
