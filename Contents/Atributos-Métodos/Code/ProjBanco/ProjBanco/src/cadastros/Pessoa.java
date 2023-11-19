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
    private final Integer id;
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Pessoa(){
       id = 0; // gerar o próximo código... 
    }

    public Pessoa(Integer id) {
        this.id = id;
    }

    public Pessoa(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(Integer id, String nome, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public void setEndereco(String nome, String numero, String complemento) {
        endereco = new Endereco();
        endereco.nome = nome;
        endereco.numero = numero;
        endereco.complemento = complemento;
    }
    
    public Integer getId() {
        return id;
    }

/*  alteramos para final e não pode mais modificar o id
    public void setId(Integer id) {
        this.id = id;
    }
*/
    
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

    protected class Endereco {
        private String nome;
        private String numero;
        private String complemento;
        
        public Endereco() {
        }
    }
    
}
