
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author QUANGVU
 */
public class test1 {

    String tenSP;
    Double dongia;
    Double giamgia;

    public double getThueNhapKhau() {
        return this.dongia * 0.1;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("xin mời nhạp ten sp");
        this.tenSP = sc.nextLine();
        System.out.println("xin mời nhạp giá sp");
        this.dongia = sc.nextDouble();
        System.out.println("xin mời nhạp giảm giá sp");
        this.giamgia = sc.nextDouble();
    }

    public void xuat() {
        System.out.printf("tên sản phẩm là %s , gia sản phẩm là %f , giảm giá %f" , this.tenSP ,this.dongia ,this.giamgia);
    }

}
