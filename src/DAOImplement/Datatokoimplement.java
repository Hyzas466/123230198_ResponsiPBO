/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import java.util.List;
import model.*;

public interface Datatokoimplement {
    public void create(Datatoko t);
    public void edit(Datatoko t);
    public void delete(int id_barang);
    public List<Datatoko>gettAll();
}
