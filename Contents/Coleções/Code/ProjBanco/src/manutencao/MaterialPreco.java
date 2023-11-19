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
public class MaterialPreco implements Serializable{
    private Double preco;
    private Material material;
    private Fornecedor fornecedor;

    public MaterialPreco() {
    }

    public MaterialPreco(Double preco, Material material, Fornecedor fornecedor) {
        this.preco = preco;
        this.material = material;
        this.fornecedor = fornecedor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
}
