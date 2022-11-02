/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ComputerLab4PC1
 */
public class RunBloodData {
    static String bloodtype;
    static String rhfactor;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        
        
        System.out.print("Input blood type of the patient: ");
        bloodtype = SC.nextLine();
        System.out.print("Input rhtype(+ or -): ");
        rhfactor = SC.nextLine();
        
                
        if(bloodtype.equals("") && rhfactor.equals("")){
          BloodData bd = new BloodData();
          bd.display();
        }
        else if( bloodtype.equals("A") || bloodtype.equals("B") || bloodtype.equals("O") || bloodtype.equals("AB") && rhfactor.equals("+") || rhfactor.equals("-")){
          BloodData bd = new BloodData(bloodtype, rhfactor);  
          bd.display();  
        }
        else{
            System.out.print("System error.");
        }
        
        
    }
    

}