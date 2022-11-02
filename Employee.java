/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegelist;

/**
 *
 * @author ComputerLab4PC1
 */
class Employee extends Person{
    private double salary;
    private String department;
    
    void setSalary(double salary){
        this.salary = salary;
    }
    
    double getSalary(){
        return salary;
    }
    
    void setDepartment(String department){
        this.department = department;
    }
    
    String getDepartment(){
        return department;
    }
}
