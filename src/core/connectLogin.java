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
public class connectLogin {
     /**
     * Connect to a sample database
     */
    public static ArrayList<String> connect(String term) {
        ArrayList<String> result = new ArrayList<String>();
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
            String queryBrowseUsernames = ("SELECT username FROM accounts");
            
            try (Connection openConn = conn;
                Statement stmt  = openConn.createStatement();
                ResultSet rs    = stmt.executeQuery(queryBrowseUsernames)){
 
                // loop through the result set
                while (rs.next()) {
                    result.add(rs.getString("username"));
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

    public static String checkPassword(String usernameInput) {
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
            String queryBrowseUsernames = ("SELECT password FROM accounts WHERE username = '" + usernameInput + "'");
            
            try (Connection openConn = conn;
                Statement stmt  = openConn.createStatement();
                ResultSet rs    = stmt.executeQuery(queryBrowseUsernames)){
 
                // loop through the result set
                while (rs.next()) {
                    result = (rs.getString("password"));
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