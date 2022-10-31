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
public class VitalSignsHistory {
    private static ArrayList<VitalSigns> VitalsHistory = new ArrayList<>();
    
//    public VitalSignsHistory() {
////        this.VitalsHistory = new ArrayList<VitalSigns>();   
//    }

    public ArrayList<VitalSigns> getVitalsHistory() {
        return VitalsHistory;
    }

    public static void setVitalsHistory(ArrayList<VitalSigns> VitalsHistory) {
        VitalSignsHistory.VitalsHistory = VitalsHistory;
    }
    public static void addNewVitalSign(VitalSigns newVitalSigns){
        //VitalSigns newVitalSigns = new VitalSigns();
        VitalsHistory.add(newVitalSigns);
        //return newVitalSigns;
    }
}
