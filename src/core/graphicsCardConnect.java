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
public class graphicsCardConnect {
     /**
     * Connect to a sample database
     */
    public String url;
    public Connection conn;
    public graphicsCardConnect(){
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
            Logger.getLogger(graphicsCardConnect.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public ArrayList<String> add(String[] columns, String manufacturer, String model, String graphicsCardInterface, String capacity, String memoryType, String price) {
        ArrayList<String> result = new ArrayList<String>();
        String cols = String.join(", ", columns);
        String sql = "SELECT " + cols + " FROM graphicscards";
        String queryInsertData = "INSERT INTO graphicscards (Manufacturer, Model, Interface, Capacity, Memory_Type, Price) values ('" + manufacturer + "', '" + model + "', '" + graphicsCardInterface + "', '" + capacity + "', '" + memoryType + "', '" + price + "')";
        try {
            Connection openConn = conn;
            Statement stmt  = openConn.createStatement();
            ResultSet rs    = stmt.executeQuery(queryInsertData);
            // loop through the result set
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
//                    result.add(rs.getString("city"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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