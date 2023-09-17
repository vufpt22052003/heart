/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.vn.mavenproject7;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author QUANGVU
 */
public class vungu {

   // Viết chương trình cho phép người dùng nhập vào 1 chuỗi , kiểm tra chuỗi này có phù hợp với yêu cầu hay không.Nếu có thì in ra “Duyệt
    //!”, ngược lại in ra “Không duyet
//Yêu cầu về chuỗi là
    //: Có độ dài không quá 20 ký tự, không được chứa ký tự khoảng trắng, bắt đầu bằng một ký tự chữ
  //  viết hoa(A - Z), kết thúc bằng một số (0 - 9). (Sử dụng biểu thức chính quy để ràng buộc định dạng)

    public static void main(String[] args) {

       while(true) {
        Calendar h = Calendar.getInstance(); 
        int ho = h.get(Calendar.HOUR_OF_DAY); 
        int mi = h.get(Calendar.MINUTE); 
        int se = h.get(Calendar.SECOND); 

        String tem = "  " + ho +  ":" + mi + ":" + se; 
        jLabel1.setText(tem); 

        try {
              Thread.sleep(1000);
        }catch(Exception ex) {
              ex.printStackTrace();
        }
    }

}
