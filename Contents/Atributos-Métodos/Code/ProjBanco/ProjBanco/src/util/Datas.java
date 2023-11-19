/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author JaqsonUpf
 */
public class Datas {
    
    public static Integer calcularIdade(Date nascimento, Date atual){
        long lAtual = atual.getTime();
        long lNascimento = nascimento.getTime();
        long dif = lAtual - lNascimento;
        Long anos = dif/1000/60/60/24/365;
        return anos.intValue();
    }
   
    public static Date calcularVencimento(Date hoje, Integer dias){ 
        Calendar c = Calendar.getInstance();
        c.setTime(hoje);
        c.add(Calendar.DAY_OF_MONTH, dias);
        return c.getTime();
    }
    
}
