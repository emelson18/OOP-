/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ComputerLab4PC1
 */
import java.util.Scanner;
public class RunBloodData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String input1, input2;
        String data;
        BloodData bd = new BloodData();
        System.out.print("Enter the blood type of the patient: ");
        input1 = SC.nextLine();
        bd.setBloodType(input1);
        System.out.print("Enter the rheus factor (+ or -): ");
        input2 = SC.nextLine();
        bd.setRhFactor(input2);
        data = bd.getBloodType() + bd.getRhFactor();
        if(data.isEmpty()){
            bd = new BloodData();
            System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the bloodbank.");
            
        }
        else if(data.equals("A+")||data.equals("A-")||data.equals("B+")||data.equals("B-")||data.equals("AB+")||
                data.equals("AB-")||data.equals("O+")||data.equals("O-")){
            System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the bloodbank.");
           
        }
        else{
            System.out.println("Invalid Input");
        }
        SC.close();
    }
    
}
