
package gesetudiant.conbd;

/**
 *
 * @author hppp
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AccessDB {
    
    public static Connection obtenirConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccessDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url,user,pass);
            //JOptionPane.showMessageDialog(null, "Connexion bien établie");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(AccessDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
}
