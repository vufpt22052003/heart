/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu;

/**
 *
 * @author QUANGVU
 */
public class nháp {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void xuat() {
    
        nháp n1 = new nháp();
        n1.setColor("hoa hong");
        System.out.println(n1.getColor());
    }
}
