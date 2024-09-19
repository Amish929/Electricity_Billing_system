
package electricity.billing.system;
  

import java.sql.*;



public class Conn {
    Connection c;
     Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbs:mysql:///ebs","root","Amish@2004");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
      
    }
}
