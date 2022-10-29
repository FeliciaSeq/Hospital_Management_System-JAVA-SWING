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
public class DoctorsPOV extends javax.swing.JFrame {

    /**
     * Creates new form DoctorsPOV
     */
    public DoctorsPOV() {
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

        DoctorsPovPnl = new javax.swing.JPanel();
        PatientDeetsLbl = new javax.swing.JLabel();
        DocPovScroll = new javax.swing.JScrollPane();
        DocPovTbl = new javax.swing.JTable();
        DocPovSearchLbl = new javax.swing.JLabel();
        DocPovSearchTxt = new javax.swing.JTextField();
        DocTempLbl = new javax.swing.JLabel();
        DocTempTxt = new javax.swing.JTextField();
        DocPressureLbl = new javax.swing.JLabel();
        DocPressureTxt = new javax.swing.JTextField();
        DocPulseTxt = new javax.swing.JTextField();
        DocPulseLbl = new javax.swing.JLabel();
        DocHeightTxt = new javax.swing.JTextField();
        DocHeightLbl = new javax.swing.JLabel();
        DocWeightTxt = new javax.swing.JTextField();
        DocWeightLbl = new javax.swing.JLabel();
        DocAddBtn = new javax.swing.JButton();
        DocUpdateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PatientDeetsLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        PatientDeetsLbl.setText("Your Patient Details");

        DocPovTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Temperature", "Pressure", "Pulse", "Height", "Weight", "Time of Appointment"
            }
        ));
        DocPovScroll.setViewportView(DocPovTbl);

        DocPovSearchLbl.setText("Search Patient:");

        DocPovSearchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocPovSearchTxtActionPerformed(evt);
            }
        });

        DocTempLbl.setText("Enter Temp:");

        DocTempTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocTempTxtActionPerformed(evt);
            }
        });

        DocPressureLbl.setText("Enter Pressure:");

        DocPressureTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocPressureTxtActionPerformed(evt);
            }
        });

        DocPulseTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocPulseTxtActionPerformed(evt);
            }
        });

        DocPulseLbl.setText("Enter Pulse:");

        DocHeightTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocHeightTxtActionPerformed(evt);
            }
        });

        DocHeightLbl.setText("Enter Height:");

        DocWeightTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocWeightTxtActionPerformed(evt);
            }
        });

        DocWeightLbl.setText("Enter Weight:");

        DocAddBtn.setText("Add");
        DocAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocAddBtnActionPerformed(evt);
            }
        });

        DocUpdateBtn.setText("Update");

        javax.swing.GroupLayout DoctorsPovPnlLayout = new javax.swing.GroupLayout(DoctorsPovPnl);
        DoctorsPovPnl.setLayout(DoctorsPovPnlLayout);
        DoctorsPovPnlLayout.setHorizontalGroup(
            DoctorsPovPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DoctorsPovPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PatientDeetsLbl)
                .addGap(363, 363, 363))
            .addComponent(DocPovScroll, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(DoctorsPovPnlLayout.createSequentialGroup()
                .addGroup(DoctorsPovPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DoctorsPovPnlLayout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(DocPovSearchLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DocPovSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DoctorsPovPnlLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(DocTempLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DocTempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(DocPressureLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DocPressureTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(DocPulseLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DocPulseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DoctorsPovPnlLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(DocHeightLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DocHeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(DocWeightLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DocWeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DoctorsPovPnlLayout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(DocAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(DocUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        DoctorsPovPnlLayout.setVerticalGroup(
            DoctorsPovPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoctorsPovPnlLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(PatientDeetsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DocPovScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DoctorsPovPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocPovSearchLbl)
                    .addComponent(DocPovSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(DoctorsPovPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocTempLbl)
                    .addComponent(DocTempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocPressureLbl)
                    .addComponent(DocPressureTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocPulseLbl)
                    .addComponent(DocPulseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(DoctorsPovPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocHeightLbl)
                    .addComponent(DocHeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocWeightLbl)
                    .addComponent(DocWeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(DoctorsPovPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DoctorsPovPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DoctorsPovPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DocPovSearchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocPovSearchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocPovSearchTxtActionPerformed

    private void DocTempTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocTempTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocTempTxtActionPerformed

    private void DocPressureTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocPressureTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocPressureTxtActionPerformed

    private void DocPulseTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocPulseTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocPulseTxtActionPerformed

    private void DocHeightTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocHeightTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocHeightTxtActionPerformed

    private void DocWeightTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocWeightTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocWeightTxtActionPerformed

    private void DocAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocAddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocAddBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorsPOV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorsPOV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorsPOV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorsPOV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorsPOV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DocAddBtn;
    private javax.swing.JLabel DocHeightLbl;
    private javax.swing.JTextField DocHeightTxt;
    private javax.swing.JScrollPane DocPovScroll;
    private javax.swing.JLabel DocPovSearchLbl;
    private javax.swing.JTextField DocPovSearchTxt;
    private javax.swing.JTable DocPovTbl;
    private javax.swing.JLabel DocPressureLbl;
    private javax.swing.JTextField DocPressureTxt;
    private javax.swing.JLabel DocPulseLbl;
    private javax.swing.JTextField DocPulseTxt;
    private javax.swing.JLabel DocTempLbl;
    private javax.swing.JTextField DocTempTxt;
    private javax.swing.JButton DocUpdateBtn;
    private javax.swing.JLabel DocWeightLbl;
    private javax.swing.JTextField DocWeightTxt;
    private javax.swing.JPanel DoctorsPovPnl;
    private javax.swing.JLabel PatientDeetsLbl;
    // End of variables declaration//GEN-END:variables
}