/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collegelist;
import java.util.Scanner;
/**
 *
 * @author ComputerLab4PC1
 */
public class CollegeList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Press E for Employee, F for Faculty or S for Student: ");
        String choice = SC.next();
        if (choice.equalsIgnoreCase("e")){
            Employee e = new Employee();
            
            System.out.println("Type employee's name, contact number, salary and department.");
            System.out.println("Press enter after every input.");
            e.setName(SC.next());
            e.setContactNum(SC.next());
            e.setSalary(SC.nextDouble());
            e.setDepartment(SC.next());
            System.out.println("---------------------------------------");
            System.out.println("Name: " + e.getName());
            System.out.println("Contact Number: " + e.getContactNum());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("Department: " + e.getDepartment());
        }
        else if(choice.equalsIgnoreCase("f")){
            Faculty f = new Faculty();
            boolean status;
            String display;
            System.out.println("Press Y if the faculty member is regular/tenured or N if not");
            String choice2 = SC.next();
            if(choice2.equalsIgnoreCase("y")){
                f.isRegular(true);
                display = "Regular";
                System.out.println("Type faculty's name, contact number, salary and department.");
                System.out.println("Press enter after every input.");
                f.setName(SC.next());
                f.setContactNum(SC.next());
                f.setSalary(SC.nextDouble());
                f.setDepartment(SC.next());
                System.out.println("---------------------------------------");
                System.out.println("Name: " + f.getName());
                System.out.println("Contact Number: " + f.getContactNum());
                System.out.println("Salary: " + f.getSalary());
                System.out.println("Department: " + f.getDepartment());
                System.out.println("Status: " + display );
            }
            else if(choice2.equalsIgnoreCase("N")){
                f.isRegular(false);
                display = "Part-time";
                System.out.println("Type employee's name, contact number, salary and department.");
                System.out.println("Press enter after every input.");
                f.setName(SC.next());
                f.setContactNum(SC.next());
                f.setSalary(SC.nextDouble());
                f.setDepartment(SC.next());
                System.out.println("Name: " + f.getName());
                System.out.println("Contact Number: " + f.getContactNum());
                System.out.println("Salary: " + f.getSalary());
                System.out.println("Department: " + f.getDepartment());
                System.out.println("Status: " + display);
            }
            else{
                System.out.println("Choose between Y and N only.");
            }
        }
        else if(choice.equalsIgnoreCase("S")){
            Student s = new Student();
            
            System.out.println("Type student's name, contact number, program and year level.");
            System.out.println("Press enter after every input.");
            s.setName(SC.next());
            s.setContactNum(SC.next());
            s.setProgram(SC.next());
            s.setYearLevel(SC.nextInt());
            int yearLevel = s.getYearLevel();
            if( yearLevel < 5 && yearLevel > 0){
                System.out.println("---------------------------------------");
                System.out.println("Name: " + s.getName());
                System.out.println("Contact Number: " + s.getContactNum());
                System.out.println("Program: " + s.getProgram());
                System.out.println("Year Level: " + s.getYearLevel()); 
            }
            else{
                System.out.println("Choose only betwwen 1 to 4.");
            }
            
        }
        else{
            System.out.println("Choose only between E, F and S");
        }
    }
    
}
