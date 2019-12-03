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
        System.out.println(sql);
        try {
            Connection openConn = conn;
            Statement stmt  = openConn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            // loop through the result set
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
//                    result.add(rs.getString("city"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
    
//    public ArrayList<String> selectWhere(String[] columns, String table, String term, int pos) {
//        ArrayList<String> result = new ArrayList<String>();
//        String cols = String.join(", ", columns);
//        String sql = "SELECT " + cols + " FROM " + table + " WHERE " + columns[pos] + " LIKE '%" + term + "%'";
//        System.out.println(sql);
//        try {
//            Connection openConn = conn;
//            Statement stmt  = openConn.createStatement();
//            ResultSet rs    = stmt.executeQuery(sql);
//            // loop through the result set
//            ResultSetMetaData rsMetaData = rs.getMetaData();
//            
//            while (rs.next()) {
//                String data = "";
//                for (int i = 0; i < columns.length; i++) {
//                    int index = rsMetaData.getColumnType(i+1);
//                    switch(index){
//                        case 12: data = data + rs.getString(columns[i])  + " "; break;
//                        case 4: data = data + rs.getInt(columns[i])  + " "; break;
//                        case 8: data = data + rs.getDouble(columns[i]) + " "; break;
//                        case 91: data = data + rs.getDate(columns[i]) + " "; break;
//                        // https://www.tutorialspoint.com/java-resultsetmetadata-getcolumntype-method-with-example
//                        default: break;
//                    }
//                    
//                }
//                result.add(data);
////                    result.add(rs.getString("city"));
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return result;
//    }
    
//    public void deleteWhere(String table, int term, String col) {
//        String sql = "DELETE FROM " + table + " WHERE " + col + " LIKE " + term;
//        // = работи само с числени стойности за разика от LIKE (което работи и с string
//        // за LIKE задължително с '' - пример LIKE '%" + term + "%'%;
//        System.out.println(sql);
//        try {
//            Connection openConn = conn;
//            Statement stmt  = openConn.createStatement();
//            ResultSet rs    = stmt.executeQuery(sql);
//            // loop through the result set
//            ResultSetMetaData rsMetaData = rs.getMetaData();
//            
//            while (rs.next()) {
//                System.out.println("Row Deleted");
////                    result.add(rs.getString("city"));
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        connect();
//    }
}