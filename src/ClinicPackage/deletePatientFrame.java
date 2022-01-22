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
public class deletePatientFrame extends javax.swing.JFrame {

    PreparedStatement pst;
    ResultSet rs;
    Connection con;

    /**
     * Creates new form updatePatientFrame
     */
    public deletePatientFrame() {
        initComponents();
        fetch();
        // CODE THAT MAKES THE CELLS UNEDITABLE
        patient_table.setDefaultEditor(Object.class, null);
    }

    private void updateTable() {
        Connection con;
        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();
        String query = "select * from patient_info";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            patient_table.setModel(DbUtils.resultSetToTableModel(rs));
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
    }

    public void fetch() {
        Connection con;

        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();
        try {
            String query = "select * from patient_info";
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            patient_table.setModel(DbUtils.resultSetToTableModel(rs));
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
        birthDate = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        comboGender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        textAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaPrescription = new javax.swing.JTextArea();
        btnSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        patient_table = new rojerusan.RSTableMetro();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaRemarks = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        textFatherFirstName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textFatherAge = new javax.swing.JTextField();
        textFatherNumber = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textFatherLastName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        textMotherFirstName = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        textMotherAge = new javax.swing.JTextField();
        textMotherNumber = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        textMotherLname = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        textPatientID = new javax.swing.JTextField();
        searchField = new app.bolivia.swing.JCTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Patient Record");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 78, 103));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delete Patient Record");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 179, 68));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 660, 10));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        textLastName.setEnabled(false);
        jPanel1.add(textLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 210, 30));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        textFirstName.setEnabled(false);
        jPanel1.add(textFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 210, 30));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, 30));

        textPhoneNo.setEnabled(false);
        jPanel1.add(textPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 230, 30));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, 30));

        textAddress.setEnabled(false);
        jPanel1.add(textAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 290, 30));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date of Birth");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, 20));

        birthDate.setEnabled(false);
        jPanel1.add(birthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 200, 30));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        comboGender.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        comboGender.setEnabled(false);
        jPanel1.add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 90, 30));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Age");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, 40));

        textAge.setEnabled(false);
        textAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAgeActionPerformed(evt);
            }
        });
        jPanel1.add(textAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 40, 30));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prescription");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        textAreaPrescription.setColumns(20);
        textAreaPrescription.setRows(5);
        textAreaPrescription.setEnabled(false);
        jScrollPane1.setViewportView(textAreaPrescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 330, 60));

        btnSearch.setText("Search");
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 90, 40));

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 60, 30));

        clearButton.setBackground(new java.awt.Color(255, 51, 51));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 100, 50));

        deleteButton.setBackground(new java.awt.Color(0, 153, 51));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 110, 50));

        patient_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient ID", "Title 2", "Title 3", "Title 4"
            }
        ));
        patient_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        patient_table.setRowHeight(20);
        patient_table.setRowMargin(2);
        patient_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patient_tableMouseClicked(evt);
            }
        });
        patient_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                patient_tableKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(patient_table);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 1270, 280));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Remarks:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        textAreaRemarks.setColumns(20);
        textAreaRemarks.setRows(5);
        textAreaRemarks.setEnabled(false);
        jScrollPane2.setViewportView(textAreaRemarks);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 300, 60));

        jPanel3.setBackground(new java.awt.Color(0, 78, 103));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Father's Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Age");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, 30));

        textFatherFirstName.setEnabled(false);
        jPanel3.add(textFatherFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 150, 30));

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Phone Number");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 30));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("First Name");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 30));

        textFatherAge.setEnabled(false);
        textFatherAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFatherAgeActionPerformed(evt);
            }
        });
        jPanel3.add(textFatherAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 40, 30));

        textFatherNumber.setEnabled(false);
        jPanel3.add(textFatherNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 160, 30));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Last Name");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 30));

        textFatherLastName.setEnabled(false);
        jPanel3.add(textFatherLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 170, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 550, 120));

        jPanel4.setBackground(new java.awt.Color(0, 78, 103));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mother's Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Age");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, 30));

        textMotherFirstName.setEnabled(false);
        jPanel4.add(textMotherFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 150, 30));

        jLabel18.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Phone Number");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 30));

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("First Name");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 30));

        textMotherAge.setEnabled(false);
        textMotherAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMotherAgeActionPerformed(evt);
            }
        });
        jPanel4.add(textMotherAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 40, 30));

        textMotherNumber.setEnabled(false);
        jPanel4.add(textMotherNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 160, 30));

        jLabel21.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Last Name");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 30));

        textMotherLname.setEnabled(false);
        jPanel4.add(textMotherLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 170, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 550, 120));

        jLabel22.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Patient ID:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        textPatientID.setEnabled(false);
        jPanel1.add(textPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 120, 30));

        searchField.setPlaceholder("Enter ID/Last Name");
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1314, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        Connection con;

        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();

        //confirmation dialog message
        int msg = JOptionPane.showConfirmDialog(this, "Delete selected record?");
        String patientID = textPatientID.getText();

        String query = "delete from patient_info where patient_ID='" + patientID + "'";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Record Deleted successfully");
            updateTable();

            //clearing textfields after deletion of data
            textLastName.setText("");
            textFirstName.setText("");
            birthDate.setCalendar(null);
            textAge.setText("");
            textPhoneNo.setText("");
            textAddress.setText("");
            textMotherLname.setText("");
            textMotherFirstName.setText("");
            textMotherAge.setText("");
            textMotherNumber.setText("");
            textFatherLastName.setText("");
            textFatherFirstName.setText("");
            textFatherAge.setText("");
            textFatherNumber.setText("");
            textAreaRemarks.setText("");
            textAreaPrescription.setText("");

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
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void textAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAgeActionPerformed

    private void textFatherAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFatherAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFatherAgeActionPerformed

    private void textMotherAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMotherAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMotherAgeActionPerformed

    private void patient_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patient_tableMouseClicked
        //instantiating database connection
        Connection con;
        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();

        int row = patient_table.getSelectedRow();
        String selection = patient_table.getModel().getValueAt(row, 0).toString();
        DefaultTableModel model = (DefaultTableModel) patient_table.getModel();
        String id = (String) model.getValueAt(row, 0);
        String query = "select * from patient_info where patient_ID = '"+id+"'";

        try {
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                textPatientID.setText(rs.getString("patient_ID"));
                textLastName.setText(rs.getString("patient_lastname"));
                textFirstName.setText(rs.getString("patient_firstname"));
                comboGender.setSelectedItem(rs.getString("patient_gender"));
                ((JTextField) birthDate.getDateEditor().getUiComponent()).setText(rs.getString("patient_DOB"));
                textAge.setText(rs.getString("patient_age"));
                textPhoneNo.setText(rs.getString("patient_contactno"));
                textAddress.setText(rs.getString("patient_address"));
                textMotherLname.setText(rs.getString("mother_lastname"));
                textMotherFirstName.setText(rs.getString("mother_firstname"));
                textMotherAge.setText(rs.getString("mother_age"));
                textMotherNumber.setText(rs.getString("mother_contactno"));
                textFatherLastName.setText(rs.getString("father_lastname"));
                textFatherFirstName.setText(rs.getString("father_firstname"));
                textFatherAge.setText(rs.getString("father_age"));
                textFatherNumber.setText(rs.getString("father_contactno"));
                textAreaRemarks.setText(rs.getString("remarks"));
                textAreaPrescription.setText(rs.getString("prescription"));
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
    }//GEN-LAST:event_patient_tableMouseClicked

    private void patient_tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patient_tableKeyReleased
        //instantiating database connection
        Connection con;
        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();

        int row = patient_table.getSelectedRow();
        String selection = patient_table.getModel().getValueAt(row, 0).toString();
        String query = "select * from patient_info where patient_ID = " + selection;
        DefaultTableModel d1 = (DefaultTableModel) patient_table.getModel();

        try {
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                textPatientID.setText(rs.getString("patient_ID"));
                textLastName.setText(rs.getString("patient_lastname"));
                textFirstName.setText(rs.getString("patient_firstname"));
                comboGender.setSelectedItem(rs.getString("patient_gender"));
                ((JTextField) birthDate.getDateEditor().getUiComponent()).setText(rs.getString("patient_DOB"));
                textAge.setText(rs.getString("patient_age"));
                textPhoneNo.setText(rs.getString("patient_contactno"));
                textAddress.setText(rs.getString("patient_address"));
                textMotherLname.setText(rs.getString("mother_lastname"));
                textMotherFirstName.setText(rs.getString("mother_firstname"));
                textMotherAge.setText(rs.getString("mother_age"));
                textMotherNumber.setText(rs.getString("mother_contactno"));
                textFatherLastName.setText(rs.getString("father_lastname"));
                textFatherFirstName.setText(rs.getString("father_firstname"));
                textFatherAge.setText(rs.getString("father_age"));
                textFatherNumber.setText(rs.getString("father_contactno"));
                textAreaRemarks.setText(rs.getString("remarks"));
                textAreaPrescription.setText(rs.getString("prescription"));
            }
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
    }//GEN-LAST:event_patient_tableKeyReleased

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        //search function
        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();

        String search = searchField.getText();

        String query = "select * from patient_info where patient_ID= " + search;
        String query2 = "select * from patient_info where patient_lastname like '%" + search + "%'";
        //String query3 = "select * from patient_info where patient_firstname like '%" + search + "%'";
        try {
            if (search.matches("^[0-9]+$")) {

                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                patient_table.setModel(DbUtils.resultSetToTableModel(rs));

            } else {

                pst = con.prepareStatement(query2);
                rs = pst.executeQuery();
                patient_table.setModel(DbUtils.resultSetToTableModel(rs));
            }
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
            java.util.logging.Logger.getLogger(deletePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deletePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deletePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deletePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletePatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser birthDate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private rojerusan.RSTableMetro patient_table;
    private app.bolivia.swing.JCTextField searchField;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextField textAge;
    private javax.swing.JTextArea textAreaPrescription;
    private javax.swing.JTextArea textAreaRemarks;
    private javax.swing.JTextField textFatherAge;
    private javax.swing.JTextField textFatherFirstName;
    private javax.swing.JTextField textFatherLastName;
    private javax.swing.JTextField textFatherNumber;
    private javax.swing.JTextField textFirstName;
    private javax.swing.JTextField textLastName;
    private javax.swing.JTextField textMotherAge;
    private javax.swing.JTextField textMotherFirstName;
    private javax.swing.JTextField textMotherLname;
    private javax.swing.JTextField textMotherNumber;
    private javax.swing.JTextField textPatientID;
    private javax.swing.JTextField textPhoneNo;
    // End of variables declaration//GEN-END:variables
}
