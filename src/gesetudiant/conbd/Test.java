/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesetudiant.conbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Microlink
 */
public class Test {
    
    public static Connection testerConnexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        String url = "jdbc:mysql://localhost:3306/iaitest";
        String user = "root";
        String pass = "";
        
        try {
            Connection con = DriverManager.getConnection(url,user,pass);
            JOptionPane.showMessageDialog(null, "Connexion bien établie");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    public static void main(String[] args){
        testerConnexion();
    }
    
}
