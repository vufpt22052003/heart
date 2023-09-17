/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a;

import java.util.jar.Attributes.Name;


/*cho một danh sách là họ tên các sinh viên

Ví dụ: {“Nguyen Ngoc Lan”,”Duong Tien Nam”,”Ngo Anh Quan”,”Pham Van Duc”,”Tran Thi Ha”}

 

Một danh sách khác là quê tương ứng của các sinh viên trên:

Ví dụ:

{“Hải Phòng”,”Hà Nội”,”Thái Nguyên”,”Hà Tĩnh”,”Quảng Ninh”}

 

Viết 1 ứng dụng Java sử dụng Thread để thực hiện công việc:

-          Thread thứ nhất sau mỗi giây sẽ hiển thị tên 1 người tương ứng trong danh sách tên

-          Thread thứ hai ngay sau đó sẽ hiển thị quê tương ứng của người đó

-          Hai Thread thực hiện mỗi thread 5 lần sẽ dừng lại

Phải đảm bảo rằng Thread1 luôn được chạy trước rồi mới đến Thread2*/
public class therad extends Thread{
    private  String name ;

    public therad(String name) {
        this.name = name;
    }
    
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            
             System.out.println("hehe");
        }
    }
}
