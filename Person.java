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
class Person {
    private String name;
    private String contactNum;
    
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return name;
    }
    
    void setContactNum(String contactNum){
        this.contactNum = contactNum;
    }
    
    String getContactNum(){
        return contactNum;
    }
}
