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
public class motherboardConnect {
     /**
     * Connect to a sample database
     */
    public String url;
    public Connection conn;
    public motherboardConnect(){
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
            Logger.getLogger(motherboardConnect.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public ArrayList<String> add(String[] columns, String manufacturer, String model, String socket, String chipset, String formFactor, String price) {
        ArrayList<String> result = new ArrayList<String>();
        String cols = String.join(", ", columns);
        String sql = "SELECT " + cols + " FROM motherboards";
        String queryInsertData = "INSERT INTO motherboards (Manufacturer, Model, Socket, Chipset, Form_Factor, Price) values ('" + manufacturer + "', '" + model + "', '" + socket + "', '" + chipset + "', '" + formFactor + "', '" + price + "')";
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
    
    public ArrayList<String> getMotherboard(String term) {
        ArrayList<String> result = new ArrayList<String>();
        Connection conn = null;
        try {
            String filePath = new File("").getAbsolutePath();
            String filePathChanged = filePath.replaceAll("\\\\", "/");
            String path = "/db/cpb-db.db";
            String fullPath = "jdbc:sqlite:" + filePathChanged + path;
            
            conn = DriverManager.getConnection(fullPath);
            String queryBrowseModels = ("SELECT DISTINCT Manufacturer FROM motherboards");
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

    public ArrayList<String> getMotherboardModel(String brand) {
        ArrayList<String> result = new ArrayList<String>();
        Connection conn = null;
        try {
            String filePath = new File("").getAbsolutePath();
            String filePathChanged = filePath.replaceAll("\\\\", "/");
            String path = "/db/cpb-db.db";
            String fullPath = "jdbc:sqlite:" + filePathChanged + path;
            
            conn = DriverManager.getConnection(fullPath);
            String queryBrowseModels = ("SELECT Model FROM motherboards WHERE Manufacturer = " + "'" + brand + "'");
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
}
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        connect();
//    }
//}