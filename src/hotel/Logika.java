package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Logika {

    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", null);
            JOptionPane.showMessageDialog(null, "Connect");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(null, "Not connect");

            return null;
        }
    }
}
