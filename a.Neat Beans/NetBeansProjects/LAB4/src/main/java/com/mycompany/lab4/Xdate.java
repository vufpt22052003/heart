/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.text.ParseException;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author QUANGVU
 */
public class Xdate {
    
    
    public static Date parse(String text)throws ParseException {
      simperdate dtf = new simperdate("dd-MM-YYYY");
      return dtf.parse(text);
    }
    
     public static Date parse(String text , String pattern)throws ParseException {
      simperdate dtf = new simperdate(pattern);
      return dtf.parse(text);
    }

}

