/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bank.management.system;

//import javax.swing.JFrame;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.lang.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;



public class JTable1 extends javax.swing.JFrame {

    private static final String username ="root";
    private static final String password ="adhish@mysql";
    private static final String dataConn ="jdbc:mysql://localhost:3306/modern_inventory";
    
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int q,i, id, deleteitem;
    Date date = new Date();
    
    JTable table;
    String f_id;
   


//    String formno;
    
    public JTable1(String f_id) {
        initComponents();
        
        this.f_id = f_id;
        fact_num.setText(f_id);
        upDateDB();
        
    }
    
    
    //======================================Function==============================================//
    
    public void upDateDB()
    {
     if ("admin123".equals(f_id))
     {   
        try
        {
            conn c = new conn();
            rs = c.s.executeQuery("Select * from inventory");
            System.out.print("Hello1");
//            table.setModel(DbUtils.resultSetToTableModel(rs));
            java.sql.ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();
            System.out.println(q);
            System.out.println(q);
            System.out.println(q);
                    
            DefaultTableModel RecordTable = (DefaultTableModel)jTable.getModel();
            RecordTable.setRowCount(0);
            while(rs.next())
            {
                Vector columnData = new Vector();
                
                for(i=1; i<=q; i++)
                {
                    columnData.add(rs.getString("iCategory"));
                    columnData.add(rs.getString("product_number"));
                    columnData.add(rs.getString("company"));
                    columnData.add(rs.getString("cost"));
                    columnData.add(rs.getString("status"));
                    columnData.add(rs.getString("seller_name"));
                    columnData.add(rs.getString("inCharge_name"));
                    columnData.add(rs.getString("DateofEntry"));
                    columnData.add(rs.getString("days"));
//                    columnData.add(rs.getShort(""));
                }
                RecordTable.addRow(columnData);
            }

        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            System.out.print("Hello2");
            
        }
     }
     else
     {
         try
            {
//               String s_id=fact_num.getText();
                conn c = new conn();
                rs = c.s.executeQuery("Select * from inventory,facreg where inventory.inCharge_name=facreg.name AND facreg.idnumber='"+f_id+"'");
                System.out.print("Hello1");
    //            table.setModel(DbUtils.resultSetToTableModel(rs));
                java.sql.ResultSetMetaData stData = rs.getMetaData();

                q = stData.getColumnCount();
                System.out.println(q);
                System.out.println(q);
                System.out.println(q);

                DefaultTableModel RecordTable = (DefaultTableModel)jTable.getModel();
                RecordTable.setRowCount(0);
                while(rs.next())
                {
                    Vector columnData = new Vector();

                    for(i=1; i<=q; i++)
                    {
                        columnData.add(rs.getString("iCategory"));
                        columnData.add(rs.getString("product_number"));
                        columnData.add(rs.getString("company"));
                        columnData.add(rs.getString("cost"));
                        columnData.add(rs.getString("status"));
                        columnData.add(rs.getString("seller_name"));
                        columnData.add(rs.getString("inCharge_name"));
                        columnData.add(rs.getString("DateofEntry"));
                        columnData.add(rs.getString("days"));
    //                    columnData.add(rs.getShort(""));
                    }
                    RecordTable.addRow(columnData);
                }
           
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex);
                System.out.print("Hello2");

            }
     }
        
    }
    
    
    
    
    //======================================End - Function==============================================//
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BnewEntry = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();
        Brest = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        Blogin = new javax.swing.JButton();
        Bexit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        title_seller = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Dcost = new javax.swing.JTextField();
        Dcat = new javax.swing.JTextField();
        Dstatus = new javax.swing.JTextField();
        Dcompname = new javax.swing.JTextField();
        Ddate = new javax.swing.JLabel();
        Ddays = new javax.swing.JTextField();
        dseller = new javax.swing.JTextField();
        Dno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Dincharge = new javax.swing.JTextField();
        DDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        fact_num = new javax.swing.JTextField();
        fact_go = new javax.swing.JToggleButton();
        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1900, 800, 220, 480));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BnewEntry.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BnewEntry.setText("New Entry");
        BnewEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnewEntryActionPerformed(evt);
            }
        });
        jPanel3.add(BnewEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, 130, 50));

        Bupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Bupdate.setText("Update");
        Bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BupdateActionPerformed(evt);
            }
        });
        jPanel3.add(Bupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 90, 130, 50));

        Brest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Brest.setText("Reset");
        Brest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrestActionPerformed(evt);
            }
        });
        jPanel3.add(Brest, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, 130, 50));

        Bdelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Bdelete.setText("Delete");
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });
        jPanel3.add(Bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 230, 130, 50));

        Blogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Blogin.setText("New Login");
        Blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloginActionPerformed(evt);
            }
        });
        jPanel3.add(Blogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 300, 130, 50));

        Bexit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Bexit.setText("Exit");
        Bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BexitActionPerformed(evt);
            }
        });
        jPanel3.add(Bexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 370, 130, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 250, 160, 440));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, new java.awt.Color(0, 0, 255), java.awt.Color.red));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Progressive Education Society's ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Modern College Of Engineering");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Department Of Computer Engineering");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(450, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(466, 466, 466))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(406, 406, 406))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1450, 150));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 7, 114, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Inventory Category:");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 17, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Company Name:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Prod_No. :");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 17, 102, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Status:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 81, 32));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("How Old Inventorry Is:");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 70, -1, -1));

        title_seller.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title_seller.setText("Seller Name:");
        jPanel6.add(title_seller, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 100, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Entry Date: ");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 17, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Cost:");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 93, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Incharge name:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 177, -1, -1));
        jPanel6.add(Dcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 250, 30));
        jPanel6.add(Dcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 250, 30));

        Dstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DstatusActionPerformed(evt);
            }
        });
        jPanel6.add(Dstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 250, 30));
        jPanel6.add(Dcompname, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 60, 250, 30));
        jPanel6.add(Ddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, 13, 175, -1));
        jPanel6.add(Ddays, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 250, 30));
        jPanel6.add(dseller, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 250, 30));
        jPanel6.add(Dno, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 250, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Incharge Name:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, -1, -1));
        jPanel6.add(Dincharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 110, 250, 30));
        jPanel6.add(DDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 250, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1240, 170));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Incharge Faculty No.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 160, 130, 40));

        fact_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fact_numActionPerformed(evt);
            }
        });
        jPanel1.add(fact_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 190, 120, -1));

        fact_go.setText("Sort");
        fact_go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fact_goActionPerformed(evt);
            }
        });
        jPanel1.add(fact_go, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 220, -1, -1));

        jToolBar1.setRollover(true);
        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, -1, -1));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Category", "Pro_No", "Company", "Cost", "Status", "Seller_Name", "Incharge_Name", "Date", "Days"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1240, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1500, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
         try
            {
                String Scat = Dcat.getText();
                String Sno = ""+ Dno.getText();
                String Scomp = Dcompname.getText();
                String Scost = ""+ Dcost.getText();
                String Sstatus =Dstatus.getText();
                String Sseller = dseller.getText();
                String Sincharge = Dincharge.getText();
                String Sdob = ((JTextField) DDateChooser.getDateEditor().getUiComponent()).getText(); 
  
                String Sdays = "NA";//
                
                conn c = new conn();
                String query = ("delete from inventory where product_number='"+Sno+"'");
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(this, "Record Deleted");
//                upDateDB();
                Dcat.setText("");
                Dcompname.setText("");
                Dcost.setText("");
                DDateChooser.setDate(date);
                Ddays.setText("");
                Dno.setText("");
                dseller.setText("");
                Dstatus.setText("");
                Dincharge.setText("");
                upDateDB();
            }
            
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_BdeleteActionPerformed

    private void fact_goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fact_goActionPerformed
        if ("admin123".equals(f_id))
        {
            try
            {
               String s_id=fact_num.getText();
                conn c = new conn();
                rs = c.s.executeQuery("Select * from inventory,facreg where inventory.inCharge_name=facreg.name AND facreg.idnumber='"+s_id+"'");
                System.out.print("Hello1");
    //            table.setModel(DbUtils.resultSetToTableModel(rs));
                java.sql.ResultSetMetaData stData = rs.getMetaData();

                q = stData.getColumnCount();
                System.out.println(q);
                System.out.println(q);
                System.out.println(q);

                DefaultTableModel RecordTable = (DefaultTableModel)jTable.getModel();
                RecordTable.setRowCount(0);
                while(rs.next())
                {
                    Vector columnData = new Vector();

                    for(i=1; i<=q; i++)
                    {
                        columnData.add(rs.getString("iCategory"));
                        columnData.add(rs.getString("product_number"));
                        columnData.add(rs.getString("company"));
                        columnData.add(rs.getString("cost"));
                        columnData.add(rs.getString("status"));
                        columnData.add(rs.getString("seller_name"));
                        columnData.add(rs.getString("inCharge_name"));
                        columnData.add(rs.getString("DateofEntry"));
                        columnData.add(rs.getString("days"));
    //                    columnData.add(rs.getShort(""));
                    }
                    RecordTable.addRow(columnData);
                }
            JOptionPane.showMessageDialog(this,"Sorted for: " +s_id);

            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex);
                System.out.print("Hello2");

            }
        }   
        else
        {
            JOptionPane.showMessageDialog(this,"You are Not Admin");
            
        }
    }//GEN-LAST:event_fact_goActionPerformed

    private void DstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DstatusActionPerformed
private JFrame frame;
    private void BexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BexitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if You want to Exit!!","Inventory System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0); 
        }
    }//GEN-LAST:event_BexitActionPerformed

    private void BrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrestActionPerformed
        Dcat.setText("");
        Dcompname.setText("");
        Dcost.setText("");
        DDateChooser.setDate(date);
        Ddays.setText("");
        Dno.setText("");
        dseller.setText("");
        Dstatus.setText("");
        Dincharge.setText("");
        
        
    }//GEN-LAST:event_BrestActionPerformed

    private void BnewEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnewEntryActionPerformed
            
            try
            {
                String Scat = Dcat.getText();
                String Sno = ""+ Dno.getText();
                String Scomp = Dcompname.getText();
                String Scost = ""+ Dcost.getText();
                String Sstatus =Dstatus.getText();
                String Sseller = dseller.getText();
                String Sincharge = Dincharge.getText();
                String Sdob = ((JTextField) DDateChooser.getDateEditor().getUiComponent()).getText(); 
  
                String Sdays = "NA";
                
                conn c = new conn();
                String query = "insert into inventory values ('" +Scat+"' , '"+Sno+"', '"+Scomp+"', '"+Scost+"', '"+Sstatus+"','"+Sseller+"','"+Sincharge+"','"+Sdob+"','"+Sdays+"')";
                c.s.executeUpdate(query);
//                Class.forName("com.mysql.jdbc.Diver");
//                sqlConn = DriverManager.getConnection(dataConn, username, password);
//                pst= sqlConn.prepareStatement("insert into inventory (iCateogry,product_name,company,cost,status,seller_name,incharge_name)");
//                
//                pst.setString(1,Dcat.getText());
//                pst.setString(2,Dno.getText());
//                pst.setString(3,Dcompname.getText());
//                pst.setString(4,Dcost.getText());
//                pst.setString(5,Dstatus.getText());
//                pst.setString(6,dseller.getText());
//                pst.setString(7,Dincharge.getText());
//                
//                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Added");
//                upDateDB();
                Dcat.setText("");
                Dcompname.setText("");
                Dcost.setText("");
                DDateChooser.setDate(date);
                Ddays.setText("");
                Dno.setText("");
                dseller.setText("");
                Dstatus.setText("");
                Dincharge.setText("");
            }
            
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_BnewEntryActionPerformed

    private void BupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BupdateActionPerformed
        try
            {
                String Scat = Dcat.getText();
                String Sno = ""+ Dno.getText();
                String Scomp = Dcompname.getText();
                String Scost = ""+ Dcost.getText();
                String Sstatus =Dstatus.getText();
                String Sseller = dseller.getText();
                String Sincharge = Dincharge.getText();
                String Sdob = ((JTextField) DDateChooser.getDateEditor().getUiComponent()).getText(); 
  
                String Sdays = "NA";//
                
                conn c = new conn();
                String query = ("update inventory set iCategory= '" +Scat+"',product_number='" +Sno+"', company= '" +Scomp+"', cost='" +Scost+"',status= '" +Sstatus+"',seller_name = '" +Sseller+"',inCharge_name= '" +Sincharge+"' ,DateofEntry = '" +Sdob+"',days = '" +Sdays+"' where product_number='" +Sno+"';");
                c.s.executeUpdate(query);
//                Class.forName("com.mysql.jdbc.Diver");
//                sqlConn = DriverManager.getConnection(dataConn, username, password);
//                pst= sqlConn.prepareStatement("insert into inventory (iCateogry,product_name,company,cost,status,seller_name,incharge_name)");
//                
//                pst.setString(1,Dcat.getText());
//                pst.setString(2,Dno.getText());
//                pst.setString(3,Dcompname.getText());
//                pst.setString(4,Dcost.getText());
//                pst.setString(5,Dstatus.getText());
//                pst.setString(6,dseller.getText());
//                pst.setString(7,Dincharge.getText());
//                
//                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Updated Record");
//                upDateDB();
                Dcat.setText("");
                Dcompname.setText("");
                Dcost.setText("");
                DDateChooser.setDate(date);
                Ddays.setText("");
                Dno.setText("");
                dseller.setText("");
                Dstatus.setText("");
                Dincharge.setText("");
                upDateDB();
            }
            
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_BupdateActionPerformed

    private void fact_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fact_numActionPerformed
        fact_num.setText("13");
    }//GEN-LAST:event_fact_numActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)jTable.getModel();
        int SelectedRows = jTable.getSelectedRow();
        
        Dcat.setText(RecordTable.getValueAt(SelectedRows,0).toString());
        
        Dcompname.setText(RecordTable.getValueAt(SelectedRows,2).toString());
        Dcost.setText(RecordTable.getValueAt(SelectedRows,3).toString());
//        DDateChooser.setText(RecordTable.getValueAt(SelectedRows,1).toString());
        Ddays.setText(RecordTable.getValueAt(SelectedRows,8).toString());
        Dno.setText(RecordTable.getValueAt(SelectedRows,1).toString());
        dseller.setText(RecordTable.getValueAt(SelectedRows,5).toString());
        Dstatus.setText(RecordTable.getValueAt(SelectedRows,4).toString());
        Dincharge.setText(RecordTable.getValueAt(SelectedRows,6).toString());
        
        
        
    }//GEN-LAST:event_jTableMouseClicked

    private void BloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloginActionPerformed
        JOptionPane.showMessageDialog(this, "Login Closed");
           setVisible(false);
           new Login().setVisible(true);
    }//GEN-LAST:event_BloginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTable1("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Bexit;
    private javax.swing.JButton Blogin;
    private javax.swing.JButton BnewEntry;
    private javax.swing.JButton Brest;
    private javax.swing.JButton Bupdate;
    private com.toedter.calendar.JDateChooser DDateChooser;
    private javax.swing.JTextField Dcat;
    private javax.swing.JTextField Dcompname;
    private javax.swing.JTextField Dcost;
    private javax.swing.JLabel Ddate;
    private javax.swing.JTextField Ddays;
    private javax.swing.JTextField Dincharge;
    private javax.swing.JTextField Dno;
    private javax.swing.JTextField Dstatus;
    private javax.swing.JTextField dseller;
    private javax.swing.JToggleButton fact_go;
    private javax.swing.JTextField fact_num;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel title_seller;
    // End of variables declaration//GEN-END:variables
}
