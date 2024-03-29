/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Community;
import model.CommunityHistory;
import model.HospitalHistory;
import model.Hospital;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.DoctorHistory;
import model.DoctorNew;
import model.DoctorNewHistory;
import model.Person;
import model.PersonHistory;

/**
 *
 * @author felsparkle
 */
public class HospitalAdmPOV extends javax.swing.JFrame {

    /**
     * Creates new form HospitalAdmPOV
     */
    private String[] PinCodeArray;
    HospitalHistory HospHistory;
    CommunityHistory CommHistory;
    private String[] CityArray;
    private String[] HospArray;
    private String [] CityArray1;
    DoctorHistory DocHistory;
    DoctorNewHistory DocNewHistory;
    PersonHistory History;
    private String[] DocArray;
    
    
    
    public HospitalAdmPOV(CommunityHistory CommHistory,HospitalHistory HospHistory,DoctorHistory DocHistory,DoctorNewHistory DocNewHistory,PersonHistory History) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        this.HospHistory = HospHistory;
        this.DocHistory = DocHistory;
        this.CommHistory = CommHistory;
        this.History = History;
        this.DocNewHistory = DocNewHistory;
        
        
        
        
        /*int PinCodeArraySize = CommHistory.getCommHistory().size();
        this.PinCodeArray = new String[PinCodeArraySize];
        int itr = 0;
        
        for(Community community:CommHistory.getCommHistory()){
            this.PinCodeArray [itr++] = community.getPinCode();
        }
        
        //HospitalPinCombo.setModel(new javax.swing.DefaultComboBoxModel<>(this.PinCodeArray));
        /////////////
        
        
        int CityArraySize = CommHistory.getCommHistory().size();
        this.CityArray = new String[CityArraySize];
        int itr1 = 0;
       
        for (Community community:CommHistory.getCommHistory() ){
            this.CityArray [itr1++] = community.getCity();
        }*/
       
        //HospitalCityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(this.CityArray));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HospAdmPOVPnl = new javax.swing.JPanel();
        HospAdmLbl = new javax.swing.JLabel();
        HospAdmPOVScroll = new javax.swing.JScrollPane();
        HospAdmPOVTbl = new javax.swing.JTable();
        HospAdmSearchLbl = new javax.swing.JLabel();
        HospAdmSearchTxt = new javax.swing.JTextField();
        HospNameLbl = new javax.swing.JLabel();
        HospNameTxt = new javax.swing.JTextField();
        DoctorNameLbl = new javax.swing.JLabel();
        PinCodeTxt = new javax.swing.JTextField();
        CityLbl = new javax.swing.JLabel();
        CityTxt = new javax.swing.JTextField();
        HospAdmAddBtn = new javax.swing.JButton();
        HospAdmUpdateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HospAdmLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        HospAdmLbl.setText("Hospital Admin");

        HospAdmPOVTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hospital Name", "Pin Code", "City"
            }
        ));
        HospAdmPOVScroll.setViewportView(HospAdmPOVTbl);

        HospAdmSearchLbl.setText("Search:");

        HospNameLbl.setText("Hospital Name:");

        HospNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospNameTxtActionPerformed(evt);
            }
        });

        DoctorNameLbl.setText("PinCode:");

        PinCodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinCodeTxtActionPerformed(evt);
            }
        });

        CityLbl.setText("City:");

        CityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityTxtActionPerformed(evt);
            }
        });

        HospAdmAddBtn.setText("Add");
        HospAdmAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospAdmAddBtnActionPerformed(evt);
            }
        });

        HospAdmUpdateBtn.setText("Update");
        HospAdmUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospAdmUpdateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HospAdmPOVPnlLayout = new javax.swing.GroupLayout(HospAdmPOVPnl);
        HospAdmPOVPnl.setLayout(HospAdmPOVPnlLayout);
        HospAdmPOVPnlLayout.setHorizontalGroup(
            HospAdmPOVPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospAdmPOVPnlLayout.createSequentialGroup()
                .addGroup(HospAdmPOVPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HospAdmPOVPnlLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(HospAdmPOVScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HospAdmPOVPnlLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(HospAdmSearchLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HospAdmSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HospAdmPOVPnlLayout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addGroup(HospAdmPOVPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HospAdmPOVPnlLayout.createSequentialGroup()
                        .addComponent(HospAdmLbl)
                        .addGap(378, 378, 378))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HospAdmPOVPnlLayout.createSequentialGroup()
                        .addGroup(HospAdmPOVPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HospAdmAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HospAdmPOVPnlLayout.createSequentialGroup()
                                .addComponent(HospNameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HospNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(HospAdmPOVPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HospAdmPOVPnlLayout.createSequentialGroup()
                                .addComponent(DoctorNameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PinCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(CityLbl))
                            .addComponent(HospAdmUpdateBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        HospAdmPOVPnlLayout.setVerticalGroup(
            HospAdmPOVPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospAdmPOVPnlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(HospAdmLbl)
                .addGap(18, 18, 18)
                .addComponent(HospAdmPOVScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(HospAdmPOVPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HospAdmSearchLbl)
                    .addComponent(HospAdmSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(HospAdmPOVPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HospNameLbl)
                    .addComponent(HospNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoctorNameLbl)
                    .addComponent(PinCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityLbl)
                    .addComponent(CityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(HospAdmPOVPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HospAdmAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HospAdmUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HospAdmPOVPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HospAdmPOVPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HospNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HospNameTxtActionPerformed

    private void PinCodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinCodeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PinCodeTxtActionPerformed

    private void CityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityTxtActionPerformed

    private void HospAdmAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospAdmAddBtnActionPerformed
        // TODO add your handling code here:
        String HospitalName = HospNameTxt.getText();
        String PinCode = PinCodeTxt.getText();
        String City = CityTxt.getText();
        
        
        Hospital h = new Hospital(HospitalName, PinCode, City);
//        Hospital h = this.HospHistory.addNewHospital();
        HospitalHistory.addNewHospital(h);
        
            
            h.setHospitalName(HospitalName);
            h.setCity(City);
            h.setPinCode(PinCode);
            
            System.out.println(h.getPinCode());
            
            JOptionPane.showMessageDialog(this, "Details added.");
            
            populateTable();
            
            HospNameTxt.setText("");
            PinCodeTxt.setText("");
            CityTxt.setText("");
        
    }//GEN-LAST:event_HospAdmAddBtnActionPerformed

    private void HospAdmUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospAdmUpdateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HospAdmUpdateBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CityLbl;
    private javax.swing.JTextField CityTxt;
    private javax.swing.JLabel DoctorNameLbl;
    private javax.swing.JButton HospAdmAddBtn;
    private javax.swing.JLabel HospAdmLbl;
    private javax.swing.JPanel HospAdmPOVPnl;
    private javax.swing.JScrollPane HospAdmPOVScroll;
    private javax.swing.JTable HospAdmPOVTbl;
    private javax.swing.JLabel HospAdmSearchLbl;
    private javax.swing.JTextField HospAdmSearchTxt;
    private javax.swing.JButton HospAdmUpdateBtn;
    private javax.swing.JLabel HospNameLbl;
    private javax.swing.JTextField HospNameTxt;
    private javax.swing.JTextField PinCodeTxt;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel model = (DefaultTableModel) HospAdmPOVTbl.getModel();
        model.setRowCount(0);
        
        for(Hospital h : HospitalHistory.getHospHistory()){
            
            //System.out.println(h.getPinCode());
            
            Object [] row = new Object[3];
            row[0] = h;
            row[1] = h.getPinCode();
            row[2] = h.getCity();
            
            
            
            
            model.addRow(row);
    }
    }
}
