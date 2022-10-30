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
public class DoctorHistory {
    private ArrayList<Doctor> DocHistory;
    
    public DoctorHistory() {
        this.DocHistory = new ArrayList<Doctor>();
    
}

    public ArrayList<Doctor> getDocHistory() {
        return DocHistory;
    }

    public void setDocHistory(ArrayList<Doctor> DocHistory) {
        this.DocHistory = DocHistory;
    }
    public Doctor addNewDoctor(){
        
        Doctor newDoctor = new Doctor();
        DocHistory.add(newDoctor);
        return newDoctor;
        
        
    }
}
