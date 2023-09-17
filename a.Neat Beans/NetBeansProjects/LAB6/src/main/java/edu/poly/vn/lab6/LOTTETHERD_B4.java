/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.vn.lab6;

import java.awt.Button;
import java.util.Date;
import java.util.Random;
import javax.swing.JTextField;

public class LOTTETHERD_B4 extends Thread {

    private JTextField txt;

    public LOTTETHERD_B4(JTextField txt) {
        this.txt = txt;
    }

    LOTTETHERD_B4(Button TXTUNIT) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    /**
     *
     */
    @Override
    public void run() {
        Date date = new Date();
        Random random = new Random(date.getTime());
        for (int i = 1; i <= 1000; i++) {
            int num = Math.abs(random.nextInt() % 10);
            txt.setText("" + num);

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }
        }
    }
}
