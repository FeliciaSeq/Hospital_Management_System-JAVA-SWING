/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author felsparkle
 */
public class Hospital {
    
    private String HospitalName;
    private String PinCode;  
    private String City;

    public String getPinCode() {
        return PinCode;
    }

    public void setPinCode(String PinCode) {
        this.PinCode = PinCode;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    
    @Override
    public String toString(){
        return HospitalName;
    }
    
    
}
