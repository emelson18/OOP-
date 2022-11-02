/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ComputerLab4PC1
 */
public class BloodData {
    
    private String bloodType;
    private String rhFactor;
    
    public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
    void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
    void setRhFactor(String rhFactor){
        this.rhFactor = rhFactor;
    }
    public String getBloodType(){
        return bloodType;
    }
    public String getRhFactor(){
        return rhFactor;
    }
        
    public void display(){
        System.out.println(bloodType + rhFactor + " is added to the bloodbank.");
    }
}
