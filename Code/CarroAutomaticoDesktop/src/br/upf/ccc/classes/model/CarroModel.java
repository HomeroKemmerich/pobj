package br.upf.ccc.classes.model;

/**
    *
    * @author Geanfrancesco Fiorini
*/
public class CarroModel {
    private String placa;
    private boolean ligado;
    private int rpmAtual;
    private int rpmMinimo = 0;
    private int rpmMaximo = 8000;
    private char marcha;

    public CarroModel(String placa) {
        this.placa = placa;
        this.rpmAtual = 0;
        this.marcha = 'P';
        this.ligado = false;
    }

    /**
        * Metodo que irá ligar ou desligar o carro
        * Ligar ou Desligar somente se a marchar estiver em P
        * Ao ligar setar @rpmAtual para 1000, so ligar se estiver com 0 rpm.
        * Ao desligar setar @rpmAtual para 0, so desligar se estiver com 1000 rpm. 
    */
    public void power() throws Exception {
        if (this.ligado) {
            if (this.rpmAtual == 1000) {
                this.rpmAtual = this.rpmMinimo;
                this.ligado = false;
                this.marcha = 'P';
            } else {
                throw new Exception("Para desligar o carro o RPM deve ser 1000!!!");
            }
        } else {
            if (this.rpmAtual == 0 && this.marcha == 'P') {
                this.rpmAtual = 1000;
                this.ligado = true;
                this.marcha = '1';
            } else {
                throw new Exception("Para desligar o carro a marcha deve ser a P e o RPM ser 0 (zero)!!!");
            }
        }
    }

    /**
        * O método acelerar(), deve incrementar rpm de 1000 em 1000 até no máximo 8000.
        * Só pode acelerar se estiver ligado.
        * Sempre que acelerar e passar de 4000 rpm deve incrementar uma marcha e retornar o rpm para 2000, respeitando a marcha e rpm máximos.
        * @throws Exception
    */
    public void acelerar() throws Exception {
        if (this.ligado) {
            if (this.rpmAtual < this.rpmMaximo) {
                this.rpmAtual += 1000;

                if ((this.rpmAtual >= 4000 && this.marcha < '6') || this.marcha == 'P') {
                    this.rpmAtual = 2000;
                    this.acrescentaMarcha();
                }
            } else {
                throw new Exception("O RPM está no máximo!!!");
            }
        } else {
            throw new Exception("Para acelerar o carro deve estar ligado !!!");
        }
    }

    /**
        * O método desacelerar(), deve decrementar rpm de 1000 em 1000 até no mínimo 1000.
        * Só pode desacelerar se estiver ligado e marcha diferente de P.
        * Sempre que estiver acima da segunda marcha e desacelerar, quando as rpm chegarem em 2000 deve decrementar a marcha e setar rpm para 4000.
        * Quando estiver em marcha 1 pode desacelerar até 1000 rpm, neste caso setar a marca para P.
        * @throws Exception
    */
    public void desacelerar() throws Exception {
        if (this.ligado) {
            if (this.marcha != 'P' && this.rpmAtual > 1000) {
                this.rpmAtual -= 1000;

                if (this.marcha >= '2' && this.rpmAtual <= 2000) {
                    this.rpmAtual = 4000;
                    this.decremetaMarcha();
                }
            }else if (this.marcha == '1' && this.rpmAtual == 1000) {
                this.marcha = 'P';
            } else {
                throw new Exception("O carro está parado!!!");
            }

        } else {
            throw new Exception("O carro deve estar ligado!!!");
        }
    }

    /**
        *  Faz o tratamento quando há o incremento de marcha.
        * @throws Exception
    */
    private void acrescentaMarcha() throws Exception {
        if (this.marcha == 'P') {
            this.marcha = '1';
        } else {
            if (this.marcha < '6') {
                int auxiliar = Integer.parseInt(String.valueOf(this.marcha)) + 1;
                this.marcha = Integer.toString(auxiliar).charAt(0);
            } else {
                throw new Exception("A marcha está no máximo!!!");
            }
        }
    }

     /**
        *  Faz o tratamento quando há o decremento de marcha.
        * @throws Exception
    */
    private void decremetaMarcha(){
        if (this.marcha > '1') {
            int auxiliar = Integer.parseInt(String.valueOf(this.marcha)) - 1;
            this.marcha = Integer.toString(auxiliar).charAt(0);
        }
    }

    public String getPlaca() {
        return this.placa;
    }
    
    public boolean getLigado() {
        return this.ligado;
    }

    public int getRpm() {
        return this.rpmAtual;
    }

    public char getMarcha() {
        return this.marcha;
    }

    public void getEstadoCarro() {
        System.out.println("O carro (" + this.getPlaca() + ") está " + (this.getLigado() ? "ligado" : "desligado") + " com " + this.rpmAtual + " RPM, marcha " + this.getMarcha());
    }
}