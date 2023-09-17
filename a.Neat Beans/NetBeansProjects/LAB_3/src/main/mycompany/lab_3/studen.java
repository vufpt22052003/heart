/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_3;

/**
 *
 * @author QUANGVU
 */
public class studen {

    static int getSelectedRow() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String name ;
    public double marks;
    public String major;
    public String getGrade(){
            
        if(this.marks < 3){
            return "kém";
    }
        if(this.marks <5){
            return "Yếu";    
    }
       if(this.marks < 7.5){
            return "Khá";      
       }
       if(this.marks< 9){
           return "Giỏi";
       }
       else {
           return "Xuất xắc";
       
       }
    }
           public boolean isBonus(){
         return this.marks >= 7.5;
    }
}
 
        
