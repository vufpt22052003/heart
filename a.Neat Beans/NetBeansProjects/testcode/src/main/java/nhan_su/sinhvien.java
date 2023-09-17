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
public class sinhvien {
    //Class sinh viên gồm các thuộc tính: họ tên, lớp học, điểm toán, lý, hóa.

    private String hovaten;
    private String lop;
    private int diemtoan, diemly, diemhoa;

    public sinhvien(String hovaten, String lop, int diemtoan, int diemly, int diemhoa) {
        this.hovaten = hovaten;
        this.lop = lop;
        this.diemtoan = diemtoan;
        this.diemly = diemly;
        this.diemhoa = diemhoa;
    }

    sinhvien() {

    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getDiemtoan() {
        return diemtoan;
    }

    public void setDiemtoan(int diemtoan) {
        this.diemtoan = diemtoan;
    }

    public int getDiemly() {
        return diemly;
    }

    public void setDiemly(int diemly) {
        this.diemly = diemly;
    }

    public int getDiemhoa() {
        return diemhoa;
    }

    public void setDiemhoa(int diemhoa) {
        this.diemhoa = diemhoa;
    }

    //Tạo đối tượng học sinh a.
    public void nhap1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("xin mời nhập ten học sinh");
        this.hovaten = sc.nextLine();
        System.out.println("xin mời nhập lớp");
        this.lop = sc.nextLine();
        System.out.println("xin mời nhập điểm toán");
        this.diemtoan = sc.nextInt();
        System.out.println("xin mời nhập điểm lý ");
        this.diemly = sc.nextInt();
        System.out.println("xin mời nhập lớp");
        this.diemhoa = sc.nextInt();
        System.out.printf("hoc sinh %s , học lớp %s , có điểm toán lý hóa như sau %d&d&d " + this.hovaten, this.lop , this.diemtoan ,  this.diemly, this.diemhoa);
    }

    public void xuat1() {
        if (diemly <= 5 & diemtoan <= 5 & diemly <= 5) {
            System.out.println("Học sinh yếu");
        }
        if (diemtoan >= 5 & diemtoan >= 5 & diemly >= 5) {
            System.out.println("Học sinh khá");
        }
        if (diemtoan > 8 & diemtoan > 8 & diemly > 8) {
            System.out.println("Học sinh giỏi");
        }

        int tong = 0;
        int diem = (diemtoan + diemly + diemhoa % 3);
        System.out.println("điêm trung bình cả năm là %d" + diem);
    }
}
