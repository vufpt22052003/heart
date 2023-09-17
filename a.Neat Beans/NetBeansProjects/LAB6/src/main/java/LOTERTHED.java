
import java.awt.Button;
import java.util.Date;
import java.util.Random;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author QUANGVU
 */
public class LOTERTHED extends Thread{
    private  JTextField txt ;

    public LOTERTHED(JTextField txt) {
        this.txt = txt;
    }

   @Override
    public void run(){
        Date date = new Date();
        Random random = new Random(date.getTime());
        for (int i = 1; i <= 1000; i++) {
            int num = Math.abs(random.nextInt() % 10);
            txt.setText("" + num);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }

   
    
}
