// Definição do pacote onde está o arquivo da classe
package poo01;

import java.util.Scanner;

/**
 * Esta é uma definição da de classe. 
 * A classe sempre começa com letra maiúscula! Faz parte das convenções.
 * @author JaqsonUpf
 */
public class Poo01 {
    static int a, b; // definição de dois atributos a e b
    /**
     * Esta é uma definição de método.
     * O método main é o principal do programa. Por onde o fluxo de execução inicia.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primeiro vamos fazer uma pequena soma usando atributos.
        a = 10; // inicializamos o atributo a
        b = 30;
        System.out.println("A soma de a e b é: " + (a+b) );    
        b = 200;
        // Agora usando mensagem para um método
        mostrarSoma(a, b); // mensagem
        // Agora usando uma mensagem para um método com retorno
        System.out.println("A soma obtida é " + obterSoma(a, b));
        System.out.println("---------------------------------------");
        testarRepeticoes();
        System.out.println("---------------------------------------");
        testeInput();
        
    }

    private static void mostrarSoma(int a, int b) {
       System.out.println("A soma de a e b é: " + (a+b) );  
    }

    private static int obterSoma(int a, int b) {
        return a + b; 
    }

    private static void testarRepeticoes() {
        System.out.println("Teste com for");
        for(int i = 1; i <= a; i++ ){
            System.out.print(i+" ");
        }
        System.out.println("Teste com while");
        a = 100;
        while(a <= b){
            a++;
            if(a >= 130 && a <= 150)
                continue;
            if (a == 170)
                break;
            System.out.print(a+" ");
                
        }
    }

    private static void testeInput() {
        System.out.print("Informe um valor para a: ");
        a = new Scanner(System.in).nextInt();
         System.out.print("Informe um valor para b: ");
        b = new Scanner(System.in).nextInt();
        mostrarSoma(a, b);
    }
    
}
