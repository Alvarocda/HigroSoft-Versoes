/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.ConsomeArduinoDAO;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class Principal extends javax.swing.JFrame {

    ConfirmaSaida Saida = new ConfirmaSaida();
    
    public Principal() {
        new updateView().start();        
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelTemp = new javax.swing.JLabel();
        BarraTemperatura = new javax.swing.JProgressBar();
        LabelTemperatura = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelUmid = new javax.swing.JLabel();
        BarraUmidade = new javax.swing.JProgressBar();
        LabelUmidadeAmbiente = new javax.swing.JLabel();
        BtnAddUsuario = new javax.swing.JButton();
        BtnSobre = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        LabelUmid1 = new javax.swing.JLabel();
        BarraUmidadeSolo = new javax.swing.JProgressBar();
        LabelUmidadeSolo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabelStatus = new javax.swing.JLabel();
        BtnControleManual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("HigroSoft");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("Indica a temperatura dentro da estufa");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/thermometer16.png"))); // NOI18N

        jLabel4.setText("Temperatura");

        BarraTemperatura.setBackground(new java.awt.Color(255, 255, 255));
        BarraTemperatura.setForeground(Color.RED);
        BarraTemperatura.setOrientation(1);
        BarraTemperatura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BarraTemperatura.setEnabled(false);

        LabelTemperatura.setText("ºC");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(BarraTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelTemp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelTemperatura)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BarraTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTemp)
                            .addComponent(LabelTemperatura))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("Indica a umidade do ambiente");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/liquid15.png"))); // NOI18N

        jLabel2.setText("Umidade Ambiente");

        BarraUmidade.setBackground(new java.awt.Color(255, 255, 255));
        BarraUmidade.setForeground(new java.awt.Color(51, 102, 255));
        BarraUmidade.setOrientation(1);
        BarraUmidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BarraUmidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LabelUmidadeAmbiente.setText("%");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(BarraUmidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelUmid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelUmidadeAmbiente))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelUmid)
                            .addComponent(LabelUmidadeAmbiente)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(BarraUmidade, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        BtnAddUsuario.setBackground(new java.awt.Color(255, 255, 255));
        BtnAddUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Add User-48.png"))); // NOI18N
        BtnAddUsuario.setText("Novo Usuario");
        BtnAddUsuario.setToolTipText("Clique para adicionar novos Usuarios");
        BtnAddUsuario.setBorderPainted(false);
        BtnAddUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAddUsuario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnAddUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAddUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddUsuarioActionPerformed(evt);
            }
        });

        BtnSobre.setBackground(new java.awt.Color(255, 255, 255));
        BtnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/About Us-48.png"))); // NOI18N
        BtnSobre.setText("Sobre");
        BtnSobre.setToolTipText("Clique para saber mais sobre o Software");
        BtnSobre.setBorderPainted(false);
        BtnSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSobre.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSobreActionPerformed(evt);
            }
        });

        BtnSair.setBackground(new java.awt.Color(255, 255, 255));
        BtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Export-48.png"))); // NOI18N
        BtnSair.setText("Sair");
        BtnSair.setToolTipText("Clique para sair do Software");
        BtnSair.setBorderPainted(false);
        BtnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSair.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setToolTipText("Indica a umidade do solo");

        jLabel8.setText("Umidade do Solo");

        BarraUmidadeSolo.setBackground(new java.awt.Color(255, 255, 255));
        BarraUmidadeSolo.setForeground(new java.awt.Color(116, 71, 29));
        BarraUmidadeSolo.setOrientation(1);
        BarraUmidadeSolo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BarraUmidadeSolo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LabelUmidadeSolo.setText("%");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/UmidadeSolo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(BarraUmidadeSolo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelUmid1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelUmidadeSolo))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelUmid1)
                            .addComponent(LabelUmidadeSolo)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(BarraUmidadeSolo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Status:");

        BtnControleManual.setBackground(new java.awt.Color(255, 255, 255));
        BtnControleManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Settings-48.png"))); // NOI18N
        BtnControleManual.setText("Controle Manual");
        BtnControleManual.setBorderPainted(false);
        BtnControleManual.setEnabled(false);
        BtnControleManual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnControleManual.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnControleManual.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnControleManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnControleManualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BtnAddUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BtnSobre)
                                .addGap(30, 30, 30)
                                .addComponent(BtnControleManual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnSair))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnAddUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSobre, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(BtnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(BtnControleManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddUsuarioActionPerformed
        new RegistroUsuario().setVisible(true);
    }//GEN-LAST:event_BtnAddUsuarioActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        new ConfirmaSaida().setVisible(true);
    }//GEN-LAST:event_BtnSairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new ConfirmaSaida().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void BtnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSobreActionPerformed
        new TelaSobre().setVisible(true);
    }//GEN-LAST:event_BtnSobreActionPerformed

    private void BtnControleManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnControleManualActionPerformed
        new ControleManual().setVisible(true);
    }//GEN-LAST:event_BtnControleManualActionPerformed

   
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal principal = new Principal();
                principal.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraTemperatura;
    private javax.swing.JProgressBar BarraUmidade;
    private javax.swing.JProgressBar BarraUmidadeSolo;
    private javax.swing.JButton BtnAddUsuario;
    private javax.swing.JButton BtnControleManual;
    private javax.swing.JButton BtnSair;
    private javax.swing.JButton BtnSobre;
    private javax.swing.JLabel LabelStatus;
    private javax.swing.JLabel LabelTemp;
    private javax.swing.JLabel LabelTemperatura;
    private javax.swing.JLabel LabelUmid;
    private javax.swing.JLabel LabelUmid1;
    private javax.swing.JLabel LabelUmidadeAmbiente;
    private javax.swing.JLabel LabelUmidadeSolo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public class updateView extends Thread {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    ConsomeArduinoDAO Consome = new ConsomeArduinoDAO();
                    BarraUmidadeSolo.setValue((int) Math.round(Consome.getUmidadeSolo()));
                    BarraTemperatura.setValue((int) Math.round(Consome.getTemperatura()));
                    BarraUmidade.setValue((int) Math.round(Consome.getUmidadeAmbiente()));
                    LabelTemperatura.setText(Consome.getTemperatura() + "ºC");
                    LabelUmidadeAmbiente.setText(Consome.getUmidadeAmbiente() + "%");
                    LabelUmidadeSolo.setText(Consome.getUmidadeSolo() + "%");
                    if(Consome.getStatus() == 1){
                        BtnControleManual.setEnabled(true);
                        LabelStatus.setForeground(Color.GREEN);
                        LabelStatus.setText("OK");
                        
                    }else if(Consome.getStatus() == 2){
                        BtnControleManual.setEnabled(false);
                        LabelStatus.setForeground(Color.red);
                        LabelStatus.setText("Erro ao comunicar-se com o Arduino");
                        
                    }
                    if(Consome.getLogArduino() == 1){
                        BtnControleManual.setEnabled(false);
                        LabelStatus.setForeground(Color.red);
                        LabelStatus.setText("Erro no sensor de umidade/temperatura");
                    }else if(Consome.getLogArduino() == 2){
                        BtnControleManual.setEnabled(false);
                        LabelStatus.setForeground(Color.red);
                        LabelStatus.setText("Erro no sensor de umidade do solo");
                    }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                } catch (InterruptedException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    };
}
