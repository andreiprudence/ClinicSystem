/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicPackage;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.MessageFormat;

/**
 *
 * @author andre
 */
public class displayDataToFrameforUserList extends javax.swing.JFrame {

    /**
     * Creates new form displayDataToFrame
     */
    String id, lastName, firstName, userName, birthDate, age, PhoneNo, role, address, password;

    public void GetInfo(String id, String lastName, String firstName, String userName, String birthDate, String age, String PhoneNo, String role, String address) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.userName = userName;
        this.birthDate = birthDate;
        this.age = age;
        this.PhoneNo = PhoneNo;
        this.role = role;
        this.address = address;
      //  this.password = password;
    }

    public displayDataToFrameforUserList() {
        initComponents();
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
        jLabel31 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblUserID = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblBirthDate = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        rSButtonIconD1 = new rojerusan.RSButtonIconD();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 133, 187), 2));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(38, 133, 187));
        jLabel31.setText("USER RECORD");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(38, 133, 187));
        jLabel22.setText("User ID:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(38, 133, 187));
        jLabel3.setText("Role:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(38, 133, 187));
        jLabel4.setText("First Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(38, 133, 187));
        jLabel7.setText("Date of Birth:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 140, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(38, 133, 187));
        jLabel10.setText("Age:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 133, 187));
        jLabel5.setText("Address:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, 40));

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(38, 133, 187));
        jLabel21.setText("Last Name:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(38, 133, 187));
        jLabel16.setText("Phone Number:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 160, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(38, 133, 187));
        jLabel19.setText("Username:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, 30));

        lblUserID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUserID.setForeground(new java.awt.Color(38, 133, 187));
        lblUserID.setText("jLabel1");
        jPanel1.add(lblUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        lblLastName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(38, 133, 187));
        lblLastName.setText("jLabel1");
        jPanel1.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        lblFirstName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(38, 133, 187));
        lblFirstName.setText("jLabel1");
        jPanel1.add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        lblPhoneNumber.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(38, 133, 187));
        lblPhoneNumber.setText("jLabel1");
        jPanel1.add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        lblBirthDate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblBirthDate.setForeground(new java.awt.Color(38, 133, 187));
        lblBirthDate.setText("jLabel1");
        jPanel1.add(lblBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, 20));

        lblAddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(38, 133, 187));
        lblAddress.setText("jLabel1");
        jPanel1.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 400, 40));

        lblAge.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAge.setForeground(new java.awt.Color(38, 133, 187));
        lblAge.setText("jLabel1");
        jPanel1.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, 20));

        lblUserName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(38, 133, 187));
        lblUserName.setText("jLabel1");
        jPanel1.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, 20));

        lblRole.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRole.setForeground(new java.awt.Color(38, 133, 187));
        lblRole.setText("jLabel1");
        jPanel1.add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        rSButtonIconD1.setBackground(new java.awt.Color(38, 133, 187));
        rSButtonIconD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/print_32px.png"))); // NOI18N
        rSButtonIconD1.setText("Print Data");
        rSButtonIconD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconD1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonIconD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 130, -1));

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("X");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblUserID.setText(id);
        lblLastName.setText(lastName);
        lblFirstName.setText(firstName);
        lblUserName.setText(userName);
        lblBirthDate.setText(birthDate);
        lblAge.setText(age);
        lblPhoneNumber.setText(PhoneNo);
        lblAddress.setText(address);
        lblRole.setText(role);
     //   lblPassword.setText(password);

    }//GEN-LAST:event_formWindowOpened

    private void rSButtonIconD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconD1ActionPerformed
       // PRINTS THE JFRAME
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Data");

        job.setPrintable(new Printable() {
            public int print(Graphics pg, PageFormat pf, int pageNum) {
                pf.setOrientation(PageFormat.PORTRAIT);
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D) pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.7, 0.7);

                jPanel1.paint(g2);
//

                return Printable.PAGE_EXISTS;

            }
        });

        boolean ok = job.printDialog();
        if (ok) {
            try {

                job.print();
            } catch (PrinterException ex) {
            }
        }
    }//GEN-LAST:event_rSButtonIconD1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(displayDataToFrameforUserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(displayDataToFrameforUserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(displayDataToFrameforUserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(displayDataToFrameforUserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new displayDataToFrameforUserList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JLabel lblUserName;
    private rojerusan.RSButtonIconD rSButtonIconD1;
    // End of variables declaration//GEN-END:variables
}