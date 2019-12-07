package core;

import java.io.File;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sqlitetutorial.net
 */
public class computercaseConnect {
     /**
     * Connect to a sample database
     */
    public String url;
    public Connection conn;
    public computercaseConnect(){
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
            Logger.getLogger(computercaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
    public ArrayList<String> conn(String[] columns, String table) {
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
    
    public ArrayList<String> add(String[] columns, String manufacturer, String model, String type, String motherboardSupport, String extras, String price) {
        ArrayList<String> result = new ArrayList<String>();
        String cols = String.join(", ", columns);
        String sql = "SELECT " + cols + " FROM computercases";
        String queryInsertData = "INSERT INTO computercases (Manufacturer, Model, Type, Motherboard_Support, Extras, Price) values ('" + manufacturer + "', '" + model + "', '" + type + "', '" + motherboardSupport + "', '" + extras + "', '" + price + "')";
        try {
            Connection openConn = conn;
            Statement stmt  = openConn.createStatement();
            ResultSet rs    = stmt.executeQuery(queryInsertData);
            ResultSetMetaData rsMetaData = rs.getMetaData();
            
            while (rs.next()) {
                String data = "";
                for (int i = 0; i < columns.length; i++) {
                    int index = rsMetaData.getColumnType(i+1);
                    switch(index){
                        case 12: data = data + rs.getString(columns[i])  + " "; break;
                        case 4: data = data + rs.getInt(columns[i])  + " "; break;
                        case 8: data = data + rs.getDouble(columns[i]) + " "; break;
                        case 91: data = data + rs.getDate(columns[i]) + " "; break;
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
    
        public ArrayList<String> getComputerCase(String term) {
        ArrayList<String> result = new ArrayList<String>();
        Connection conn = null;
        try {
            String filePath = new File("").getAbsolutePath();
            String filePathChanged = filePath.replaceAll("\\\\", "/");
            String path = "/db/cpb-db.db";
            String fullPath = "jdbc:sqlite:" + filePathChanged + path;
            
            conn = DriverManager.getConnection(fullPath);
            String queryBrowseModels = ("SELECT DISTINCT Manufacturer FROM computercases");
            try (Connection openConn = conn;
                Statement stmt  = openConn.createStatement();
                ResultSet rs    = stmt.executeQuery(queryBrowseModels)){
                while (rs.next()) {
                    result.add(rs.getString("Manufacturer"));
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
        
    public ArrayList<String> getComputerCaseModel(String manufacturer) {
        ArrayList<String> result = new ArrayList<String>();
        Connection conn = null;
        try {
            String filePath = new File("").getAbsolutePath();
            String filePathChanged = filePath.replaceAll("\\\\", "/");
            String path = "/db/cpb-db.db";
            String fullPath = "jdbc:sqlite:" + filePathChanged + path;
            
            conn = DriverManager.getConnection(fullPath);
            String queryBrowseModels = ("SELECT DISTINCT Model FROM computercases WHERE Manufacturer = " + "'" + manufacturer + "'");
            try (Connection openConn = conn;
                Statement stmt  = openConn.createStatement();
                ResultSet rs    = stmt.executeQuery(queryBrowseModels)){
                while (rs.next()) {
                    result.add(rs.getString("Model"));
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
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        connect();
//    }
}