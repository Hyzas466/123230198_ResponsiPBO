
package DAOdatatoko;

import java.sql.*;
import java.util.*;
import java.util.List;
import koneksi.Connector;
import model.*;
import DAOImplement.Datatokoimplement;
import java.util.logging.Level;
import java.util.logging.Logger;

        
public class DatatokoDAO implements Datatokoimplement {
    Connection connection;
    
    final String select = " SELECT * FROM toko_bela";
    final String create = "INSERT INTO toko_bela(nama_customer,barang,harga_barang,cicilan,bunga,angsuran,total)VALUES(?,?,?,?,?,?,?)";
    final String edit = "UPDATE toko_bela SET nama_customer=?,barang=?,harga_barang=?,cicilan=?,bunga=?,angsuran=?,total=? WHERE id_barang=?";
    final String delete =" DELETE FROM toko_bela WHERE id_barang";
    
    public DatatokoDAO(){
        connection = Connector.connection()
    }
    
}
