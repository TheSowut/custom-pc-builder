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
public class getHardwareComponents {
     /**
     * Connect to a sample database
     */
    public String url;
    public Connection conn;
    public getHardwareComponents(){
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
            Logger.getLogger(hddConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<String> getManufacturer(String term, String table, String col) {
        ArrayList<String> result = new ArrayList<String>();
        Connection conn = null;
        try {
            String filePath = new File("").getAbsolutePath();
            String filePathChanged = filePath.replaceAll("\\\\", "/");
            String path = "/db/cpb-db.db";
            String fullPath = "jdbc:sqlite:" + filePathChanged + path;
            
            conn = DriverManager.getConnection(fullPath);
            String queryBrowseModels = ("SELECT DISTINCT " + col + " FROM " + table);
            try (Connection openConn = conn;
                Statement stmt  = openConn.createStatement();
                ResultSet rs    = stmt.executeQuery(queryBrowseModels)){
                if (col == "Manufacturer"){
                    while (rs.next()) {
                    result.add(rs.getString("Manufacturer"));
                    }
                }
                else{
                    while (rs.next()) {
                    result.add(rs.getString("Brand"));
                    }
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
    
    public ArrayList<String> getModel(String manufacturer, String table, String col) {
        ArrayList<String> result = new ArrayList<String>();
        Connection conn = null;
        try {
            String filePath = new File("").getAbsolutePath();
            String filePathChanged = filePath.replaceAll("\\\\", "/");
            String path = "/db/cpb-db.db";
            String fullPath = "jdbc:sqlite:" + filePathChanged + path;
            
            conn = DriverManager.getConnection(fullPath);
            String queryBrowseModels = ("SELECT DISTINCT Model FROM " + table + " WHERE " + col + " = " + "'" + manufacturer + "'");
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
    
    public String getSocket(String model) {
        String result = "";
        Connection conn = null;
        try {
            String filePath = new File("").getAbsolutePath();
            String filePathChanged = filePath.replaceAll("\\\\", "/");
            String path = "/db/cpb-db.db";
            String fullPath = "jdbc:sqlite:" + filePathChanged + path;
            
            conn = DriverManager.getConnection(fullPath);
            String queryBrowseModels = ("SELECT DISTINCT Socket FROM motherboards WHERE Model = " + "'" + model + "'");
            try (Connection openConn = conn;
                Statement stmt  = openConn.createStatement();
                ResultSet rs    = stmt.executeQuery(queryBrowseModels)){
                while (rs.next()) {
                    result = rs.getString("Socket");
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
    
    public ArrayList<String> getModelBySocket(String manufacturer, String table, String col, String socket) {
        ArrayList<String> result = new ArrayList<String>();
        Connection conn = null;
        try {
            String filePath = new File("").getAbsolutePath();
            String filePathChanged = filePath.replaceAll("\\\\", "/");
            String path = "/db/cpb-db.db";
            String fullPath = "jdbc:sqlite:" + filePathChanged + path;
            
            conn = DriverManager.getConnection(fullPath);
            String queryBrowseModels = ("SELECT DISTINCT Model FROM " + table + " WHERE " + col + " = " + "'" + manufacturer + "'"
                    + " AND Socket = " + "'" + socket + "'");
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
    
    public ArrayList<String> getManufacturerBySocket(String table, String socket) {
        ArrayList<String> result = new ArrayList<String>();
        Connection conn = null;
        try {
            String filePath = new File("").getAbsolutePath();
            String filePathChanged = filePath.replaceAll("\\\\", "/");
            String path = "/db/cpb-db.db";
            String fullPath = "jdbc:sqlite:" + filePathChanged + path;
            
            conn = DriverManager.getConnection(fullPath);
            String queryBrowseModels = ("SELECT DISTINCT Brand FROM " + table + " WHERE Socket = " + "'" + socket + "'");
            try (Connection openConn = conn;
                Statement stmt  = openConn.createStatement();
                ResultSet rs    = stmt.executeQuery(queryBrowseModels)){
                while (rs.next()) {
                    result.add(rs.getString("Brand"));
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