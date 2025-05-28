/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import DAOdatatoko.DatatokoDAO;
import DAOImplement.Datatokoimplement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.*;
import view.MainView;

public class Datatokocontroller {
MainView form;
Datatokoimplement implDatatoko;
    List<Datatoko>data;
    
    private int selectedid =-1;
    
 public Datatokocontroller(MainView form){
    this.form = form;
   implDatatoko = new DatatokoDAO();
   data = implDatatoko.getAll();
   
 }
public void isitabel(){
    data = implDatatoko.gettAll();
    modelTabeldatatoko modelTable = new modelTabeldatatoko(data);
    form.getTableData().setModel(modelTable);
    
    
}
public void create(){
    Datatoko data = new Datatoko();
    
    JTextField[] toko_bela = {
        form.getJTxtCustomer();
    }


}
public void edit(){

}
public void delete(){

}
public void selectdata(){
int selectedRow = form.getTableData()
}
}
