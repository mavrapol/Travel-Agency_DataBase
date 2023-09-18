/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel_agency;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author admin
 */
public class DBconnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/travel_agency";

    public static Connection ConnectDB() {
     try{
           
            
            Connection conn = DriverManager.getConnection(DB_URL, "root", ""); 
//            JOptionPane.showMessageDialog(null, "Connection successful!"); 
            return conn;
           }
        catch(SQLException ex){ 
        JOptionPane.showMessageDialog(null,"Connection failed!");
         ex.printStackTrace();
        return null;
        } 
        
    }
}