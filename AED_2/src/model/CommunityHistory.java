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
public class CommunityHistory {
    private ArrayList<Community> CommHistory;
    
    public CommunityHistory() {
        this.CommHistory = new ArrayList<Community>();
    
}

    public ArrayList<Community> getCommHistory() {
        return CommHistory;
    }

    public void setCommHistory(ArrayList<Community> CommHistory) {
        this.CommHistory = CommHistory;
    }
    public Community addNewCommunity(){
        
        Community newCommunity = new Community();
        CommHistory.add(newCommunity);
        return newCommunity;
        
        
    }
    public void deleteCommunity(Community cm){
    CommHistory.remove(cm);
    }

    
}


    
