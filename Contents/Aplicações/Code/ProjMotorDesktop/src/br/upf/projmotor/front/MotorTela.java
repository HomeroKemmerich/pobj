/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.projmotor.front;

import br.upf.projmotor.dominio.Motor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JaqsonUpf
 */
public class MotorTela extends javax.swing.JFrame {

    // Atributo para ter a referência de um motor. 
    private Motor objMotor; 
    
    
    /**
     * Creates new form MotorTela
     */
    public MotorTela() {
        initComponents();
        // Instanciar o objMotor
        objMotor = new Motor(8000);
        atualizarTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmpLigado = new javax.swing.JCheckBox();
        cmpRotuloRpm = new javax.swing.JLabel();
        cmpRpmAtual = new javax.swing.JSlider();
        cmpLigar = new javax.swing.JButton();
        cmpDesligar = new javax.swing.JButton();
        cmpAcelerar = new javax.swing.JButton();
        cmpDesacelerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmpLigado.setText("Ligado");
        cmpLigado.setEnabled(false);

        cmpRotuloRpm.setText("RPM atual do motor");

        cmpRpmAtual.setMajorTickSpacing(1000);
        cmpRpmAtual.setMaximum(8000);
        cmpRpmAtual.setMinorTickSpacing(1000);
        cmpRpmAtual.setPaintLabels(true);
        cmpRpmAtual.setEnabled(false);

        cmpLigar.setText("Ligar");
        cmpLigar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpLigarActionPerformed(evt);
            }
        });

        cmpDesligar.setText("Desligar");
        cmpDesligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpDesligarActionPerformed(evt);
            }
        });

        cmpAcelerar.setText("Acelerar");
        cmpAcelerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpAcelerarActionPerformed(evt);
            }
        });

        cmpDesacelerar.setText("Desacelerar");
        cmpDesacelerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpDesacelerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmpLigar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpDesligar)
                        .addGap(47, 47, 47)
                        .addComponent(cmpAcelerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmpDesacelerar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmpLigado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmpRotuloRpm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmpRpmAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmpLigado)
                        .addComponent(cmpRotuloRpm))
                    .addComponent(cmpRpmAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpLigar)
                    .addComponent(cmpDesligar)
                    .addComponent(cmpAcelerar)
                    .addComponent(cmpDesacelerar))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmpLigarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpLigarActionPerformed
        try {
            objMotor.ligar();
            atualizarTela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        
    }//GEN-LAST:event_cmpLigarActionPerformed

    private void cmpDesligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpDesligarActionPerformed
        try {
            objMotor.desligar();
            atualizarTela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_cmpDesligarActionPerformed

    private void cmpAcelerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpAcelerarActionPerformed
        try {
            objMotor.acelerar();
            atualizarTela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_cmpAcelerarActionPerformed

    private void cmpDesacelerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpDesacelerarActionPerformed
        try {
            objMotor.desacelerar();
            atualizarTela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_cmpDesacelerarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MotorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotorTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotorTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmpAcelerar;
    private javax.swing.JButton cmpDesacelerar;
    private javax.swing.JButton cmpDesligar;
    private javax.swing.JCheckBox cmpLigado;
    private javax.swing.JButton cmpLigar;
    private javax.swing.JLabel cmpRotuloRpm;
    private javax.swing.JSlider cmpRpmAtual;
    // End of variables declaration//GEN-END:variables

    /**
     * ESte método deve usar os dados do objeto para atualizar todos os respectivos
     * componentes visuais que representam o estado do motor.
     */
    private void atualizarTela() {
       cmpLigado.setSelected( objMotor.isLigado() );
       cmpRpmAtual.setValue( objMotor.getRpmAtual() );
    }
}
