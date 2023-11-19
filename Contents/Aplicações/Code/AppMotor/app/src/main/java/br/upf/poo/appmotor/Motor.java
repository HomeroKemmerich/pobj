package br.upf.poo.appmotor;

/**
 * Classe que será usada para definir as características de um motor. 
 * As instâncias de motor serão controladas a partir de objetos de front-end.
 * @author JaqsonUpf
 */
public class Motor {
    /**
     * Irá controlar se o motor está ligado ou desligado.
     */
    private boolean ligado;
    /**
     * Representa o valor máximo de rpmAtual que o motor pode trabalhar.
     */
    private int rpmMaximo;
    /**
     * Respresenta a velocidade atual que o motor está trabalhando
     */
    private int rpmAtual;
    
    /**
     * Método construtor responsável pela inicialização de atributros do objeto
     * @param rpmMaximo É o atrubuto a ser inicializado
     */
    public Motor(int rpmMaximo) {
        this.rpmMaximo = rpmMaximo;
    }
    
    public void ligar() throws Exception{
        if (ligado == false){
            ligado = true;
            rpmAtual = 1000;
        } else {
            throw new Exception("O motor ja está ligado!");
        }
    }
    
    public void desligar() throws Exception{
        if (ligado == true){
            ligado = false;
            rpmAtual = 0;
        } else {
            throw new Exception("O motor ja está desligado!");
        }
    }    
    
    public void acelerar() throws Exception{
        if (ligado == true){
            if (rpmAtual == rpmMaximo)
                throw new Exception("O motor está na aceleração máxima!");
            rpmAtual += 1000;
        } else {
            throw new Exception("O motor está desligado!");
        }
    }    
    
    public void desacelerar() throws Exception{
        if (ligado == true){
            if (rpmAtual == 1000)
                throw new Exception("O motor está na aceleração mínima!");
            rpmAtual -= 1000;
        } else {
            throw new Exception("O motor está desligado!");
        }
    }     
    
    public String getEstadoMotor(){
        return "O motor está "+
                (ligado?"ligado":"desligado")+
                " com "+rpmAtual+" RPM.";
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getRpmMaximo() {
        return rpmMaximo;
    }

    public int getRpmAtual() {
        return rpmAtual;
    }
    
}
