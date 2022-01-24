/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author andre
 */
public class internalFrameMedicine extends javax.swing.JInternalFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form internalFrameMedicine
     */
    public internalFrameMedicine() {
        initComponents();
        fetch();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    public void fetch() {
        Connection con;

        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();
        try {
            String query = "select medicine_no as 'Medicine ID', medicine_name as 'Name', medicine_price as 'Price', medicine_expiry as 'Expiry Date' from medicine_info";
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            medicine_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(updatePatientFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void updateTable() {
        Connection con;
        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();
        String query = "select * from medicine_info";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            medicine_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(updatePatientFrame.class.getName()).log(Level.SEVERE, null, ex);
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
        btnUpdateMedicine = new rojerusan.RSMaterialButtonRectangle();
        btnAddMedicine = new rojerusan.RSMaterialButtonRectangle();
        btnRemoveMedicine = new rojerusan.RSMaterialButtonRectangle();
        searchField = new app.bolivia.swing.JCTextField();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane2 = new javax.swing.JScrollPane();
        medicine_table = new rojerusan.RSTableMetro();

        setPreferredSize(new java.awt.Dimension(1070, 620));
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(38, 133, 187));
        jLabel1.setText("Medicine Management");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 610, 2));

        btnUpdateMedicine.setBackground(new java.awt.Color(38, 133, 187));
        btnUpdateMedicine.setText("UPDATE MEDICINE");
        btnUpdateMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMedicineActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 210, 70));

        btnAddMedicine.setBackground(new java.awt.Color(38, 133, 187));
        btnAddMedicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/1214628_calendar_date_day_event_month_icon.png"))); // NOI18N
        btnAddMedicine.setText("ADD MEDICINE");
        btnAddMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMedicineActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, 70));

        btnRemoveMedicine.setBackground(new java.awt.Color(38, 133, 187));
        btnRemoveMedicine.setText("REMOVE MEDICINE");
        btnRemoveMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveMedicineActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoveMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 210, 70));

        searchField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(38, 133, 187)));
        searchField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchField.setOpaque(false);
        searchField.setPlaceholder("Enter ID/Last Name");
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 300, 50));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(38, 133, 187));
        rSMaterialButtonRectangle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/1086667_deals_examine_form_list_records_icon.png"))); // NOI18N
        rSMaterialButtonRectangle2.setText("Refresh");
        rSMaterialButtonRectangle2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 120, 50));

        medicine_table.setModel(new javax.swing.table.DefaultTableModel(
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
        medicine_table.setColorBackgoundHead(new java.awt.Color(38, 133, 187));
        medicine_table.setColorBordeFilas(new java.awt.Color(38, 133, 187));
        medicine_table.setColorBordeHead(new java.awt.Color(38, 133, 187));
        medicine_table.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(medicine_table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicineActionPerformed
        AddMedicineFrame medicineFrame = new AddMedicineFrame();
        medicineFrame.setVisible(true);
        medicineFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAddMedicineActionPerformed


    private void btnRemoveMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveMedicineActionPerformed
        new RemoveMedicineFrame().setVisible(true);
    }//GEN-LAST:event_btnRemoveMedicineActionPerformed

    private void btnUpdateMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMedicineActionPerformed
        new UpdateMedicineFrame().setVisible(true);
    }//GEN-LAST:event_btnUpdateMedicineActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        //search function
        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();

        //        int row = patient_table.getSelectedRow();
        //        DefaultTableModel model = (DefaultTableModel) patient_table.getModel();
        //        String id = (String) model.getValueAt(row, 0);

        //   String query = "select * from patient_info where patient_ID = '" + id + "'";
        String search = searchField.getText();

        String query = "select medicine_no as 'Medicine ID', medicine_name as 'Name', medicine_price as 'Price', medicine_expiry as 'Expiry Date' from medicine_info where medicine_no= " + search;
        String query2 = "select medicine_no as 'Medicine ID', medicine_name as 'Name', medicine_price as 'Price', medicine_expiry as 'Expiry Date' from medicine_info where medicine_name like '%" + search + "%'";
        //String query3 = "select * from patient_info where patient_firstname like '%" + search + "%'";
        try {
            if (search.matches("^[0-9]+$")) {

                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                medicine_table.setModel(DbUtils.resultSetToTableModel(rs));

            } else if(search.isEmpty()){
                fetch();
            }
            else{

                pst = con.prepareStatement(query2);
                rs = pst.executeQuery();
                medicine_table.setModel(DbUtils.resultSetToTableModel(rs));
            }
            //            String query4 = "select * from patient_info where patient_lastname=?";
            //            pst = con.prepareStatement(query4);
            //            pst.setString(1, searchField.getText());
            //            rs = pst.executeQuery();
            //            medicine_table.setModel(DbUtils.resultSetToTableModel(rs));

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

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        fetch();
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnAddMedicine;
    private rojerusan.RSMaterialButtonRectangle btnRemoveMedicine;
    private rojerusan.RSMaterialButtonRectangle btnUpdateMedicine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSTableMetro medicine_table;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private app.bolivia.swing.JCTextField searchField;
    // End of variables declaration//GEN-END:variables
}
