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
        searchField = new app.bolivia.swing.JCTextField();
        jLabel20 = new javax.swing.JLabel();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        textPatientID1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Patient Record");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(38, 133, 187));
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        textLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 204, 255)));
        textLastName.setEnabled(false);
        textLastName.setOpaque(false);
        jPanel1.add(textLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(38, 133, 187));
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        textFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 204, 255)));
        textFirstName.setEnabled(false);
        textFirstName.setOpaque(false);
        jPanel1.add(textFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 210, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(38, 133, 187));
        jLabel9.setText("Phone Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, 30));

        textPhoneNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 204, 255)));
        textPhoneNo.setEnabled(false);
        textPhoneNo.setOpaque(false);
        jPanel1.add(textPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 230, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 133, 187));
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        textAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 204, 255)));
        textAddress.setEnabled(false);
        textAddress.setOpaque(false);
        jPanel1.add(textAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 350, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(38, 133, 187));
        jLabel7.setText("Date of Birth");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 100, 20));

        birthDate.setEnabled(false);
        jPanel1.add(birthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 230, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(38, 133, 187));
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, 30));

        comboGender.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        comboGender.setEnabled(false);
        jPanel1.add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 90, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(38, 133, 187));
        jLabel10.setText("Age");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, 40));

        textAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 204, 255)));
        textAge.setEnabled(false);
        textAge.setOpaque(false);
        textAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAgeActionPerformed(evt);
            }
        });
        jPanel1.add(textAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 40, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(38, 133, 187));
        jLabel6.setText("Prescription");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        textAreaPrescription.setColumns(20);
        textAreaPrescription.setRows(5);
        textAreaPrescription.setEnabled(false);
        textAreaPrescription.setOpaque(false);
        jScrollPane1.setViewportView(textAreaPrescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 330, 70));

        clearButton.setBackground(new java.awt.Color(255, 51, 51));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 100, 50));

        deleteButton.setBackground(new java.awt.Color(0, 153, 51));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 110, 50));

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
        patient_table.setColorBackgoundHead(new java.awt.Color(38, 133, 187));
        patient_table.setColorBordeFilas(new java.awt.Color(38, 133, 187));
        patient_table.setColorBordeHead(new java.awt.Color(38, 133, 187));
        patient_table.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 1260, 240));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(38, 133, 187));
        jLabel8.setText("Remarks:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        textAreaRemarks.setColumns(20);
        textAreaRemarks.setRows(5);
        textAreaRemarks.setEnabled(false);
        textAreaRemarks.setOpaque(false);
        jScrollPane2.setViewportView(textAreaRemarks);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 300, 70));

        jPanel3.setBackground(new java.awt.Color(0, 78, 103));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Father's Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(38, 133, 187))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(38, 133, 187));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(38, 133, 187));
        jLabel14.setText("Age");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, 30));

        textFatherFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 204, 255)));
        textFatherFirstName.setEnabled(false);
        textFatherFirstName.setOpaque(false);
        jPanel3.add(textFatherFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 150, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(38, 133, 187));
        jLabel16.setText("Phone Number");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(38, 133, 187));
        jLabel13.setText("First Name");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 30));

        textFatherAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 204, 255)));
        textFatherAge.setEnabled(false);
        textFatherAge.setOpaque(false);
        textFatherAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFatherAgeActionPerformed(evt);
            }
        });
        jPanel3.add(textFatherAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 40, 30));

        textFatherNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 204, 255)));
        textFatherNumber.setEnabled(false);
        textFatherNumber.setOpaque(false);
        jPanel3.add(textFatherNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 160, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(38, 133, 187));
        jLabel12.setText("Last Name");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 30));

        textFatherLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 204, 255)));
        textFatherLastName.setEnabled(false);
        textFatherLastName.setOpaque(false);
        jPanel3.add(textFatherLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 550, 120));

        jPanel4.setBackground(new java.awt.Color(0, 78, 103));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mother's Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(38, 133, 187))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(38, 133, 187));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(38, 133, 187));
        jLabel17.setText("Age");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, 30));

        textMotherFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 204, 255)));
        textMotherFirstName.setEnabled(false);
        textMotherFirstName.setOpaque(false);
        jPanel4.add(textMotherFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 150, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(38, 133, 187));
        jLabel18.setText("Phone Number");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(38, 133, 187));
        jLabel19.setText("First Name");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 30));

        textMotherAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 204, 255)));
        textMotherAge.setEnabled(false);
        textMotherAge.setOpaque(false);
        textMotherAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMotherAgeActionPerformed(evt);
            }
        });
        jPanel4.add(textMotherAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 40, 30));

        textMotherNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 204, 255)));
        textMotherNumber.setEnabled(false);
        textMotherNumber.setOpaque(false);
        jPanel4.add(textMotherNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 150, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(38, 133, 187));
        jLabel21.setText("Last Name");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 30));

        textMotherLname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 204, 255)));
        textMotherLname.setEnabled(false);
        textMotherLname.setOpaque(false);
        jPanel4.add(textMotherLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 190, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 550, 120));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(38, 133, 187));
        jLabel22.setText("Patient ID:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 40));

        searchField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(38, 133, 187)));
        searchField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        searchField.setOpaque(false);
        searchField.setPlaceholder("Enter Last Name");
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 220, 40));

        jLabel20.setBackground(new java.awt.Color(255, 0, 0));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/closeicon.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 40, 40));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(38, 133, 187));
        rSMaterialButtonRectangle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/1086667_deals_examine_form_list_records_icon.png"))); // NOI18N
        rSMaterialButtonRectangle2.setText("REFRESH");
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 100, 40));

        textPatientID1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textPatientID1.setForeground(new java.awt.Color(102, 255, 102));
        jPanel1.add(textPatientID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 140, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(38, 133, 187));
        jLabel1.setText("REMOVE PATIENT RECORD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 179, 68));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 400, 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        Connection con;

        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();

        //confirmation dialog message
        int msg = JOptionPane.showConfirmDialog(this, "Delete selected record?");
        String patientID = textPatientID1.getText();

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
                textPatientID1.setText(rs.getString("patient_ID"));
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
        DefaultTableModel model = (DefaultTableModel) patient_table.getModel();
        String id = (String) model.getValueAt(row, 0);
        String query = "select * from patient_info where patient_ID = '" + id + "'";

        try {
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                textPatientID1.setText(rs.getString("patient_ID"));
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

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // Terminate JVM
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        fetch();
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

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
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JButton deleteButton;
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
    private javax.swing.JLabel jLabel20;
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
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
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
    private javax.swing.JLabel textPatientID1;
    private javax.swing.JTextField textPhoneNo;
    // End of variables declaration//GEN-END:variables
}
