/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.vn.lab_8;

//Sử dụng thư viện trên để sao chép một file thành một file khác
public class FileInputStream {

    public FileInputStream(String cnetbeansJAVA2OutputStream_B1) {
    }
    public static void main(String[] args) {
        // Tạo đối tuọng
        FileInputStream is = null;
        // đoc dử liệu
        try {
            is = new FileInputStream("C:/netbeans/JAVA2/OutputStream_B1");
            int i = 0;
            //Nó được sử dụng để đọc byte dữ li)u từ file input stream.
            while ((i = is.read()) != 0 ) {
                System.out.println((char) i);
            }
            is.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
     is.close();
        }
    }    
}
