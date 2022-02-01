/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class LogInPageforClinic extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;

    /**
     * Creates new form LogInPageforClinic
     */
    public LogInPageforClinic() {
        initComponents();
        setIconImage();
        addPlaceHolderStyle(textFieldUsername);
        addPlaceHolderStyle(textFieldPassword);
    }

    //Validating login textfields if empty
//    public boolean validateLogin(){
//        String username = textUsername.getText();
//        String password = textPassword.getText();
//
//       if(username.equals("")){
//           JOptionPane.showMessageDialog(this, "Please enter a username");
//            return false;
//       }
//       if(password.equals("")){
//           JOptionPane.showMessageDialog(this, "Please enter a password");
//            return false;
//       }
//
//       return true;
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void addPlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }

    public void RemovePlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        textFieldUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldPassword = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new rojerusan.RSComboMetro();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAddRec1 = new rojerusan.RSMaterialButtonCircle();
        clearButton1 = new rojerusan.RSMaterialButtonCircle();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldUsername.setBackground(new java.awt.Color(255, 255, 255));
        textFieldUsername.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        textFieldUsername.setForeground(new java.awt.Color(38, 133, 187));
        textFieldUsername.setText("Enter here...");
        textFieldUsername.setBorder(null);
        textFieldUsername.setOpaque(false);
        textFieldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldUsernameFocusLost(evt);
            }
        });
        textFieldUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldUsernameMouseClicked(evt);
            }
        });
        jPanel2.add(textFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 290, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(38, 133, 187));
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        textFieldPassword.setBackground(new java.awt.Color(255, 255, 255));
        textFieldPassword.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        textFieldPassword.setForeground(new java.awt.Color(38, 133, 187));
        textFieldPassword.setText("Password");
        textFieldPassword.setAlignmentX(0.8F);
        textFieldPassword.setBorder(null);
        textFieldPassword.setOpaque(false);
        textFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldPasswordFocusLost(evt);
            }
        });
        textFieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldPasswordMouseClicked(evt);
            }
        });
        jPanel2.add(textFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 290, 40));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 120, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/login panel 330x50 copy[696].png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 350, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/login panel 330x50 copy[696].png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/Hello,  welcome_[691].png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Role", "Secretary", "Admin" }));
        jComboBox1.setAutoscrolls(true);
        jComboBox1.setColorArrow(new java.awt.Color(38, 133, 187));
        jComboBox1.setColorBorde(new java.awt.Color(38, 133, 187));
        jComboBox1.setColorFondo(new java.awt.Color(38, 133, 187));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 300, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/646197_cancel_close_cross_delete_remove_icon.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 40, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(38, 133, 187));
        jLabel9.setText("Username");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        btnAddRec1.setBackground(new java.awt.Color(38, 133, 187));
        btnAddRec1.setBorder(null);
        btnAddRec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/103765_close_user_settings_icon (1).png"))); // NOI18N
        btnAddRec1.setText("login");
        btnAddRec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRec1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddRec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 320, 60));

        clearButton1.setBackground(new java.awt.Color(255, 0, 51));
        clearButton1.setBorder(null);
        clearButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/103765_close_user_settings_icon (1).png"))); // NOI18N
        clearButton1.setText("clear");
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(clearButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 320, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 1070, 730));

        jPanel4.setBackground(new java.awt.Color(153, 153, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/CARES Login_810x730 copy[688].jpg"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 730));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            textFieldPassword.setEchoChar((char) 0);
        } else {
            textFieldPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        int msg = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the application?", "Close app", JOptionPane.WARNING_MESSAGE);

        if (msg == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void textFieldUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldUsernameFocusGained

    }//GEN-LAST:event_textFieldUsernameFocusGained

    private void textFieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPasswordFocusGained

    }//GEN-LAST:event_textFieldPasswordFocusGained

    private void textFieldUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldUsernameFocusLost
        if (textFieldUsername.getText().isEmpty()) {
            textFieldUsername.setText("Enter here...");
        }
    }//GEN-LAST:event_textFieldUsernameFocusLost

    private void textFieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPasswordFocusLost
        if (textFieldPassword.getText().isEmpty()) {
            textFieldPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_textFieldPasswordFocusLost

    private void textFieldUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldUsernameMouseClicked
        textFieldUsername.setText("");
    }//GEN-LAST:event_textFieldUsernameMouseClicked

    private void textFieldPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldPasswordMouseClicked
        textFieldPassword.setText("");
    }//GEN-LAST:event_textFieldPasswordMouseClicked

    private void btnAddRec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRec1ActionPerformed
         String uname = textFieldUsername.getText();
        String password = textFieldPassword.getText();
        String role = jComboBox1.getSelectedItem().toString();
        DatabaseConnection connection = new DatabaseConnection();
        String query = "select * from user_info where username=? and password=?";

        if (uname.equals("") || password.equals("") || role.equals("Select Role")) {
            JOptionPane.showMessageDialog(rootPane, "Please fill in all required fields", "Error", 2);
        } else {
            try {
                con = connection.getConnection();
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, uname);
                pst.setString(2, password);
                rs = pst.executeQuery();

                if (rs.next()) {
                    String s1 = rs.getString("role");
                    String usernameString = rs.getString("username");

                    if (role.equalsIgnoreCase("Admin") && s1.equalsIgnoreCase("admin")) {
                        JOptionPane.showMessageDialog(rootPane, "Welcome, "+usernameString+"!");
                        AdminMainFrame1 adminFrame = new AdminMainFrame1(usernameString);
                        adminFrame.setVisible(true);
                        this.dispose();
                    }
                    if (role.equalsIgnoreCase("Secretary") && s1.equalsIgnoreCase("secretary")) {
                        JOptionPane.showMessageDialog(rootPane, "Welcome, "+usernameString+"!");
                        SecretaryPage secretaryPage = new SecretaryPage(usernameString);
                        secretaryPage.setVisible(true);
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter correct credentials", "Access denied", 2);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Please enter correct credentials");
            }

        }
    }//GEN-LAST:event_btnAddRec1ActionPerformed

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
        int msg = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear fields?");

        if (msg == 0) {
            // textIDNo.setText("");
            textFieldUsername.setText("");
        textFieldPassword.setText("");

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
            java.util.logging.Logger.getLogger(LogInPageforClinic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInPageforClinic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInPageforClinic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInPageforClinic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInPageforClinic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle btnAddRec1;
    private rojerusan.RSMaterialButtonCircle clearButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private rojerusan.RSComboMetro jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField textFieldPassword;
    private javax.swing.JTextField textFieldUsername;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("CARES.png")));
        //To change body of generated methods, choose Tools | Templates.
    }
}
