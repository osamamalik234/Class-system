package MyPackage;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

       public void createConnection() {

              try {
                     //Class.forName("com.mysql.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root", "rootpassword");
                     Statement stm = con.createStatement();
                     stm.execute("insert into MyTable values ('Faizan Shaikh')");
                     stm.close();
                     System.out.println("Data has been inserted Successfully");
              } catch (Exception e) {
                 System.out.println(e);
              }
       }
       public static void main(String[] args) {
              DataBase mydb = new DataBase();
              mydb.createConnection();
       }
}
