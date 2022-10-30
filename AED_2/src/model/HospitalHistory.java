/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author felsparkle
 */
public class HospitalHistory {
    private ArrayList<Hospital> HospHistory;
    
    public HospitalHistory() {
        this.HospHistory = new ArrayList<Hospital>();
    
}

    public ArrayList<Hospital> getHospHistory() {
        return HospHistory;
    }

    public void setHospHistory(ArrayList<Hospital> HospHistory) {
        this.HospHistory = HospHistory;
    }
    public Hospital addNewHospital(){
        
        Hospital newHospital = new Hospital();
        HospHistory.add(newHospital);
        return newHospital;
        
        
    }
    public void deleteHospital(Hospital h){
    HospHistory.remove(h);
    }

    
}
