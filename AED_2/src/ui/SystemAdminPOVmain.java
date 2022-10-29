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
public class SystemAdminPOVmain extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminPOVmain
     */
    public SystemAdminPOVmain() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SaFirstPnl = new javax.swing.JPanel();
        WelcomeSAlbl = new javax.swing.JLabel();
        SaNavlbl = new javax.swing.JLabel();
        SaPersonlbl = new javax.swing.JButton();
        SaHospitallbl = new javax.swing.JButton();
        SaCommunitylbl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomeSAlbl.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        WelcomeSAlbl.setText("Welcome System Admin");

        SaNavlbl.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        SaNavlbl.setText("Where would you like to go at?");

        SaPersonlbl.setText("Person");

        SaHospitallbl.setText("Hospital");
        SaHospitallbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaHospitallblActionPerformed(evt);
            }
        });

        SaCommunitylbl.setText("Community");

        javax.swing.GroupLayout SaFirstPnlLayout = new javax.swing.GroupLayout(SaFirstPnl);
        SaFirstPnl.setLayout(SaFirstPnlLayout);
        SaFirstPnlLayout.setHorizontalGroup(
            SaFirstPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SaFirstPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaNavlbl)
                .addGap(280, 280, 280))
            .addGroup(SaFirstPnlLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(WelcomeSAlbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SaFirstPnlLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(SaPersonlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(SaHospitallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(SaCommunitylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        SaFirstPnlLayout.setVerticalGroup(
            SaFirstPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaFirstPnlLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(WelcomeSAlbl)
                .addGap(75, 75, 75)
                .addComponent(SaNavlbl)
                .addGap(91, 91, 91)
                .addGroup(SaFirstPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaHospitallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaPersonlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaCommunitylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SaFirstPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SaFirstPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaHospitallblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaHospitallblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaHospitallblActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdminPOVmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminPOVmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminPOVmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminPOVmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdminPOVmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaCommunitylbl;
    private javax.swing.JPanel SaFirstPnl;
    private javax.swing.JButton SaHospitallbl;
    private javax.swing.JLabel SaNavlbl;
    private javax.swing.JButton SaPersonlbl;
    private javax.swing.JLabel WelcomeSAlbl;
    // End of variables declaration//GEN-END:variables
}