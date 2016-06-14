/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.CulturaDAO;
import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.Principal;

/**
 *
 * @author Alvaro
 */
public class ViewAgendamentoIrrigacao extends javax.swing.JFrame {

    private static String NomeCultura, UsuarioQueAgendou;
    private static int id_cultura;

    private int DiaInicial, DiaFinal, MesInicial, MesFinal, AnoInicial, AnoFinal,DiaAtual,MesAtual,AnoAtual;

    public ViewAgendamentoIrrigacao() {
        initComponents();
    }

    /**
     * para que essa view funcione corretamente, quem for continuar a parte do código precisara usar uma biblioteca
     * chamada JCalendar que esta disponivel em.: http://toedter.com/jcalendar/
     * Alem de importar as bibliotecas para dento do projeto, você também deve adicionar ela ao NetBeans
     * Clique em "Tools" na parte superior da tela do netbeans, depois em "Paletes" e depois clique em
     * Swing/AWT Components, clique em "New Category" e coloque o nome de JCalendar
     * Depois clique em Add from JAR e adicione a todos os .jar da biblioteca JCalendar
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelCulturaAgendamento = new javax.swing.JLabel();
        BtnAgendar = new javax.swing.JButton();
        BtnCancelarAgendamento = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        CalendarioInicial = new com.toedter.calendar.JCalendar();
        TxtDiaInicial = new javax.swing.JTextField();
        TxtAnoInicial = new javax.swing.JTextField();
        TxtMesInicial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CalendarioFinal = new com.toedter.calendar.JCalendar();
        jLabel6 = new javax.swing.JLabel();
        TxtDiaFinal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtMesFinal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtAnoFinal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agendar irrigação");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agendar irrigação");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Cultura selecionada.:");

        LabelCulturaAgendamento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        BtnAgendar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnAgendar.setText("Agendar");
        BtnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgendarActionPerformed(evt);
            }
        });

        BtnCancelarAgendamento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnCancelarAgendamento.setText("Cancelar");
        BtnCancelarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarAgendamentoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "De.:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N

        TxtDiaInicial.setEditable(false);
        TxtDiaInicial.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, CalendarioInicial, org.jdesktop.beansbinding.ELProperty.create("${dayChooser.day}"), TxtDiaInicial, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        TxtAnoInicial.setEditable(false);
        TxtAnoInicial.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, CalendarioInicial, org.jdesktop.beansbinding.ELProperty.create("${yearChooser.year}"), TxtAnoInicial, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        TxtMesInicial.setEditable(false);
        TxtMesInicial.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, CalendarioInicial, org.jdesktop.beansbinding.ELProperty.create("${monthChooser.month}"), TxtMesInicial, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Dia:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Mês:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setText("Ano:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CalendarioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDiaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtMesInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtAnoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(CalendarioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDiaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAnoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMesInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Até.:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setText("Dia:");

        TxtDiaFinal.setEditable(false);
        TxtDiaFinal.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, CalendarioFinal, org.jdesktop.beansbinding.ELProperty.create("${dayChooser.day}"), TxtDiaFinal, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setText("Mês");

        TxtMesFinal.setEditable(false);
        TxtMesFinal.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, CalendarioFinal, org.jdesktop.beansbinding.ELProperty.create("${monthChooser.month}"), TxtMesFinal, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setText("Ano:");

        TxtAnoFinal.setEditable(false);
        TxtAnoFinal.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, CalendarioFinal, org.jdesktop.beansbinding.ELProperty.create("${yearChooser.year}"), TxtAnoFinal, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CalendarioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtMesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtAnoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(CalendarioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TxtMesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TxtAnoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelCulturaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(BtnCancelarAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(LabelCulturaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgendar)
                    .addComponent(BtnCancelarAgendamento))
                .addGap(260, 260, 260))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarAgendamentoActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarAgendamentoActionPerformed

    private void BtnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgendarActionPerformed
        Calendar Calendario = new GregorianCalendar();
        Calendario.setTimeInMillis(System.currentTimeMillis());
        DiaAtual = Calendario.get(Calendar.DAY_OF_MONTH);
        MesAtual = Calendario.get(Calendar.MONTH);
        MesAtual = MesAtual + 1; //Segundo a documentação da função Calendar, o java começa a contar primeiro mês com o numero 0, então o mes de Janeiro é o mes 0 pra ele, por isso o +1
        AnoAtual = Calendario.get(Calendar.YEAR);
        DiaInicial = Integer.parseInt(TxtDiaInicial.getText());
        MesInicial = Integer.parseInt(TxtMesInicial.getText());
        MesInicial = MesInicial + 1;
        AnoInicial = Integer.parseInt(TxtAnoInicial.getText());
        DiaFinal = Integer.parseInt(TxtDiaFinal.getText());
        MesFinal = Integer.parseInt(TxtMesFinal.getText());
        MesFinal = MesFinal + 1;
        AnoFinal = Integer.parseInt(TxtAnoFinal.getText());
        CulturaDAO Agendamento = new CulturaDAO();
       if(DiaInicial < DiaAtual || MesInicial < MesAtual || AnoInicial < AnoAtual){ //Verifica se a data para iniciar
           JOptionPane.showMessageDialog(null, "Por favor, insira uma data valida");//as irrigações não são menores que a data atual
           //JOptionPane.showMessageDialog(null, "Dia: "+DiaInicial+"\nMês: "+MesInicial+"\nFinal: "+DiaFinal+"\nFinalM"+MesFinal);
       }else if(AnoFinal > AnoInicial){
           try {
                //JOptionPane.showMessageDialog(null, "Dia: "+DiaInicial+"\nMês: "+MesInicial+"\nFinal: "+DiaFinal+"\nFinalM"+MesFinal);
                Agendamento.insereAgendamento(this.getUsuarioQueAgendou(), this.getId(), DiaInicial, MesInicial,AnoInicial, DiaFinal, MesFinal, AnoFinal);
                Principal principal = new Principal();  
                Principal.VerificaSeEPrecisoAtivarAIrrigacaoPorAgendamento AtivaAgendamento = principal.new VerificaSeEPrecisoAtivarAIrrigacaoPorAgendamento();
                AtivaAgendamento.setDiaFinal(DiaFinal);
                AtivaAgendamento.setDiaInicial(DiaInicial);
                AtivaAgendamento.setMesFinal(MesFinal);
                AtivaAgendamento.setMesInicial(MesInicial);
                AtivaAgendamento.start();
                
            } catch (SQLException ex) {
                Logger.getLogger(ViewAgendamentoIrrigacao.class.getName()).log(Level.SEVERE, null, ex);
            }
       }else if(DiaFinal < DiaInicial || MesFinal < MesInicial || AnoFinal < AnoInicial){ //Verifica se a data final não é menor que a data inicial
           JOptionPane.showMessageDialog(null, "Por favor, insira uma data valida");
           //JOptionPane.showMessageDialog(null, "Dia: "+DiaInicial+"\nMês: "+MesInicial+"\nFinal: "+DiaFinal+"\nFinalM"+MesFinal);
       }
       else{
           try {
                Agendamento.insereAgendamento(this.getUsuarioQueAgendou(), this.getId(), DiaInicial, MesInicial,AnoInicial, DiaFinal, MesFinal, AnoFinal);
                Principal principal = new Principal();  
                Principal.VerificaSeEPrecisoAtivarAIrrigacaoPorAgendamento AtivaAgendamento = principal.new VerificaSeEPrecisoAtivarAIrrigacaoPorAgendamento();
                AtivaAgendamento.setDiaFinal(DiaFinal);
                AtivaAgendamento.setDiaInicial(DiaInicial);
                AtivaAgendamento.setMesFinal(MesFinal);
                AtivaAgendamento.setMesInicial(MesInicial);
                AtivaAgendamento.start();
                dispose();
                //JOptionPane.showMessageDialog(null, "Dia: "+DiaInicial+"\nMês: "+MesInicial+"\nFinal: "+DiaFinal+"\nFinalM"+MesFinal);
            } catch (SQLException ex) {
                Logger.getLogger(ViewAgendamentoIrrigacao.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }//GEN-LAST:event_BtnAgendarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAgendamentoIrrigacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAgendamentoIrrigacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAgendamentoIrrigacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAgendamentoIrrigacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAgendamentoIrrigacao().setVisible(true);
            }
        });
    }

    public void setNomeCultura(String CultName) {
        NomeCultura = CultName;
    }

    public static String getNomeCultura() {
        return NomeCultura;
    }

    public void setID(int id) {
        id_cultura = id;
    }

    public int getId() {
        return id_cultura;
    }

    public void AtualizaLabelCulturaAtiva() {
        LabelCulturaAgendamento.setText(NomeCultura);
    }

    public void setUsuario(String user) {
        UsuarioQueAgendou = user;
    }

    public String getUsuarioQueAgendou() {
        return UsuarioQueAgendou;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgendar;
    private javax.swing.JButton BtnCancelarAgendamento;
    private com.toedter.calendar.JCalendar CalendarioFinal;
    private com.toedter.calendar.JCalendar CalendarioInicial;
    private javax.swing.JLabel LabelCulturaAgendamento;
    private javax.swing.JTextField TxtAnoFinal;
    private javax.swing.JTextField TxtAnoInicial;
    private javax.swing.JTextField TxtDiaFinal;
    private javax.swing.JTextField TxtDiaInicial;
    private javax.swing.JTextField TxtMesFinal;
    private javax.swing.JTextField TxtMesInicial;
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
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
