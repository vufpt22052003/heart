/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.vn.lab6;

/**
 *
 * @author QUANGVU
 */
public class TestThread_B3 {
    //Tạo lớp TestThread chứa phương thức main() sau đó tạo 2 đối tượng từ 2 lớp OddThread và EvenThread, start() các thread này.
    public static void main(String[] args) {
          OddThread_B3 th1 = new OddThread_B3();
          EvenThread_B3 th2 = new EvenThread_B3();
       
          
          th1.start();
          try{
            th1.join();
          }catch(InterruptedException ex){}
          th2.start();
          System.out.println("ouput !");
    }
}
