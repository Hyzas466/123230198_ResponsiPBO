/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class modelTabeldatatoko extends AbstractTableModel{
    List<datatoko>data;
    
    public modelTabeldatatoko(List<datatko>data){
        this.data = data;
        
    }
    @Override
    public int getRowCount(){
        return data.size();
    }
      @Override
    public int getColumnCount(){
        return 7;
        
    }
      @Override
    public String getColumnName(int column){
        switch(column){
        case 0:
            return "Nama Customer";
            case 1:
            return "Barang";
            case 2:
            return "Harga Barang";
            case 3:
            return "cicilan";
            case 4:
            return "bunga";
            case 5:
            return "angsuran";
            case 6:
            return "total";
            
            default:
                return null;
            
    }
    }
}
