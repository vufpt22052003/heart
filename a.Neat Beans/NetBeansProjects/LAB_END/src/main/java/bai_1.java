
import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author QUANGVU
 */
/*hêm vào ArrayList 1 số nguyên
✓ Thêm vào ArrayList 1 số thực
✓ Thêm vào ArrayList 1 giá trị boolean
✓ Thêm vào ArrayList 1 xâu ký tự
✓ In ra màn hình 4 giá trị trên từ ArrayList*/
public class bai_1 {

    public static void main(String[] args) {
        ArrayList List = new ArrayList<>();
        List.add(10);
        List.add(5.6);
        List.add(true);
        List.add("hello worl");

        System.out.println(List.toString());
    }
}
