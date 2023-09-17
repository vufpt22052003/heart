
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author QUANGVU
 */
public class Empoly {

    private String id, name, email;
    private int age;
    private double luong;

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

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
// tạo constructer k tham số và có tham số
    public Empoly() {
    }

    public Empoly(String id, String name, String email, int age, double luong) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.luong = luong;
    }


}
