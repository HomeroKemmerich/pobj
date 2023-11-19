/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

/**
 *
 * @author JaqsonUpf
 */
public abstract class Pessoa {
    private Integer id;
    private String nome;
    private String telefone;
    private Endereco endereco;

    
    public void setEndereco(String nome, String numero, String complemento) {
        endereco = new Endereco();
        endereco.nome = nome;
        endereco.numero = numero;
        endereco.complemento = complemento;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private class Endereco {
        private String nome;
        private String numero;
        private String complemento;
        
        public Endereco() {
        }
    }
    
}
