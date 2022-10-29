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
public class CommunityAdmPOV extends javax.swing.JFrame {

    /**
     * Creates new form CommunityAdmPOV
     */
    public CommunityAdmPOV() {
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

        CommAdmPovPnl = new javax.swing.JPanel();
        CommAdmLbl = new javax.swing.JLabel();
        CommAdmScroll = new javax.swing.JScrollPane();
        CommAdmTbl = new javax.swing.JTable();
        CommAdmSearchLbl = new javax.swing.JLabel();
        CommAdmSearchTxt = new javax.swing.JTextField();
        CommAdmHospNameLbl = new javax.swing.JLabel();
        CommAdmHospNameTxt = new javax.swing.JTextField();
        CommAdmCityLbl = new javax.swing.JLabel();
        CommAdmCityTxt = new javax.swing.JTextField();
        CommAdmPincodeLbl = new javax.swing.JLabel();
        CommAdmPincodeTxt = new javax.swing.JTextField();
        CommAdmAddBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CommAdmLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        CommAdmLbl.setText("Community Admin");

        CommAdmTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hospital", "City", "Pin Code"
            }
        ));
        CommAdmScroll.setViewportView(CommAdmTbl);

        CommAdmSearchLbl.setText("Search:");

        CommAdmSearchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommAdmSearchTxtActionPerformed(evt);
            }
        });

        CommAdmHospNameLbl.setText("Hospital Name:");

        CommAdmHospNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommAdmHospNameTxtActionPerformed(evt);
            }
        });

        CommAdmCityLbl.setText("City:");

        CommAdmCityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommAdmCityTxtActionPerformed(evt);
            }
        });

        CommAdmPincodeLbl.setText("Pincode:");

        CommAdmPincodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommAdmPincodeTxtActionPerformed(evt);
            }
        });

        CommAdmAddBtn.setText("Add");
        CommAdmAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommAdmAddBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CommAdmPovPnlLayout = new javax.swing.GroupLayout(CommAdmPovPnl);
        CommAdmPovPnl.setLayout(CommAdmPovPnlLayout);
        CommAdmPovPnlLayout.setHorizontalGroup(
            CommAdmPovPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CommAdmPovPnlLayout.createSequentialGroup()
                .addGroup(CommAdmPovPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CommAdmPovPnlLayout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(CommAdmLbl))
                    .addGroup(CommAdmPovPnlLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(CommAdmScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CommAdmPovPnlLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(CommAdmHospNameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CommAdmHospNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(CommAdmPovPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CommAdmPovPnlLayout.createSequentialGroup()
                                .addComponent(CommAdmCityLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CommAdmCityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(CommAdmPincodeLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CommAdmPincodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CommAdmPovPnlLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(CommAdmAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(CommAdmPovPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CommAdmSearchLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CommAdmSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );
        CommAdmPovPnlLayout.setVerticalGroup(
            CommAdmPovPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CommAdmPovPnlLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(CommAdmLbl)
                .addGap(29, 29, 29)
                .addComponent(CommAdmScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CommAdmPovPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CommAdmSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommAdmSearchLbl))
                .addGap(68, 68, 68)
                .addGroup(CommAdmPovPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CommAdmHospNameLbl)
                    .addComponent(CommAdmHospNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommAdmCityLbl)
                    .addComponent(CommAdmCityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommAdmPincodeLbl)
                    .addComponent(CommAdmPincodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(CommAdmAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CommAdmPovPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CommAdmPovPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CommAdmSearchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommAdmSearchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommAdmSearchTxtActionPerformed

    private void CommAdmHospNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommAdmHospNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommAdmHospNameTxtActionPerformed

    private void CommAdmCityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommAdmCityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommAdmCityTxtActionPerformed

    private void CommAdmPincodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommAdmPincodeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommAdmPincodeTxtActionPerformed

    private void CommAdmAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommAdmAddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommAdmAddBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityAdmPOV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityAdmPOV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityAdmPOV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityAdmPOV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityAdmPOV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CommAdmAddBtn;
    private javax.swing.JLabel CommAdmCityLbl;
    private javax.swing.JTextField CommAdmCityTxt;
    private javax.swing.JLabel CommAdmHospNameLbl;
    private javax.swing.JTextField CommAdmHospNameTxt;
    private javax.swing.JLabel CommAdmLbl;
    private javax.swing.JLabel CommAdmPincodeLbl;
    private javax.swing.JTextField CommAdmPincodeTxt;
    private javax.swing.JPanel CommAdmPovPnl;
    private javax.swing.JScrollPane CommAdmScroll;
    private javax.swing.JLabel CommAdmSearchLbl;
    private javax.swing.JTextField CommAdmSearchTxt;
    private javax.swing.JTable CommAdmTbl;
    // End of variables declaration//GEN-END:variables
}
