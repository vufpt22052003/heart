/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a;

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
public class DISPLAY {

    String[] Name = {"Nguyen Ngoc Lan", "Duong Tien Nam", "Ngo Anh Quan", "Pham Van Duc", "Tran Thi Ha"};
    String[] que_quan = {"Hải Phòng", "Hà Nội", "Thái Nguyên", "Hà Tĩnh", "Quảng Ninh"};

  
    public String[] getName() {
        return Name;
    }

    public void setName(String[] Name) {
        this.Name = Name;
    }

    public String[] getQue_quan() {
        return que_quan;
    }

    public void setQue_quan(String[] que_quan) {
        this.que_quan = que_quan;
    }
  
}
