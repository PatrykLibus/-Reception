package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Logika {

    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", null);

            return con;
        } catch (SQLException ex) {
            Logger.getLogger(null, "Not connect");

            return null;
        }
    }

    public void ShowPersonsInJTable(JTable table) {

        ArrayList<Person> list = getPersonList();

        Connection con = getConnection();
        table.setAutoCreateRowSorter(true);
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        model.setRowCount(0);
        Object[] row = new Object[4];

        for (int i = 0; i < list.size(); i++) {

            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getSurname();
            row[3] = list.get(i).getNumber();

            model.addRow(row);
        }

    }

    public ArrayList<Person> getPersonList() {

        ArrayList<Person> personList = new ArrayList<Person>();

        String sql = "Select * from persons";

        try {
            Connection con = getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Person person;

            while (rs.next()) {

                person = new Person(rs.getInt("id"), rs.getString("name"), rs.getString("surname"), rs.getInt("number"));
                personList.add(person);

            }

        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        return personList;
    }

    public void DisplayTable(JTable table) {
        int index = table.getSelectedRow();
        TableModel model = table.getModel();
        table.setAutoCreateRowSorter(true);

        String sql = "Select * from rooms";
        try {

            Connection con = getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

}
