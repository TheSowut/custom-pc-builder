/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class connectAccount {
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
            String path = "/db/sqlite/db/logins.db";
            String fullPath = "jdbc:sqlite:" + filePathChanged + path;
            System.out.println("Path to DB: " + fullPath);
            
            // Establishing connection with the DB
            conn = DriverManager.getConnection(fullPath);
            System.out.println("Connection to SQLite has been established.");
            
            // Query which inserts the new details of the account in the accounts table
            String queryCreateAcc = "INSERT INTO 'accounts'('username', 'password') VALUES (?,?)";
            try (Connection openConn = conn;
                Statement stmt  = openConn.createStatement();
                ResultSet rs    = stmt.executeQuery(queryCreateAcc)){
 
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
}
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        connect();
//    }
//}