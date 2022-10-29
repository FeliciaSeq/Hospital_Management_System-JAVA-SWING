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
public class SystemAdmPOVcommunity extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdmPOVcommunity
     */
    public SystemAdmPOVcommunity() {
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

        SystemAdmPOVSplitComm = new javax.swing.JSplitPane();
        SaAddCommDeetsPnl = new javax.swing.JPanel();
        SaCityCommLbl1 = new javax.swing.JLabel();
        SaPinCommLbl1 = new javax.swing.JLabel();
        SaAreaCommLbl1 = new javax.swing.JLabel();
        SaStateCommLbl1 = new javax.swing.JLabel();
        SaAddCommBtn = new javax.swing.JButton();
        SaCityCommTxt1 = new javax.swing.JTextField();
        SaPinCommTxt1 = new javax.swing.JTextField();
        SaAreaCommTxt1 = new javax.swing.JTextField();
        SaStateCommTxt1 = new javax.swing.JTextField();
        SaAddCommDeetsLbl = new javax.swing.JLabel();
        SaEditCommDeetsPnl = new javax.swing.JPanel();
        SaEditCommDeetsLbl = new javax.swing.JLabel();
        SaCityCommLbl2 = new javax.swing.JLabel();
        SaCityCommTxt2 = new javax.swing.JTextField();
        SaPinCommLbl2 = new javax.swing.JLabel();
        SaPinCommTxt2 = new javax.swing.JTextField();
        SaAreaCommLbl2 = new javax.swing.JLabel();
        SaAreaCommTxt2 = new javax.swing.JTextField();
        SaStateCommLbl2 = new javax.swing.JLabel();
        SaStateCommTxt2 = new javax.swing.JTextField();
        SaUpdateCommBtn = new javax.swing.JButton();
        SaDeleteCommBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommDeetsTbl = new javax.swing.JTable();
        SaSearchCommDeetsLbl = new javax.swing.JLabel();
        SaSearchCommDeetsTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SaAddCommDeetsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SaCityCommLbl1.setText("City:");

        SaPinCommLbl1.setText("Pin Code:");

        SaAreaCommLbl1.setText("Area:");

        SaStateCommLbl1.setText("State:");

        SaAddCommBtn.setText("Add");

        SaAddCommDeetsLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        SaAddCommDeetsLbl.setText("Add Community Details");

        javax.swing.GroupLayout SaAddCommDeetsPnlLayout = new javax.swing.GroupLayout(SaAddCommDeetsPnl);
        SaAddCommDeetsPnl.setLayout(SaAddCommDeetsPnlLayout);
        SaAddCommDeetsPnlLayout.setHorizontalGroup(
            SaAddCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaAddCommDeetsPnlLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(SaAddCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SaAddCommDeetsPnlLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(SaAddCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SaStateCommLbl1)
                            .addComponent(SaAreaCommLbl1))
                        .addGap(18, 18, 18)
                        .addGroup(SaAddCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SaAreaCommTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaStateCommTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SaAddCommDeetsPnlLayout.createSequentialGroup()
                        .addGroup(SaAddCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SaCityCommLbl1)
                            .addComponent(SaPinCommLbl1))
                        .addGap(18, 18, 18)
                        .addGroup(SaAddCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SaCityCommTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaPinCommTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SaAddCommDeetsLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SaAddCommDeetsPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaAddCommBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        SaAddCommDeetsPnlLayout.setVerticalGroup(
            SaAddCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaAddCommDeetsPnlLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(SaAddCommDeetsLbl)
                .addGap(64, 64, 64)
                .addGroup(SaAddCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SaCityCommLbl1)
                    .addComponent(SaCityCommTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(SaAddCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaPinCommLbl1)
                    .addComponent(SaPinCommTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(SaAddCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaAreaCommLbl1)
                    .addComponent(SaAreaCommTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(SaAddCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaStateCommLbl1)
                    .addComponent(SaStateCommTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(SaAddCommBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        SystemAdmPOVSplitComm.setLeftComponent(SaAddCommDeetsPnl);

        SaEditCommDeetsLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        SaEditCommDeetsLbl.setText("Edit Community Details");

        SaCityCommLbl2.setText("City:");

        SaPinCommLbl2.setText("Pin Code:");

        SaAreaCommLbl2.setText("Area:");

        SaStateCommLbl2.setText("State:");

        SaUpdateCommBtn.setText("Update");
        SaUpdateCommBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaUpdateCommBtnActionPerformed(evt);
            }
        });

        SaDeleteCommBtn.setText("Delete");
        SaDeleteCommBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaDeleteCommBtnActionPerformed(evt);
            }
        });

        CommDeetsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "City", "Pin Code", "Area", "State"
            }
        ));
        jScrollPane1.setViewportView(CommDeetsTbl);

        SaSearchCommDeetsLbl.setText("Search Community Details:");

        SaSearchCommDeetsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaSearchCommDeetsTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SaEditCommDeetsPnlLayout = new javax.swing.GroupLayout(SaEditCommDeetsPnl);
        SaEditCommDeetsPnl.setLayout(SaEditCommDeetsPnlLayout);
        SaEditCommDeetsPnlLayout.setHorizontalGroup(
            SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaEditCommDeetsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SaCityCommLbl2)
                    .addComponent(SaPinCommLbl2))
                .addGap(18, 18, 18)
                .addGroup(SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SaCityCommTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaPinCommTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SaStateCommLbl2)
                    .addComponent(SaAreaCommLbl2))
                .addGap(18, 18, 18)
                .addGroup(SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SaStateCommTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaAreaCommTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SaUpdateCommBtn)
                    .addComponent(SaDeleteCommBtn))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(SaEditCommDeetsPnlLayout.createSequentialGroup()
                .addGroup(SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SaEditCommDeetsPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SaSearchCommDeetsLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaSearchCommDeetsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SaEditCommDeetsPnlLayout.createSequentialGroup()
                            .addGap(236, 236, 236)
                            .addComponent(SaEditCommDeetsLbl))
                        .addGroup(SaEditCommDeetsPnlLayout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SaEditCommDeetsPnlLayout.setVerticalGroup(
            SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaEditCommDeetsPnlLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(SaEditCommDeetsLbl)
                .addGroup(SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SaEditCommDeetsPnlLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SaCityCommLbl2)
                            .addComponent(SaCityCommTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SaEditCommDeetsPnlLayout.createSequentialGroup()
                                .addGroup(SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SaAreaCommLbl2)
                                    .addComponent(SaAreaCommTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SaStateCommLbl2)
                                    .addComponent(SaStateCommTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SaPinCommLbl2)
                                    .addComponent(SaPinCommTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(SaEditCommDeetsPnlLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(SaUpdateCommBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(SaDeleteCommBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(SaEditCommDeetsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaSearchCommDeetsLbl)
                    .addComponent(SaSearchCommDeetsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        SystemAdmPOVSplitComm.setRightComponent(SaEditCommDeetsPnl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SystemAdmPOVSplitComm, javax.swing.GroupLayout.PREFERRED_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SystemAdmPOVSplitComm)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaUpdateCommBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaUpdateCommBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaUpdateCommBtnActionPerformed

    private void SaSearchCommDeetsTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaSearchCommDeetsTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaSearchCommDeetsTxtActionPerformed

    private void SaDeleteCommBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaDeleteCommBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaDeleteCommBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdmPOVcommunity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdmPOVcommunity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdmPOVcommunity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdmPOVcommunity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdmPOVcommunity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CommDeetsTbl;
    private javax.swing.JButton SaAddCommBtn;
    private javax.swing.JLabel SaAddCommDeetsLbl;
    private javax.swing.JPanel SaAddCommDeetsPnl;
    private javax.swing.JLabel SaAreaCommLbl1;
    private javax.swing.JLabel SaAreaCommLbl2;
    private javax.swing.JTextField SaAreaCommTxt1;
    private javax.swing.JTextField SaAreaCommTxt2;
    private javax.swing.JLabel SaCityCommLbl1;
    private javax.swing.JLabel SaCityCommLbl2;
    private javax.swing.JTextField SaCityCommTxt1;
    private javax.swing.JTextField SaCityCommTxt2;
    private javax.swing.JButton SaDeleteCommBtn;
    private javax.swing.JLabel SaEditCommDeetsLbl;
    private javax.swing.JPanel SaEditCommDeetsPnl;
    private javax.swing.JLabel SaPinCommLbl1;
    private javax.swing.JLabel SaPinCommLbl2;
    private javax.swing.JTextField SaPinCommTxt1;
    private javax.swing.JTextField SaPinCommTxt2;
    private javax.swing.JLabel SaSearchCommDeetsLbl;
    private javax.swing.JTextField SaSearchCommDeetsTxt;
    private javax.swing.JLabel SaStateCommLbl1;
    private javax.swing.JLabel SaStateCommLbl2;
    private javax.swing.JTextField SaStateCommTxt1;
    private javax.swing.JTextField SaStateCommTxt2;
    private javax.swing.JButton SaUpdateCommBtn;
    private javax.swing.JSplitPane SystemAdmPOVSplitComm;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}