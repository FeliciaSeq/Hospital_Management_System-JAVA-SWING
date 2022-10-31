/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author felsparkle
 */
public class VitalSigns {
    private String Weight;
    private String Height;
    private String Temperature;
    private String Pressure;
    private String Pulse;

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String Temperature) {
        this.Temperature = Temperature;
    }

    public String getPressure() {
        return Pressure;
    }

    public void setPressure(String Pressure) {
        this.Pressure = Pressure;
    }

    public String getPulse() {
        return Pulse;
    }

    public void setPulse(String Pulse) {
        this.Pulse = Pulse;
    }

    public VitalSigns(String Weight, String Height, String Temperature, String Pressure, String Pulse) {
        this.Weight = Weight;
        this.Height = Height;
        this.Temperature = Temperature;
        this.Pressure = Pressure;
        this.Pulse = Pulse;
    }
    
    @Override
    public String toString(){
        return Weight;
    }
    
}
