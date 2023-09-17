/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author QUANGVU
 */
public class Time {
    private JButton buton;

    public Time(JButton buton) {
        this.buton = buton;
    }

    Time() {
    }
   @Override
   public void run(){
       SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss:aa");
       while(true){
           Date now = new Date();
           String st = sdf.format(now);
           buton.setText((st));
           try{
               Thread.sleep(2000);
           }catch(InterruptedException ex){}
       }
   }
}
