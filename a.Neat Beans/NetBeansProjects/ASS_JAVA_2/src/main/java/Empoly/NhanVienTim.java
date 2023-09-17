/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empoly;

/**
 *
 * @author QUANGVU
 */
public class NhanVienTim extends Empoly {

    private int vitri;

    public NhanVienTim(int i, String ma, String hvt, int tuoi, String email, double luong) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    

    public int getVitri() {
        return vitri;
    }

    public void setVitri(int vitri) {
        this.vitri = vitri;
    }

    public NhanVienTim(int vitri, String id, String name, String email, int age, double luong) {
        super(id, name, email, age, luong);
        this.vitri = vitri;
    }

    public NhanVienTim() {
        
    }

}
