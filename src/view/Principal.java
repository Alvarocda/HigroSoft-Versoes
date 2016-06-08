/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.VerificaDataAtual;
import DAO.ConsomeArduinoDAO;
import DAO.ControleIrrigacao;
import DAO.CulturaDAO;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    ConfirmaSaida Saida = new ConfirmaSaida();
    private static String CulturaAtiva;
    private static String CulturaAtivaInicial;

    public Principal()throws SQLException {
        initComponents();        
        CulturaDAO retornaCulturaAtivaEAgendamentos = new CulturaDAO();
        retornaCulturaAtivaEAgendamentos.retornaCulturaAtiva();
        retornaCulturaAtivaEAgendamentos.retornaInformacoesDoAgendamento();
        CulturaAtivaInicial = retornaCulturaAtivaEAgendamentos.getNomeDaCulturaAtiva();
        if(CulturaAtivaInicial != null){
            LabelCulturaAtiva.setText(CulturaAtivaInicial);
        }else{
            LabelCulturaAtiva.setText("Nenhuma cultura esta ativa!");
        }
        
        new updateView().start();
        
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
        BtnAbreTelaCulturas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        LabelCulturaAtiva = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setTitle("HigroSoft");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setUndecorated(true);
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
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("Indica a temperatura dentro da estufa");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/thermometer16.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Temperatura");

        BarraTemperatura.setBackground(new java.awt.Color(255, 255, 255));
        BarraTemperatura.setForeground(new java.awt.Color(255, 65, 17));
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

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Umidade Ambiente");

        BarraUmidade.setBackground(new java.awt.Color(255, 255, 255));
        BarraUmidade.setForeground(new java.awt.Color(50, 179, 193));
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
        BtnAddUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
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
        BtnSobre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
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
        BtnSair.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
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

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Umidade do Solo");

        BarraUmidadeSolo.setBackground(new java.awt.Color(255, 255, 255));
        BarraUmidadeSolo.setForeground(new java.awt.Color(139, 88, 42));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jLabel5))))
        );

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Status:");

        LabelStatus.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        BtnControleManual.setBackground(new java.awt.Color(255, 255, 255));
        BtnControleManual.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
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

        BtnAbreTelaCulturas.setBackground(new java.awt.Color(255, 255, 255));
        BtnAbreTelaCulturas.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnAbreTelaCulturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/sproutPrincipal.png"))); // NOI18N
        BtnAbreTelaCulturas.setText("Culturas");
        BtnAbreTelaCulturas.setBorderPainted(false);
        BtnAbreTelaCulturas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAbreTelaCulturas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnAbreTelaCulturas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAbreTelaCulturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbreTelaCulturasActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Cultura ativa:");

        LabelCulturaAtiva.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        LabelCulturaAtiva.setText("Nenhuma");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnAddUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnAbreTelaCulturas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnControleManual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSobre)
                                .addGap(18, 18, 18)
                                .addComponent(BtnSair))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelCulturaAtiva)))
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnAddUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(BtnSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnControleManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAbreTelaCulturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(LabelCulturaAtiva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
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

    private void BtnAbreTelaCulturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbreTelaCulturasActionPerformed
        try {
            new TelaCulturas().AtualizaTabela();
            new TelaCulturas().setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnAbreTelaCulturasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CulturaDAO().retornaCulturaAtiva();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                try {
                    //Principal principal = new Principal();
                    new Principal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraTemperatura;
    private javax.swing.JProgressBar BarraUmidade;
    private javax.swing.JProgressBar BarraUmidadeSolo;
    private javax.swing.JButton BtnAbreTelaCulturas;
    private javax.swing.JButton BtnAddUsuario;
    private javax.swing.JButton BtnControleManual;
    private javax.swing.JButton BtnSair;
    private javax.swing.JButton BtnSobre;
    private javax.swing.JLabel LabelCulturaAtiva;
    private javax.swing.JLabel LabelStatus;
    private javax.swing.JLabel LabelTemp;
    private javax.swing.JLabel LabelTemperatura;
    private javax.swing.JLabel LabelUmid;
    private javax.swing.JLabel LabelUmid1;
    private javax.swing.JLabel LabelUmidadeAmbiente;
    private javax.swing.JLabel LabelUmidadeSolo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public class updateView extends Thread {

        int UmidadeMinima;

        @Override
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
                    if (Consome.getStatus() == 1) {
                        BtnControleManual.setEnabled(true);
                        LabelStatus.setForeground(Color.GREEN);
                        LabelStatus.setText("OK");

                    } else if (Consome.getStatus() == 2) {
                        BtnControleManual.setEnabled(false);
                        LabelStatus.setForeground(Color.red);
                        LabelStatus.setText("Erro ao comunicar-se com o Arduino");

                    }
                    if (Consome.getLogArduino() == 1) {
                        BtnControleManual.setEnabled(false);
                        LabelStatus.setForeground(Color.red);
                        LabelStatus.setText("Erro no sensor de umidade/temperatura");
                    } else if (Consome.getLogArduino() == 2) {
                        BtnControleManual.setEnabled(false);
                        LabelStatus.setForeground(Color.red);
                        LabelStatus.setText("Erro no sensor de umidade do solo");
                    }
                    LabelCulturaAtiva.setText(this.getLabelCulturaAtiva());
                    //if(Consome.getUmidadeSolo() <)
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                } catch (InterruptedException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

        public void setLabelCulturaAtiva(String CultAtiva) {
            CulturaAtiva = CultAtiva;
        }

        public String getLabelCulturaAtiva() {
            return CulturaAtiva;
        }
    };

    public class VerificaSeEPrecisoAtivarAIrrigacaoPorAgendamento extends Thread {
        private int DiaAtual,MesAtual,AnoAtual,HoraAtual,MinutoAtual;
        VerificaDataAtual VerificaData = new VerificaDataAtual();
        public void run() {
            while (true) {
                try {
                    Thread.sleep(60000);
                    DiaAtual = VerificaData.getDiaAtual();
                    MesAtual = VerificaData.getMesAtual();
                    

                } catch (InterruptedException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
