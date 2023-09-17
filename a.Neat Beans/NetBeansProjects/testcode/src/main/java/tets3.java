
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author QUANGVU
 */
public class tets3 {
    //Viết chương trình tạo ra 2 sản phẩm thông tin được nhập từ bàn phím sau đó gọi
//phương thức xuất để xuất thông tin 2 đối tượng sản phẩm đã tạo

    //Viết chương trình tạo ra 2 sản phẩm 
    private String ten_sp;
    private String don_gia;
    private String giam_gia;

    public tets3(String ten_sp, String don_gia, String giam_gia) {
        this.ten_sp = ten_sp;
        this.don_gia = don_gia;
        this.giam_gia = giam_gia;
    }

    tets3() {
    }

    public String getTen_sp() {
        return ten_sp;
    }

    public void setTen_sp(String ten_sp) {
        this.ten_sp = ten_sp;
    }

    public String getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(String don_gia) {
        this.don_gia = don_gia;
    }

    public String getGiam_gia() {
        return giam_gia;
    }

    public void setGiam_gia(String giam_gia) {
        this.giam_gia = giam_gia;
    }

    public void nhap() {
     
            Scanner sc = new Scanner(System.in);
            System.out.println("Xin mời nhập tên sản phẩm ");
            this.ten_sp = sc.nextLine();
            System.out.println("Xin mời nhập đơn giá ");
            this.don_gia = sc.nextLine();
            System.out.println("Xin mời nhập giảm giá");
            this.giam_gia = sc.nextLine();
        }
    

    public void xuat() {
        System.out.println("Tên sản phẩm %s " + this.ten_sp);
        System.out.println("giá %f " + this.don_gia);
        System.out.println("giảm gía %f " + this.giam_gia);
    }
}
