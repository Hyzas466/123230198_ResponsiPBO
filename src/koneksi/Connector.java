
package koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;


public class Connector {
static Connection conn;

public static Connection connection(){
    if(conn==null){
      MysqlDataSource  dataSource = new MysqlDataSource();
      dataSource.setDatabaseName("toko");
      dataSource.setUser("root");
      dataSource.setPassword("");
      
      try{
          conn = dataSource.getConnection();
          System.out.println("Koneksi berhasil");
          
      }catch(SQLException ex){
          ex.printStackTrace();
          System.err.println("koneksi gagal:" + ex.getMessage());
          System.out.println("koneksi gagal");
      }
     
      
    }
    return conn;
}

}