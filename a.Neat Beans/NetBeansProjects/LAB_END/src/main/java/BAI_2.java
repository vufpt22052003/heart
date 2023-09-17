
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author QUANGVU
 */
//Sử dụng vòng lặp để nhập các số từ 1 đến 10 vào mảng myarrr trên
// Sử dụng vòng lặp để hiển thị các số từ 1 đến 10 từ mảng myarrr.
public class BAI_2 {

    // khai báo kiểu mảng
    public static void main(String[] args) {
        ArrayList< Integer> myList = new ArrayList<>();
        {
            for (int i = 1; i <= 10; i++) {
                myList.add(i);
            }

            myList.forEach((x) -> {
                System.out.print("" + x);
            });

        }
    }
}
