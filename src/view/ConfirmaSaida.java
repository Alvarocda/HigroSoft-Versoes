package view;

public class ConfirmaSaida extends javax.swing.JFrame {
    public ConfirmaSaida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnNaoSair = new javax.swing.JButton();
        BtnSimSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sair");
        setAlwaysOnTop(true);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Deseja realmente sair?");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 24, -1, -1));

        BtnNaoSair.setBackground(new java.awt.Color(255, 255, 255));
        BtnNaoSair.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        BtnNaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Cancel-48.png"))); // NOI18N
        BtnNaoSair.setText("Não");
        BtnNaoSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnNaoSair.setSelected(true);
        BtnNaoSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnNaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNaoSairActionPerformed(evt);
            }
        });
        jPanel1.add(BtnNaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 95, 77, -1));

        BtnSimSair.setBackground(new java.awt.Color(255, 255, 255));
        BtnSimSair.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        BtnSimSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Checked-48.png"))); // NOI18N
        BtnSimSair.setText("Sim");
        BtnSimSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSimSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSimSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimSairActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSimSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 95, 77, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 210));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNaoSairActionPerformed
        this.dispose();        
    }//GEN-LAST:event_BtnNaoSairActionPerformed

    private void BtnSimSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimSairActionPerformed
        System.exit(0);    
    }//GEN-LAST:event_BtnSimSairActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmaSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmaSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmaSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmaSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmaSaida().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNaoSair;
    private javax.swing.JButton BtnSimSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
