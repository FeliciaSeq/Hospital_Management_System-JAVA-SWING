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
    private static ArrayList<Hospital> HospHistory = new ArrayList<>();
    
   // public HospitalHistory() {
    //    this.HospHistory = new ArrayList<Hospital>();
    


    public static ArrayList<Hospital> getHospHistory() {
        return HospHistory;
    }

    public static void setHospHistory(ArrayList<Hospital> HospHistory) {
        HospitalHistory.HospHistory = HospHistory;
    }
    public static void  addNewHospital(Hospital newHospital){
        
//        Hospital newHospital = new Hospital();
        HospitalHistory.HospHistory.add(newHospital);
//        return newHospital;
        
        
    }
    public void deleteHospital(Hospital h){
    HospHistory.remove(h);
    }

    
}
