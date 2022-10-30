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
public class DoctorNewHistory {
    private ArrayList<DoctorNew> DocNewHistory;
    
    public DoctorNewHistory() {
        this.DocNewHistory = new ArrayList<DoctorNew>();
    
}

    public ArrayList<DoctorNew> getDocNewHistory() {
        return DocNewHistory;
    }

    public void setDocNewHistory(ArrayList<DoctorNew> DocNewHistory) {
        this.DocNewHistory = DocNewHistory;
    }
    public DoctorNew addNewDoctor(){
        
        DoctorNew newDoctor = new DoctorNew();
        DocNewHistory.add(newDoctor);
        return newDoctor;
        
        
    }
    public void deleteDoctorNew(DoctorNew d){
    DocNewHistory.remove(d);
    }
}
