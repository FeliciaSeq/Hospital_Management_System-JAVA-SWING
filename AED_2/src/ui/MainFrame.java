/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JFrame;

/**
 *
 * @author felsparkle
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //this.DocNewHistory = DocNewHistory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPnl = new javax.swing.JPanel();
        LoginLbl = new javax.swing.JLabel();
        CommAdmLoginBtn = new javax.swing.JButton();
        SystemAdmLoginBtn = new javax.swing.JButton();
        HospitalAdmLoginBtn = new javax.swing.JButton();
        PatientLoginBtn = new javax.swing.JButton();
        DoctorLoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        LoginLbl.setText("Login As");

        CommAdmLoginBtn.setText("Community Admin");
        CommAdmLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommAdmLoginBtnActionPerformed(evt);
            }
        });

        SystemAdmLoginBtn.setText("System Admin");
        SystemAdmLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAdmLoginBtnActionPerformed(evt);
            }
        });

        HospitalAdmLoginBtn.setText("Hospital Admin");
        HospitalAdmLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalAdmLoginBtnActionPerformed(evt);
            }
        });

        PatientLoginBtn.setText("Patient");
        PatientLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientLoginBtnActionPerformed(evt);
            }
        });

        DoctorLoginBtn.setText("Doctor");
        DoctorLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPnlLayout = new javax.swing.GroupLayout(MainPnl);
        MainPnl.setLayout(MainPnlLayout);
        MainPnlLayout.setHorizontalGroup(
            MainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPnlLayout.createSequentialGroup()
                .addGroup(MainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPnlLayout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(LoginLbl))
                    .addGroup(MainPnlLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(CommAdmLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(SystemAdmLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(HospitalAdmLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPnlLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(PatientLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(DoctorLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        MainPnlLayout.setVerticalGroup(
            MainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPnlLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(LoginLbl)
                .addGap(61, 61, 61)
                .addGroup(MainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CommAdmLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SystemAdmLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HospitalAdmLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(MainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoctorLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CommAdmLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommAdmLoginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommAdmLoginBtnActionPerformed

    private void SystemAdmLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAdmLoginBtnActionPerformed
        // TODO add your handling code here:
        SystemAdmLogin admin = new SystemAdmLogin ();
        admin.show();
    }//GEN-LAST:event_SystemAdmLoginBtnActionPerformed

    private void HospitalAdmLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalAdmLoginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HospitalAdmLoginBtnActionPerformed

    private void PatientLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientLoginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientLoginBtnActionPerformed

    private void DoctorLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorLoginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorLoginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CommAdmLoginBtn;
    private javax.swing.JButton DoctorLoginBtn;
    private javax.swing.JButton HospitalAdmLoginBtn;
    private javax.swing.JLabel LoginLbl;
    private javax.swing.JPanel MainPnl;
    private javax.swing.JButton PatientLoginBtn;
    private javax.swing.JButton SystemAdmLoginBtn;
    // End of variables declaration//GEN-END:variables
}
