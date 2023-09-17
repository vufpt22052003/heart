/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.vn.lab6;

/**
 *
 * @author QUANGVU
 */
public class OddThread_B3 extends Thread {

    //Viết run() của OddThread sao cho xuất các số lẻ từ 1 đến 10, các số được xuất ra cách nhau 10 mili giây.
    @Override
    public void run() {
        for (int i = 0; i <= 10; i+=2) {

            System.out.println("" + i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();
    }
}
