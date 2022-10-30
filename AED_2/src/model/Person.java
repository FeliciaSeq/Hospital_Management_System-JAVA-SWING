/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author felsparkle
 */
public class Person {
    private String Name;
    private long   ID;
    private int Age;
    private String Gender;
    private String IsPatient;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getIsPatient() {
        return IsPatient;
    }

    public void setIsPatient(String IsPatient) {
        this.IsPatient = IsPatient;
    }
    
    @Override
    public String toString(){
        return Name;
    }
    
}
