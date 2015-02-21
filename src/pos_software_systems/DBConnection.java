/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos_software_systems;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jovy
 */
public class DBConnection {
    Connection dbconn = null;
    
    public static Connection Connect(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection dbconn = DriverManager.getConnection("jdbc:sqlite:POS_Database.sqlite");
            
            
            return dbconn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
