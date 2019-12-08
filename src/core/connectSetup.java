package core;

import java.io.File;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class connectSetup {
     /**
     * Connect to a sample database
     */
    public String url;
    public Connection conn;
    public connectSetup(){
        String filePath = new File("").getAbsolutePath();
        String filePathChanged = filePath.replaceAll("\\\\", "/");
        String path = "/db/cpb-db.db";
        String fullPath = "jdbc:sqlite:" + filePathChanged + path;
        try {
             conn = DriverManager.getConnection(fullPath);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
    
    
    public void close(){
        try {
            conn.close();
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(connectSetup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<String> createSetup(String[] columns, String motherboard, String graphicsCard, String processor, String psu, String ram, String computerCase, String hdd, String ssd, String price) {
        ArrayList<String> result = new ArrayList<String>();
        String cols = String.join(", ", columns);
        String sql = "INSERT INTO setups (Motherboard, Graphics_Card, Processor, PSU, RAM, Computer_Case, HDD, SSD, Price) VALUES ('" + motherboard + "', " + "'" + graphicsCard + "', " + "'" + processor + "', " + "'" + psu + "', " +
                "'" + ram + "', " + "'" + computerCase + "', " + "'" + hdd + "', " + "'" + ssd + "', "+ "'" + price + "')";
        try {
            Connection openConn = conn;
            Statement stmt  = openConn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            ResultSetMetaData rsMetaData = rs.getMetaData();
            
            while (rs.next()) {
                String data = "";
                for (int i = 0; i < columns.length; i++) {
                    int index = rsMetaData.getColumnType(i+1);
                    switch(index){
                        case 12: data = data + rs.getString(columns[i])  + "!-!"; break;
                        case 4: data = data + rs.getInt(columns[i])  + "!-!"; break;
                        case 7: data = data + rs.getInt(columns[i]) + "!-!"; break;
                        case 8: data = data + rs.getDouble(columns[i]) + "!-!"; break;
                        case 91: data = data + rs.getDate(columns[i]) + "!-!"; break;
                        
                        // https://www.tutorialspoint.com/java-resultsetmetadata-getcolumntype-method-with-example
                        default: break;
                    }
                }
                result.add(data);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public void checkIfPresent(String table, String column, int id) {
        String sql = "SELECT 1 FROM " + table + " WHERE " + column + " LIKE " + id;
        System.out.println(sql);
        try {
            Connection openConn = conn;
            Statement stmt  = openConn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            // loop through the result set
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteWhere(String table, String column, int id) {
        String sql = "DELETE FROM " + table + " WHERE " + column + " LIKE " + id;
        System.out.println(sql);
        try {
            Connection openConn = conn;
            Statement stmt  = openConn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<String> fillTable(String[] columns, String table) {
        ArrayList<String> result = new ArrayList<String>();        
        String cols = String.join(", ", columns);
        String sql = "SELECT " + cols + " FROM " + table;
        try {
            Connection openConn = conn;
            Statement stmt  = openConn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            ResultSetMetaData rsMetaData = rs.getMetaData();
            
            while (rs.next()) {
                String data = "";
                for (int i = 0; i < columns.length; i++) {
                    int index = rsMetaData.getColumnType(i+1);
                    switch(index){
                        case 12: data = data + rs.getString(columns[i]) + " "; break;
                        case 4: data = data + rs.getInt(columns[i])  + " "; break;
                        case 8: data = data + rs.getDouble(columns[i])  + " "; break;
                        case 91: data = data + rs.getDate(columns[i])  + " "; break;
                        // https://www.tutorialspoint.com/java-resultsetmetadata-getcolumntype-method-with-example
                        default: break;
                    }
                }
                result.add(data);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}