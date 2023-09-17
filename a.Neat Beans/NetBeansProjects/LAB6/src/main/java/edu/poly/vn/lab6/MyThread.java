/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.vn.lab6;

//Trong phương thức run() chứa một vòng lặp in ra 10 số tự nhiên đầu tiên và
//mỗi lần in cách nhau 500 milliseconds. 
public abstract class MyThread  implements Runnable {
@Override // Lớp cha cho phép Java có quyền tạo ra một phương thức giống với phương thức của lớp cha.
    public void run() {
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("" + i);
        }
        System.out.println(); 
   }
}
