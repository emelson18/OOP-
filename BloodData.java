/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ComputerLab4PC1
 */
class BloodData {
    
    static String bloodType ; 
    static String rhFactor;
    
    public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
    
    public BloodData(String bt, String rh){
        bloodType = bt;
        rhFactor = rh;
    }
   
    public void display(){
        System.out.println(bloodType + rhFactor + " is added to the bloodbank.");
    }
}
