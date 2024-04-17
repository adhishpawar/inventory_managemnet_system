//package bank.management.system;
//import javax.swing.*;
//import java.awt.*;
//import java.sql.*;
//import java.awt.event.*;
//import javax.swing.table.DefaultTableModel;
//
//public class ViewTable extends JFrame {
//
//    JTable table;
//
//    ViewTable() {
//        getContentPane().setBackground(Color.white);
//        setLayout(null);    
//
//        try {
//            conn c = new conn();
//            ResultSet rs = c.s.executeQuery("select * from inventory");
//            DefaultTableModel model = buildTableModel(rs);
//            table = new JTable(model); // Create the JTable with the correct model
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Hi");
//        }
//
//        JScrollPane jsp = new JScrollPane(table);
//        jsp.setBounds(0, 100, 900, 600);
//        add(jsp);
//        setSize(900, 700);
//        setLocation(300, 100);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new ViewTable();
//    }
//
//    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
//        ResultSetMetaData metaData = rs.getMetaData();
//
//        int columnCount = metaData.getColumnCount();
//        Vector<String> columnNames = new Vector<>();
//        for (int column = 1; column <= columnCount; column++) {
//            columnNames.add(metaData.getColumnName(column));
//        }
//
//        Vector<Vector<Object>> data = new Vector<>();
//        while (rs.next()) {
//            Vector<Object> vector = new Vector<>();
//            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
//                vector.add(rs.getObject(columnIndex));
//            }
//            data.add(vector);
//        }
//
//        return new DefaultTableModel(data, columnNames);
//    }
//}
