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
public class Empresa extends Pessoa{
   private String cnpj;  

    public String getCnpj() {
        // formatação!!
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        // inserir validação!!
        // formatação!!
        this.cnpj = cnpj;
    }

}
