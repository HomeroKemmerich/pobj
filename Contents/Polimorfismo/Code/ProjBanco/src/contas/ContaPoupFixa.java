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
public final class ContaPoupFixa extends ContaPoupanca{
    private static Double taxaFixa; // variável de classe

    public ContaPoupFixa(Integer numero) {
        super(numero);
    }

    public ContaPoupFixa(Integer diaAniversario, Integer numero, Pessoa titular, Double saldo, Date dataAbertura) {
        super(diaAniversario, numero, titular, saldo, dataAbertura);
    }
    
    public static Double getTaxaFixa() {
        return taxaFixa;
    }

    public static void setTaxaFixa(Double aTaxaFixa) {
        taxaFixa = aTaxaFixa;
    }
}
