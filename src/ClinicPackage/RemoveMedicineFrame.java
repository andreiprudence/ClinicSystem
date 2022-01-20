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
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author andre
 */
public class RemoveMedicineFrame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form AddMedicineFrame
     */
    public RemoveMedicineFrame() {
        initComponents();
        fetch();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        expiryDate = new com.toedter.calendar.JDateChooser();
        textMedicineName = new app.bolivia.swing.JCTextField();
        textMedicinePrice = new app.bolivia.swing.JCTextField();
        textMedID = new app.bolivia.swing.JCTextField();
        btnCancel = new javax.swing.JButton();
        btnDeleteRec = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicine_table = new rojerusan.RSTableMetro();
        searchField = new app.bolivia.swing.JCTextField();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 78, 103));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 530, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("REMOVE MEDICINE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 50));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Medicine ID: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Medicine Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Expiry:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Medicine Price:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        expiryDate.setEnabled(false);
        jPanel1.add(expiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 230, 30));

        textMedicineName.setEnabled(false);
        textMedicineName.setPlaceholder("Enter Name...");
        textMedicineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMedicineNameActionPerformed(evt);
            }
        });
        jPanel1.add(textMedicineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 230, -1));

        textMedicinePrice.setEnabled(false);
        textMedicinePrice.setPlaceholder("Enter Price...");
        jPanel1.add(textMedicinePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 230, -1));

        textMedID.setEnabled(false);
        textMedID.setPlaceholder("Enter ID...");
        jPanel1.add(textMedID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 230, -1));

        btnCancel.setBackground(new java.awt.Color(255, 0, 51));
        btnCancel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/330399_bad_cancel_clear_close_decline_icon.png"))); // NOI18N
        btnCancel.setText("Clear");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 120, 50));

        btnDeleteRec.setBackground(new java.awt.Color(0, 166, 89));
        btnDeleteRec.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDeleteRec.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/3336950_download_save_icon.png"))); // NOI18N
        btnDeleteRec.setText("DELETE");
        btnDeleteRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRecActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 130, 50));

        btnBack.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        btnBack.setText("X");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, 30));

        medicine_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name of Medicine", "Medicine No.", "Medicine Price"
            }
        ));
        medicine_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicine_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicine_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 470, 330));

        searchField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        searchField.setPlaceholder("Enter Name/ID...");
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textMedicineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMedicineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMedicineNameActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int msg = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all the records?");

        if (msg == 0) {
            // textIDNo.setText("");
            textMedicinePrice.setText("");
            textMedicineName.setText("");
            textMedID.setText("");
            expiryDate.setCalendar(null);

        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRecActionPerformed
        Connection con;

        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();

        //confirmation dialog message
        int msg = JOptionPane.showConfirmDialog(this, "Delete selected record?");
        String medicineID = textMedID.getText();
        String query = "delete from medicine_info where medicine_no='" + medicineID + "'";
        if (msg == JOptionPane.YES_OPTION) {
            try {
                PreparedStatement pst = con.prepareStatement(query);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Record Deleted successfully");
                updateTable();

                //clearing textfields after deletion of data
                textMedID.setText("");
                textMedicineName.setText("");
                expiryDate.setCalendar(null);
                textMedicinePrice.setText("");

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
    }//GEN-LAST:event_btnDeleteRecActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        //search function
        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();

        String search = searchField.getText();

        String query = "select * from medicine_info where medicine_no= " + search;
        String query2 = "select * from medicine_info where medicine_name like '%" + search + "%'";
        //String query3 = "select * from patient_info where patient_firstname like '%" + search + "%'";
        try {
            if (search.matches("^[0-9]+$")) {

                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                medicine_table.setModel(DbUtils.resultSetToTableModel(rs));

            } else {

                pst = con.prepareStatement(query2);
                rs = pst.executeQuery();
                medicine_table.setModel(DbUtils.resultSetToTableModel(rs));
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

    private void medicine_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicine_tableMouseClicked
        //instantiating database connection
        Connection con;
        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();

        int row = medicine_table.getSelectedRow();
        String selection = medicine_table.getModel().getValueAt(row, 0).toString();
        String query = "select * from medicine_info where medicine_no = " + selection;
        DefaultTableModel model = (DefaultTableModel) medicine_table.getModel();

        try {
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                textMedID.setText(rs.getString("medicine_no"));
                textMedicineName.setText(rs.getString("medicine_name"));
                textMedicinePrice.setText(rs.getString("medicine_price"));
                ((JTextField) expiryDate.getDateEditor().getUiComponent()).setText(rs.getString("medicine_expiry"));

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
    }//GEN-LAST:event_medicine_tableMouseClicked

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
            java.util.logging.Logger.getLogger(RemoveMedicineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveMedicineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveMedicineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveMedicineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveMedicineFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeleteRec;
    private com.toedter.calendar.JDateChooser expiryDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static rojerusan.RSTableMetro medicine_table;
    private app.bolivia.swing.JCTextField searchField;
    private app.bolivia.swing.JCTextField textMedID;
    private app.bolivia.swing.JCTextField textMedicineName;
    private app.bolivia.swing.JCTextField textMedicinePrice;
    // End of variables declaration//GEN-END:variables
}
