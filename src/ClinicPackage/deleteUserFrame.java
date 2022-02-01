/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicPackage;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class deleteUserFrame extends javax.swing.JFrame {

    PreparedStatement pst;
    ResultSet rs;
    Connection con;

    /**
     * Creates new form updatePatientFrame
     */
    public deleteUserFrame() {
        initComponents();
        fetch();
        // CODE THAT MAKES THE CELLS UNEDITABLE
        user_table.setDefaultEditor(Object.class, null);
    }

    //updates the table
    private void updateTable() {
        Connection con;
        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();
        String query = "select * from patient_info";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            user_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(deleteUserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fetch() {
        Connection con;

        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();
        try {
            String query = "select user_ID as 'User ID', last_name as 'Last Name', first_name as 'First Name', username as 'Username', birth_date as 'Birthdate', age as 'Age', contact_number as 'Contact Number', role as 'Role', address as 'Address' from user_info";
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            user_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(deleteUserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFirstName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textPhoneNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textAge = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        birthDate = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        textUsername = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        comboRole = new rojerusan.RSComboMetro();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        searchField = new app.bolivia.swing.JCTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        user_table = new rojerusan.RSTableMetro();
        jButton4 = new javax.swing.JButton();
        textUserID = new javax.swing.JLabel();
        btnAddRec1 = new rojerusan.RSMaterialButtonCircle();
        clearButton1 = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Patient Record");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(38, 133, 187)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(38, 133, 187));
        jLabel1.setText("DELETE USER RECORD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 179, 68));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 780, 3));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(38, 133, 187));
        jLabel3.setText("Last Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        textLastName.setEditable(false);
        textLastName.setBackground(new java.awt.Color(255, 255, 255));
        textLastName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textLastName.setForeground(new java.awt.Color(51, 51, 51));
        textLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 133, 187), 1, true));
        textLastName.setOpaque(false);
        jPanel1.add(textLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(38, 133, 187));
        jLabel4.setText("First Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        textFirstName.setEditable(false);
        textFirstName.setBackground(new java.awt.Color(255, 255, 255));
        textFirstName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textFirstName.setForeground(new java.awt.Color(51, 51, 51));
        textFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 133, 187), 1, true));
        textFirstName.setOpaque(false);
        jPanel1.add(textFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 210, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(38, 133, 187));
        jLabel9.setText("Role:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, 30));

        textPhoneNo.setEditable(false);
        textPhoneNo.setBackground(new java.awt.Color(255, 255, 255));
        textPhoneNo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textPhoneNo.setForeground(new java.awt.Color(51, 51, 51));
        textPhoneNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 133, 187), 1, true));
        textPhoneNo.setOpaque(false);
        jPanel1.add(textPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 240, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 133, 187));
        jLabel5.setText("Address:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 30));

        textAddress.setEditable(false);
        textAddress.setBackground(new java.awt.Color(255, 255, 255));
        textAddress.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textAddress.setForeground(new java.awt.Color(51, 51, 51));
        textAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 133, 187), 1, true));
        textAddress.setOpaque(false);
        jPanel1.add(textAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 480, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(38, 133, 187));
        jLabel7.setText("Date of Birth:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(38, 133, 187));
        jLabel10.setText("Age:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 50, 40));

        textAge.setEditable(false);
        textAge.setBackground(new java.awt.Color(255, 255, 255));
        textAge.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textAge.setForeground(new java.awt.Color(51, 51, 51));
        textAge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 133, 187), 1, true));
        textAge.setOpaque(false);
        textAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAgeActionPerformed(evt);
            }
        });
        jPanel1.add(textAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 40, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(38, 133, 187));
        jLabel22.setText("User ID:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        birthDate.setDateFormatString("dd/MM/yyyy");
        birthDate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        birthDate.setOpaque(false);
        birthDate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                birthDateAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        birthDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birthDateMouseClicked(evt);
            }
        });
        birthDate.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                birthDateInputMethodTextChanged(evt);
            }
        });
        birthDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                birthDatePropertyChange(evt);
            }
        });
        jPanel1.add(birthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 250, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(38, 133, 187));
        jLabel15.setText("Username:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        textUsername.setEditable(false);
        textUsername.setBackground(new java.awt.Color(255, 255, 255));
        textUsername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textUsername.setForeground(new java.awt.Color(51, 51, 51));
        textUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 133, 187), 1, true));
        textUsername.setOpaque(false);
        jPanel1.add(textUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 210, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(38, 133, 187));
        jLabel20.setText("Phone Number:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, 30));

        comboRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Secretary", "Admin" }));
        comboRole.setColorArrow(new java.awt.Color(38, 133, 187));
        comboRole.setColorBorde(new java.awt.Color(38, 133, 187));
        comboRole.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(comboRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 240, 40));

        rSMaterialButtonRectangle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/1086667_deals_examine_form_list_records_icon.png"))); // NOI18N
        rSMaterialButtonRectangle2.setText("REFRESH");
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 120, 50));

        searchField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(38, 133, 187)));
        searchField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        searchField.setOpaque(false);
        searchField.setPlaceholder("Enter Last Name...");
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 240, 50));

        user_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "Last Name", "First Name", "Username", "Date of Birth", "Age", "Contact Number", "Role", "Address"
            }
        ));
        user_table.setColorBordeFilas(new java.awt.Color(38, 133, 187));
        user_table.setColorBordeHead(new java.awt.Color(38, 133, 187));
        user_table.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        user_table.setRowHeight(25);
        user_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_tableMouseClicked(evt);
            }
        });
        user_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                user_tableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(user_table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 1080, 280));

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/close.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 50, 40));

        textUserID.setBackground(new java.awt.Color(51, 51, 51));
        textUserID.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        textUserID.setForeground(new java.awt.Color(51, 255, 0));
        jPanel1.add(textUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 170, 30));

        btnAddRec1.setBackground(new java.awt.Color(0, 166, 89));
        btnAddRec1.setBorder(null);
        btnAddRec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/103765_close_user_settings_icon (1).png"))); // NOI18N
        btnAddRec1.setText("DELETE");
        btnAddRec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRec1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddRec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 160, 60));

        clearButton1.setBackground(new java.awt.Color(255, 0, 51));
        clearButton1.setBorder(null);
        clearButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/103765_close_user_settings_icon (1).png"))); // NOI18N
        clearButton1.setText("clear");
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(clearButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 150, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAgeActionPerformed

    private void birthDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_birthDateAncestorAdded

    }//GEN-LAST:event_birthDateAncestorAdded

    private void birthDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birthDateMouseClicked

    }//GEN-LAST:event_birthDateMouseClicked

    private void birthDateInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_birthDateInputMethodTextChanged

    }//GEN-LAST:event_birthDateInputMethodTextChanged

    private void birthDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_birthDatePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_birthDatePropertyChange

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        fetch();
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        //search function
        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();

        //        int row = patient_table.getSelectedRow();
        //        DefaultTableModel model = (DefaultTableModel) patient_table.getModel();
        //        String id = (String) model.getValueAt(row, 0);
        //   String query = "select * from patient_info where patient_ID = '" + id + "'";
        String search = searchField.getText().toString();

        String query = "select user_ID as 'User ID', last_name as 'Last Name', first_name as 'First Name', username as 'Username', birth_date as 'Birthdate', age as 'Age', contact_number as 'Contact Number', role as 'Role', address as 'Address' from user_info where user_ID= " + search;
        String query2 = "select user_ID as 'User ID', last_name as 'Last Name', first_name as 'First Name', username as 'Username', birth_date as 'Birthdate', age as 'Age', contact_number as 'Contact Number', role as 'Role', address as 'Address' from user_info where last_name like '%" + search + "%'";

        //String query3 = "select * from patient_info where patient_firstname like '%" + search + "%'";
        try {
            if (search.matches("CS")) {
                //            if (search.matches("^[0-9]+$")) {

                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                user_table.setModel(DbUtils.resultSetToTableModel(rs));

            } else {

                pst = con.prepareStatement(query2);
                rs = pst.executeQuery();
                user_table.setModel(DbUtils.resultSetToTableModel(rs));
            }
            //
            //            String query4 = "select * from user_info where last_name=?";
            //            pst = con.prepareStatement(query4);
            //            pst.setString(1, searchField.getText());
            //            rs = pst.executeQuery();
            //            user_table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            Logger.getLogger(InternalFramePatientRec.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* Ignored */ }
            try {
                pst.close();
            } catch (Exception e) {
                /* Ignored */ }
            try {
                con.close();
            } catch (Exception e) {
                /* Ignored */ }
        }
    }//GEN-LAST:event_searchFieldKeyReleased

    private void user_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_tableMouseClicked
         //instantiating database connection
        Connection con;
        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();

        int row = user_table.getSelectedRow();
       // String selection = patient_table.getModel().getValueAt(row, 0).toString();
        DefaultTableModel model = (DefaultTableModel) user_table.getModel();
        String id = (String) model.getValueAt(row, 0);
        String query = "select * from user_info where user_ID = '" + id + "'";

        try {
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                textUserID.setText(rs.getString("user_ID"));
                textLastName.setText(rs.getString("last_name"));
                textFirstName.setText(rs.getString("first_name"));
                comboRole.setSelectedItem(rs.getString("role"));
                ((JTextField) birthDate.getDateEditor().getUiComponent()).setText(rs.getString("birth_date"));
                textAge.setText(rs.getString("age"));
                textPhoneNo.setText(rs.getString("contact_number"));
                textAddress.setText(rs.getString("address"));
                textUsername.setText(rs.getString("username"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(updatePatientFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* Ignored */ }
            try {
                pst.close();
            } catch (Exception e) {
                /* Ignored */ }
            try {
                con.close();
            } catch (Exception e) {
                /* Ignored */ }

        }
    }//GEN-LAST:event_user_tableMouseClicked

    private void user_tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_tableKeyReleased
            //instantiating database connection
        Connection con;
        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();

        int row = user_table.getSelectedRow();
       // String selection = patient_table.getModel().getValueAt(row, 0).toString();
        DefaultTableModel model = (DefaultTableModel) user_table.getModel();
        String id = (String) model.getValueAt(row, 0);
        String query = "select * from user_info where user_ID = '" + id + "'";

        try {
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                textUserID.setText(rs.getString("user_ID"));
                textLastName.setText(rs.getString("last_name"));
                textFirstName.setText(rs.getString("first_name"));
                comboRole.setSelectedItem(rs.getString("role"));
                ((JTextField) birthDate.getDateEditor().getUiComponent()).setText(rs.getString("birth_date"));
                textAge.setText(rs.getString("age"));
                textPhoneNo.setText(rs.getString("contact_number"));
                textAddress.setText(rs.getString("address"));
                textUsername.setText(rs.getString("username"));
          //      textPassword.setText(rs.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(updatePatientFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* Ignored */ }
            try {
                pst.close();
            } catch (Exception e) {
                /* Ignored */ }
            try {
                con.close();
            } catch (Exception e) {
                /* Ignored */ }

        }
    }//GEN-LAST:event_user_tableKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnAddRec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRec1ActionPerformed
         Connection con;

        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();

        //confirmation dialog message
        int msg = JOptionPane.showConfirmDialog(this, "Delete selected record?");
        String userID = textUserID.getText();

        String query = "delete from user_info where user_ID='" + userID + "'";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Record Deleted successfully");
            fetch();

            //clearing textfields after deletion of data
            textLastName.setText("");
            textFirstName.setText("");
            birthDate.setCalendar(null);
            textAge.setText("");
            textPhoneNo.setText("");
            textAddress.setText("");
            textUserID.setText("");
            textUsername.setText("");
           // textPassword.setText("");


        } catch (SQLException ex) {
            Logger.getLogger(deletePatientFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                /* Ignored */ }
            try {
                pst.close();
            } catch (Exception e) {
                /* Ignored */ }
            try {
                con.close();
            } catch (Exception e) {
                /* Ignored */ }

        }
    }//GEN-LAST:event_btnAddRec1ActionPerformed

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
         int msg = JOptionPane.showConfirmDialog(this, "Are you sure you want to clear all fields?", "Message", JOptionPane.WARNING_MESSAGE);

       if(msg == 0){
           textUserID.setText("");
           textLastName.setText("");
           textFirstName.setText("");
           textAge.setText("");
           textPhoneNo.setText("");
           textAddress.setText("");
           textUsername.setText("");
           birthDate.setCalendar(null);
       }
    }//GEN-LAST:event_clearButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(deleteUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteUserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser birthDate;
    private rojerusan.RSMaterialButtonCircle btnAddRec1;
    private rojerusan.RSMaterialButtonCircle clearButton1;
    private rojerusan.RSComboMetro comboRole;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private app.bolivia.swing.JCTextField searchField;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextField textAge;
    private javax.swing.JTextField textFirstName;
    private javax.swing.JTextField textLastName;
    private javax.swing.JTextField textPhoneNo;
    private javax.swing.JLabel textUserID;
    private javax.swing.JTextField textUsername;
    private rojerusan.RSTableMetro user_table;
    // End of variables declaration//GEN-END:variables
}
