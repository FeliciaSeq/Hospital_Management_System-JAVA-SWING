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
public class PersonHistory {
    private ArrayList<Person> History;
    
    public PersonHistory() {
        this.History = new ArrayList<Person>();
    
}

    public ArrayList<Person> getHistory() {
        return History;
    }

    public void setHistory(ArrayList<Person> History) {
        this.History = History;
    }
    
    public Person addNewPerson(){
        
        Person newPerson = new Person();
        History.add(newPerson);
        return newPerson;
        
        
    }
    public void deletePerson(Person pe){
    History.remove(pe);
    }
    
  }
