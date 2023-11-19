/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import java.util.Date;
import util.Datas;

/**
 *
 * @author JaqsonUpf
 */
public class PessoaFisica extends Pessoa{
    private Double salario;
    private String cpf;
    private Date dataNascimento;
    private transient Integer idade;

    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, Date dataNascimento, Integer id, String nome) {
        super(id, nome);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public PessoaFisica(Double salario, String cpf, Date dataNascimento, Integer idade, Integer id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.salario = salario;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        idade = Datas.calcularIdade(dataNascimento, new Date());
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    
    
}
