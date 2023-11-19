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
public final class ContaPoupVariavel extends ContaPoupanca{
    private static Double taxaVariavel;

    public static Double getTaxaVariavel() {
        return taxaVariavel;
    }

    public static void setTaxaVariavel(Double aTaxaVariavel) {
        taxaVariavel = aTaxaVariavel;
    }

    public ContaPoupVariavel(Integer numero) {
        super(numero);
    }

    public ContaPoupVariavel(Integer diaAniversario, Integer numero, Pessoa titular, Double saldo, Date dataAbertura) {
        super(diaAniversario, numero, titular, saldo, dataAbertura);
    }

    
}
