
package lms;
import java.sql.*;

public class Database {
     Connection con = null;

    public Connection DBConnect() {

        try {
            final String url="jdbc:mysql://localhost/LMS";
            final String name="root";
            final String pass="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url, name, pass);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return con;
    }
}
