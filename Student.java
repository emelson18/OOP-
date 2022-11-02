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
class Student extends Person {
    private int yearLevel;
    private String program;
    
    void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    
    int getYearLevel(){
        return yearLevel;
    }
    
    void setProgram(String program){
        this.program = program;
    }
    
    String getProgram(){
        return program;
    }
}
