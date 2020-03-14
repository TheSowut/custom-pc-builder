package core;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
 
/**
 *
 * @author sqlitetutorial.net
 */
public class checkUsername {
     /**
     * Connect to a sample database
     */
    public static String check(String username) {
        String result = "";
        Connection conn = null;
        try {
            // The string fullPath gets the absolute path to the DB
            String filePath = new File("").getAbsolutePath();
            String filePathChanged = filePath.replaceAll("\\\\", "/");
            String path = "/db/cpb-db.db";
            String fullPath = "jdbc:sqlite:" + filePathChanged + path;
            
            // Establishing connection with the DB
            conn = DriverManager.getConnection(fullPath);
            
            // Query which which shows the usernames
            String queryCheckForUsername = ("SELECT * FROM accounts WHERE username = '" + username + "'");
            
            try (Connection openConn = conn;
                Statement stmt  = openConn.createStatement();
                ResultSet rs    = stmt.executeQuery(queryCheckForUsername)){
 
                // loop through the result set
                while (rs.next()) {
                    result = rs.getString("username");
                    System.out.println("User already exists !");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return result;
    }
}
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        connect();
//    }
//}