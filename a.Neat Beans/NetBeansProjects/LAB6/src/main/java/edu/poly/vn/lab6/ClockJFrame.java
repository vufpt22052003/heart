/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.vn.lab6;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;


/*
 * @author QUANGVU
 */
public class ClockJFrame extends Thread {

    // tạo đối tượng button
    JButton button;

    public ClockJFrame(JButton button) {
        this.button = button;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
        while (true) {
            Date date = new Date();
            String st = sdf.format(date);
            button.setText(st);
            try {
               Thread.sleep(1000);
            } catch(InterruptedException e){}
            
        }}
    }
