/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.vn.lab_8;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author QUANGVU
 */
public class OutputStream_B1 {

    //Xây dựng một thư viện tiện ích XFile gồm các hàm read() và write() cho phép đọc
    // và ghi file nhị phân.
    //Sử dụng thư viện trên để sao chép một file thành một file khác
    public static void main(String[] args) {
        // tạo đối tương sos
        FileOutputStream SOS = null;
        try {
            // lấy đối tương sos gắn địa chỉ file cho nó
            SOS = new FileOutputStream("C:/netbeans/JAVA2/OutputStream_B1");
            // tạo  một chuổi (String)
            String st = ("hello haha ");
            // đối tương.thuộc tính
            //lấy đối tương sos xuất ra màn hình 
            //st tạo ở chuổi dòng 26  ...Phương thức getBytes() trả về mảng byte của chuỗi.
            SOS.write(st.getBytes());
        } catch (IOException e) {
            System.err.println("Erorr" + e.getMessage());
        } finally {
            try {
                SOS.close();
            } catch (IOException ex) {
            }
        }
    }
}
