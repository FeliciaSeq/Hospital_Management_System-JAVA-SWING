/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author felsparkle
 */
public class Community {
    private String City;
    private long   PinCode;  
    private String Area;
    private String State;

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public long getPinCode() {
        return PinCode;
    }

    public void setPinCode(long PinCode) {
        this.PinCode = PinCode;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
    
    @Override
    public String toString(){
        return City;
    }
    
}
