/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projmotor;

import br.upf.projmotor.dominio.Motor;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JaqsonUpf
 */
public class ProjMotor {

    // Definir um motor como atributo
    static Motor objMotor;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Primeiro instanciar o objeto motor
        objMotor = new Motor(5000);
        
        while (true) {
            System.out.println("---------------------------------------------------");
            System.out.println("L=Ligar D=Desligar A=Acelerar B=Desacelerar S=Sair");
            System.out.print("Informe sua opção: ");
            char opcao = new Scanner(System.in).nextLine().charAt(0);
            System.out.println("---------------------------------------------------");

            if (opcao == 'L') {
                try {
                    objMotor.ligar();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (opcao == 'A') {
                try {
                    objMotor.acelerar();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (opcao == 'D') {
                try {
                    objMotor.desligar();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (opcao == 'B') {
                try {
                    objMotor.desacelerar();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (opcao == 'S') {
                System.exit(0); // saída normal do sistema
            }
            
            System.out.println(objMotor.getEstadoMotor());

        }
    }

}
