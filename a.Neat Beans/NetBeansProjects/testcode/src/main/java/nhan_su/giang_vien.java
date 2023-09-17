/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhan_su;

import java.util.Scanner;

/**
 *
 * @author QUANGVU
 */
public class giang_vien {
//Class giảng viên gồm các thuộc tính: họ tên, lớp dạy, năm sinh, lương.

    private String hovaten;
    private String lopday;
    private String namsinh;
    private String luong;

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getLopday() {
        return lopday;
    }

    public void setLopday(String lopday) {
        this.lopday = lopday;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }
    // tạo đối tượng giảng viên b
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("xin mời nhập ten  giáo viên");
        this.hovaten = sc.nextLine();
        System.out.println("xin mời nhập ten lớp dạy");
        this.lopday = sc.nextLine();
        System.out.println("xin mời nhập ten năm sinh ");
        this.namsinh = sc.nextLine();
        System.out.println("xin mời nhập ten lương");
        this.luong = sc.nextLine();
    }

    public void xuat() {
        sinhvien sv = new sinhvien();
        String a = sv.getLop();
        if (lopday == a) {
            System.out.println("giảng viên b có dạy học sinh a");
        }
    }
}
