/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.ConsomeArduinoDAO;
import DAO.ControleIrrigacao;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Alvaro
 */
public class ControleManual extends javax.swing.JFrame {

    public ControleManual() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnDispersaAdubo = new javax.swing.JButton();
        BtnDispersaAgua = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle manual de irrigação");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnDispersaAdubo.setBackground(new java.awt.Color(255, 255, 255));
        BtnDispersaAdubo.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        BtnDispersaAdubo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/nature.png"))); // NOI18N
        BtnDispersaAdubo.setText("Dispersar Fertilizante");
        BtnDispersaAdubo.setBorderPainted(false);
        BtnDispersaAdubo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDispersaAdubo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnDispersaAdubo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnDispersaAdubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDispersaAduboActionPerformed(evt);
            }
        });

        BtnDispersaAgua.setBackground(new java.awt.Color(255, 255, 255));
        BtnDispersaAgua.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        BtnDispersaAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/spray.png"))); // NOI18N
        BtnDispersaAgua.setText("Dispersar Agua");
        BtnDispersaAgua.setBorderPainted(false);
        BtnDispersaAgua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDispersaAgua.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnDispersaAgua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnDispersaAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDispersaAguaActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jButton3.setText("Desliga fertilizante");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jButton4.setText("Desliga Agua");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDispersaAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnDispersaAdubo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnDispersaAgua)
                    .addComponent(BtnDispersaAdubo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDispersaAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDispersaAguaActionPerformed
        ControleIrrigacao Controle = new ControleIrrigacao();
        try {            
            ConsomeArduinoDAO RetornaUmidade = new ConsomeArduinoDAO();
            if(RetornaUmidade.getUmidadeSolo() > 70){
                int resposta = JOptionPane.showConfirmDialog(null, "A umidade esta acima de 70%\nTem certeza que deseja ativar a dispersão de agua?","Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(resposta == JOptionPane.YES_OPTION){
                    Controle.AtivaDispersao("Agua", "/On");
                }                
            }else{
                Controle.AtivaDispersao("Agua", "/On");
            }
        } catch (IOException ex) {
            Logger.getLogger(ControleManual.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_BtnDispersaAguaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ControleIrrigacao Controle = new ControleIrrigacao();
        try {
            Controle.AtivaDispersao("Agua", "/Off");
        } catch (IOException ex) {
            Logger.getLogger(ControleManual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BtnDispersaAduboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDispersaAduboActionPerformed
        ControleIrrigacao Controle = new ControleIrrigacao();
        try {
            Controle.AtivaDispersao("Adubo", "/On");
        } catch (IOException ex) {
            Logger.getLogger(ControleManual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnDispersaAduboActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ControleIrrigacao Controle = new ControleIrrigacao();
        try {
            Controle.AtivaDispersao("Adubo", "/Off");
        } catch (IOException ex) {
            Logger.getLogger(ControleManual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ControleManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleManual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDispersaAdubo;
    private javax.swing.JButton BtnDispersaAgua;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

