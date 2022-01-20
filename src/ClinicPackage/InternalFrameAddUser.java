/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicPackage;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;
//import java.sql.*;

/**
 *
 * @author andre
 */
public class InternalFrameAddUser extends javax.swing.JInternalFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;

    /**
     * Creates new form InternalFramePatientRec
     */
    public InternalFrameAddUser() {
        initComponents();
        InternalFrameBorder();
        autoID();
      //  GenerateID();
        /*   this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
            BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
            ui.setNorthPane(null);
            pack();
         */
    }

    // This method removes the border of the InternalFrame
    void InternalFrameBorder() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        pack();
    }

    // Function to auto generate ID for user
  /*  public void GenerateID() {

       try {
            Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select MAX(userID) from sales");
           rs.next();

    /       rs.getString("MAX(userID)");

            if (rs.getString("MAX(userID)") == null) {
               userIDLabel.setText("CCS-0001");

            } else {
    /          long id = Long.parseLong(rs.getString("MAX(userID)").substring(2, rs.getString("MAX(userID)").length()));
                id++;
              userIDLabel.setText("CCS-" + String.format("%03", id));
           }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }

    } */
     public void autoID()
     {
        try {
            DatabaseConnection connection = new DatabaseConnection();
            con = connection.getConnection();
            String query = "select max(user_ID) from user_info";

            st = con.createStatement();
            rs = st.executeQuery(query);
            rs.next();

            rs.getString("max(user_ID)");

            if(rs.getString("max(user_ID)")==null){
                userIDLabel.setText("CS001");
            }else{
                Long id = Long.parseLong(rs.getString("max(user_ID)").substring(2, rs.getString("max(user_ID)").length()));
                id++;
                userIDLabel.setText("CS" + String.format("%03d", id));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InternalFrameAddUser.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAddRec = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtlastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        userIDLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnCalculateAge = new javax.swing.JButton();
        textAge = new javax.swing.JTextField();
        birthDate = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(1070, 620));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1060, 620));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(61, 86, 178));
        jLabel1.setText("Add New User");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        btnAddRec.setBackground(new java.awt.Color(0, 166, 89));
        btnAddRec.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAddRec.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/3336950_download_save_icon.png"))); // NOI18N
        btnAddRec.setText("Save");
        btnAddRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 120, 50));

        btnBack.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        btnBack.setText("X");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 50, 30));

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
        jPanel2.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 120, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 790, 2));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Birthdate:");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel6.add(txtlastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 220, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("First Name");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));
        jPanel6.add(txtfirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 220, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Username");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));
        jPanel6.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 220, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Last Name");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("*from date of Birth");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Role:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));

        comboRole.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Admin", "Secretary" }));
        jPanel6.add(comboRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 220, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Address:");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        jPanel6.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 840, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Age");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Contact Number:");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));
        jPanel6.add(txtContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 220, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("User ID:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        userIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userIDLabel.setForeground(new java.awt.Color(0, 51, 204));
        userIDLabel.setText("CS001");
        jPanel6.add(userIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Assign Password:");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txtPassword.setText("jPasswordField1");
        jPanel6.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 450, 40));

        btnCalculateAge.setText("Get Age");
        btnCalculateAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateAgeActionPerformed(evt);
            }
        });
        jPanel6.add(btnCalculateAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 80, 30));

        textAge.setEditable(false);
        textAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textAge.setEnabled(false);
        jPanel6.add(textAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 40, 30));

        birthDate.setDateFormatString("dd/MM/yyyy");
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
        jPanel6.add(birthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 230, 30));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 970, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecActionPerformed
        Connection con;

        DatabaseConnection connection = new DatabaseConnection();
        con = connection.getConnection();
        String query = "insert into user_info(user_id, last_name, first_name, username, birth_date, age, contact_number, role, address, password) values (?,?,?,?,?,?,?,?,?,?)";
        int msg = JOptionPane.showConfirmDialog(this, "Save the record?");

        if (msg == JOptionPane.YES_OPTION) {
            try {
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, userIDLabel.getText());
                pstmt.setString(2, txtlastName.getText());
                pstmt.setString(3, txtfirstName.getText());
                pstmt.setString(4, txtUserName.getText());
                // date
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                String d = sdf.format(birthDate.getDate());
                pstmt.setString(5, d);
                // date
                pstmt.setString(6, textAge.getText());
                pstmt.setString(7, txtContactNo.getText());
                pstmt.setString(8, comboRole.getSelectedItem().toString());
                pstmt.setString(9, txtAddress.getText());
                pstmt.setString(10, txtPassword.getText());

                int success = pstmt.executeUpdate();

                if (success == 1) {
                    JOptionPane.showMessageDialog(this, "Record Saved!");

//                     Clearing the textfields after saving the record
                    txtlastName.setText("");
                    txtfirstName.setText("");
                    birthDate.setCalendar(null);
                    txtUserName.setText("");
                    textAge.setText("");
                    txtContactNo.setText("");
                    txtAddress.setText("");
                    txtPassword.setText("");

                    autoID();
                } else {
                    JOptionPane.showMessageDialog(this, "Record failed to save");
                }

            } catch (SQLException ex) {
                Logger.getLogger(InternalFramePatientRec.class.getName()).log(Level.SEVERE, null, ex);

                // closing the connection
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
    }//GEN-LAST:event_btnAddRecActionPerformed

    private void btnCalculateAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateAgeActionPerformed
        // Takes the string value of the jDateChooser
        String dateofBirth = ((JTextField) birthDate.getDateEditor().getUiComponent()).getText();

        //Splits the date into an array
        String dob[] = dateofBirth.split("/");

        // Elements in the declared array
        int day = Integer.parseInt(dob[0]);
        int month = Integer.parseInt(dob[1]);
        int year = Integer.parseInt(dob[2]);

        // Storing the localdates
        LocalDate selectedDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        // Validating to rewrite textfield if not empty
        if (textAge.getText() != "") {
            textAge.setText("");
            //Outputting the date
            int ResultYear = Period.between(selectedDate, currentDate).getYears();
            textAge.setText("" + ResultYear);
        } else if (textAge.getText() == "") {
            textAge.setText("");
        }
    }//GEN-LAST:event_btnCalculateAgeActionPerformed

    private void birthDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_birthDateAncestorAdded

    }//GEN-LAST:event_birthDateAncestorAdded

    private void birthDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birthDateMouseClicked

    }//GEN-LAST:event_birthDateMouseClicked

    private void birthDateInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_birthDateInputMethodTextChanged

    }//GEN-LAST:event_birthDateInputMethodTextChanged

    private void birthDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_birthDatePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_birthDatePropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser birthDate;
    private javax.swing.JButton btnAddRec;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalculateAge;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField textAge;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtfirstName;
    private javax.swing.JTextField txtlastName;
    private javax.swing.JLabel userIDLabel;
    // End of variables declaration//GEN-END:variables
}
