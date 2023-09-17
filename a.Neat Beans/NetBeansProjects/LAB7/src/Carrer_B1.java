/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author QUANGVU
 */
public enum Carrer_B1 {
    UDPM, MKT, TKDH, WEB;
}

//Khai báo lớp PolyStudent sử dụng Career
 class PolyStudent {

    public String fullname;
    public Carrer_B1 carrer;

    public void print() {
        System.out.println("fullname" + this.fullname);
        switch (this.carrer) {
            case UDPM:
                System.out.println("Ứng dụng phần mềm");
                break;
            case MKT:
                System.out.println("Maketing");
                break;
            case TKDH:
                System.out.println("Thiết kế đồ họa");
                break;
            case WEB:
                System.out.println("Web");
                break;
        }

    }

    public static void main(String[] args) {
        PolyStudent sv = new PolyStudent();
        sv.fullname = "Nguyen anh vu";
        sv.carrer = Carrer_B1.valueOf("UDPM");
        sv.print();
    }
}
