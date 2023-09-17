/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass_java2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QUANGVU
 */
public class EmpolyDAO implements InterEmpoly {

    public static List<Empoly> ls = new ArrayList<>();

    @Override
    public int save(Empoly e) {
        int pos = findByID(e.getId());
        if (pos < 0) {
            ls.add(e);
        } else {
            ls.set(pos, e);
        }
        return 1;
    }

    @Override
    public int del(String id) {
        int pos = findByID(id);
        if (pos >= 0) {
            ls.remove(pos);
        }
        return pos;
    }

    @Override
    public int findByID(String id) {
        int position = -1;
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getId().equals(id)) {
                position = i;
                break;
            }
        }
        return position;
    }

    @Override
    public Empoly getEmpolyByPossition(int index) {
        if (index >= 0 && index < ls.size()) {
            return ls.get(index);
        }
        return null;
    }

    @Override
    public List<Empoly> openFile() {
        ls.add(new Empoly("PO06206", "Anh Vũ", "Vuna@fpt.edu.vn", 22,  50000.0));
        ls.add(new Empoly("PO06207", "Văn Tèo", "Teona@fpt.edu.vn", 23,  50000.0));
        ls.add(new Empoly("PO06208", "Văn Tú", "Tuna@fpt.edu.vn", 24,  50000.0));
        ls.add(new Empoly("PO06209", "Ronaldo", "do@fpt.edu.vn", 25,  50000.0));     
        return ls;
    }

    @Override
    public void saveFile(List<Empoly> ls) {
      
    }

    @Override
    public List<Empoly> getAlls() {
        return ls;
    }

    @Override
    public int count() {
        return ls.size();
    }

}
