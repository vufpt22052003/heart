/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.vn.lab6;

//Tạo 2 object từ class MyThread là Thread1 và Thread2 với thứ tự ưu tiên
//tương ứng mà MAX_PRIORITY và MIN_PRIORITY.
public class MyThread2 {

    public static void main(String[] args) {
        // tạo đối tượng theread1 và 2
        MyThread thread1 = new MyThread() {
        };
        MyThread thread2 = new MyThread() {
        };

        //tạo đối tuọng th1 lấy từ đối tượng thread1 `
        Thread th1 = new Thread(thread1);
        Thread th2 = new Thread(thread2);
        
        //setPriority thiết lập độ ưu tiên
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        
        // start kêu gọi
        th1.start();
        th2.start();
    }
}
