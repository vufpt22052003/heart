/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass_java2;

import java.io.Serializable;

/**
 *
 * @author QUANGVU
 */
public class Empoly implements Serializable{
     private String id , name ,email ;
     private int age ;
     private Double luong ; 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public Empoly(String id, String name, String email, int age, Double luong) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.luong = luong;
    }

}
