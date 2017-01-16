package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
 
    private static Connection con;
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (con == null || con.getMetaData().getURL().contains("test")) {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://viter.dk/10mangg", "transformer", "bookworm#17laesehest");
        }
        return con;
    }
    
}