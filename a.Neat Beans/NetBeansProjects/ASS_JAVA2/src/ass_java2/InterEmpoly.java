/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ass_java2;

import java.util.List;

/**
 *
 * @author QUANGVU
 */
public interface InterEmpoly {

    int save(Empoly e);

    int del(String id);

    int findByID(String id);

    Empoly getEmpolyByPossition(int index);

    List<Empoly> openFile();

    void saveFile(List<Empoly> ls);

    List<Empoly> getAlls();

    int count();

}
