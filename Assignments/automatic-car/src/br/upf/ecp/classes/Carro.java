/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.ecp.classes;

/**
 *
 * @author kemme
 */
public class Carro {
    private String Placa;
    
    private Boolean Ligado;
    
    private Integer Rpm;    
    
    private Character Marcha;
    
    public void Carro(String Placa){
        this.Placa = Placa;
    }
    
    public void power()throws Exception{
        //Caso o carro esteja desligado
        if(!Ligado){
            //Checa se está em ponto morto
            if(Marcha == 'P'){
                //Checa se o RPM é 0
                if(Rpm == 0){
                    //Liga
                    Rpm = 1000;
                    Marcha = '1';
                }
            }
        } else {//Caso o carro esteja ligado
            //Se o RPM for 1000
            if(Rpm == 1000){
                //Desliga
                Rpm = 0;
            } else {
                throw new Exception("Para desligar é necessário que o RPM seja 1000");
            }
        }
    }
    
    public void acelerar() throws Exception{
        //Verifica se o carro está ligado
        if(Ligado){
            //Verifica se atingiu o limite de rotações por minuto
            if(Rpm >= 8000){
                throw new Exception ("Limite de rotações por minuto atingido");
            } else {
                Rpm += 1000;
            }
            
            //Verifica se as rotações alcançaram 4000 RPM
            if(Rpm == 4000){
                //Se não for a 6a, reduz o RPM e incrementa a marcha
                if(Marcha < '6'){
                    Marcha ++;
                }
                Rpm = 2000;
            }
        }
    }
    
    public void desacelerar() throws Exception{
        if(Ligado){
            if(Marcha != 'P'){
                if(Rpm == 1000){
                    throw new Exception ("O veículo já está realizando o mínimo"
                            + " de rotações possível");
                } else {
                    Rpm -= 1000;
                    if(Marcha >= '2'){
                        if(Rpm == 2000){
                            Marcha --;
                            Rpm = 4000;
                        }
                    } else{
                        if(Marcha == '1' && Rpm == 1000){
                            Marcha = 'P';
                        }
                    }
                }            
                
            } else {
                throw new Exception ("O veículo já está na menor marcha possível");
            }
        }
    }

    public String getPlaca() {
        return Placa;
    }

    public Boolean getLigado() {
        return Ligado;
    }

    public Integer getRpm() {
        return Rpm;
    }

    public Character getMarcha() {
        return Marcha;
    }
    
    
}
