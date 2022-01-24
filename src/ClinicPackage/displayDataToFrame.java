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
public class displayDataToFrame extends javax.swing.JFrame {

    /**
     * Creates new form displayDataToFrame
     */
    String id, lastName, firstName, gender, birthDate, age, PhoneNo, address, motherLastName, motherFirstName, motherAge, motherPhoneNo, fatherLastName, fatherFirstName, fatherAge, fatherPhoneNo, remarks, prescription, dateAdded;

    public void GetInfo(String id, String lastName, String firstName, String gender, String birthDate, String age, String PhoneNo, String address, String motherLastName, String motherFirstName, String motherAge, String motherPhoneNo, String fatherLastName, String fatherFirstName, String fatherAge, String fatherPhoneNo, String remarks, String prescription, String dateAdded) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.age = age;
        this.PhoneNo = PhoneNo;
        this.address = address;
        this.motherLastName = motherLastName;
        this.motherFirstName = motherFirstName;
        this.motherAge = motherAge;
        this.motherPhoneNo = motherPhoneNo;
        this.fatherLastName = fatherLastName;
        this.fatherFirstName = fatherFirstName;
        this.fatherAge = fatherAge;
        this.fatherPhoneNo = fatherPhoneNo;
        this.remarks = remarks;
        this.prescription = prescription;
        this.dateAdded = dateAdded;
    }

    public displayDataToFrame() {
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
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblFatherAge = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblBirthDate = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblMotherFirstName = new javax.swing.JLabel();
        lblMotherLastName = new javax.swing.JLabel();
        lblMotherPhoneNumber = new javax.swing.JLabel();
        lblMotherAge = new javax.swing.JLabel();
        lblFatherFirstName = new javax.swing.JLabel();
        lblFatherLastName = new javax.swing.JLabel();
        lblFatherPhoneNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prescriptionTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();
        lblDateAdded = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        rSButtonIconD1 = new rojerusan.RSButtonIconD();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 133, 187), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(38, 133, 187));
        jLabel31.setText("PATIENT RECORD");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(38, 133, 187));
        jLabel22.setText("Patient ID:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(38, 133, 187));
        jLabel3.setText(" Last Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(38, 133, 187));
        jLabel4.setText("First Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 100, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(38, 133, 187));
        jLabel11.setText("Gender:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(38, 133, 187));
        jLabel7.setText("Date of Birth:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(38, 133, 187));
        jLabel10.setText("Age:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 133, 187));
        jLabel5.setText("Address:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(38, 133, 187));
        jLabel9.setText("Phone Number:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 140, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(38, 133, 187));
        jLabel8.setText("Remarks:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(38, 133, 187));
        jLabel6.setText("Prescription:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(38, 133, 187));
        jLabel21.setText("Last Name:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 100, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(38, 133, 187));
        jLabel18.setText("Phone Number:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 140, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(38, 133, 187));
        jLabel12.setText("Last Name:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 100, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(38, 133, 187));
        jLabel16.setText("Phone Number:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(38, 133, 187));
        jLabel19.setText("First Name:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(38, 133, 187));
        jLabel17.setText("Age:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(38, 133, 187));
        jLabel13.setText("First Name:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(38, 133, 187));
        jLabel14.setText("Age:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 40, 30));

        lblFatherAge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFatherAge.setForeground(new java.awt.Color(50, 133, 187));
        lblFatherAge.setText("jLabel1");
        jPanel1.add(lblFatherAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        lblPatientID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPatientID.setForeground(new java.awt.Color(0, 255, 0));
        lblPatientID.setText("jLabel1");
        jPanel1.add(lblPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, 30));

        lblLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(50, 133, 187));
        lblLastName.setText("jLabel1");
        jPanel1.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(50, 133, 187));
        lblFirstName.setText("jLabel1");
        jPanel1.add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(50, 133, 187));
        lblPhoneNumber.setText("jLabel1");
        jPanel1.add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        lblGender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGender.setForeground(new java.awt.Color(50, 133, 187));
        lblGender.setText("jLabel1");
        jPanel1.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        lblBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBirthDate.setForeground(new java.awt.Color(50, 133, 187));
        lblBirthDate.setText("jLabel1");
        jPanel1.add(lblBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        lblAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(50, 133, 187));
        lblAddress.setText("jLabel1");
        jPanel1.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        lblAge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(50, 133, 187));
        lblAge.setText("jLabel1");
        jPanel1.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        lblMotherFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMotherFirstName.setForeground(new java.awt.Color(50, 133, 187));
        lblMotherFirstName.setText("jLabel1");
        jPanel1.add(lblMotherFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        lblMotherLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMotherLastName.setForeground(new java.awt.Color(50, 133, 187));
        lblMotherLastName.setText("jLabel1");
        jPanel1.add(lblMotherLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        lblMotherPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMotherPhoneNumber.setForeground(new java.awt.Color(50, 133, 187));
        lblMotherPhoneNumber.setText("jLabel1");
        jPanel1.add(lblMotherPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        lblMotherAge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMotherAge.setForeground(new java.awt.Color(50, 133, 187));
        lblMotherAge.setText("jLabel1");
        jPanel1.add(lblMotherAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, 20));

        lblFatherFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFatherFirstName.setForeground(new java.awt.Color(50, 133, 187));
        lblFatherFirstName.setText("jLabel1");
        jPanel1.add(lblFatherFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        lblFatherLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFatherLastName.setForeground(new java.awt.Color(50, 133, 187));
        lblFatherLastName.setText("jLabel1");
        jPanel1.add(lblFatherLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        lblFatherPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFatherPhoneNumber.setForeground(new java.awt.Color(50, 133, 187));
        lblFatherPhoneNumber.setText("jLabel1");
        jPanel1.add(lblFatherPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        prescriptionTextArea.setColumns(20);
        prescriptionTextArea.setRows(5);
        prescriptionTextArea.setEnabled(false);
        jScrollPane1.setViewportView(prescriptionTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 320, 110));

        remarksTextArea.setColumns(20);
        remarksTextArea.setRows(5);
        remarksTextArea.setEnabled(false);
        jScrollPane2.setViewportView(remarksTextArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 330, 110));

        lblDateAdded.setBackground(new java.awt.Color(38, 133, 187));
        lblDateAdded.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDateAdded.setForeground(new java.awt.Color(50, 133, 187));
        lblDateAdded.setText("jLabel1");
        jPanel1.add(lblDateAdded, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, -1));

        jLabel15.setBackground(new java.awt.Color(38, 133, 187));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(38, 133, 187));
        jLabel15.setText("Date Added");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, -1, 30));

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("X");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 50, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(38, 133, 187));
        jLabel20.setText("Father's Information");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(38, 133, 187));
        jLabel23.setText("Mother's Information");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, 30));

        rSButtonIconD1.setBackground(new java.awt.Color(38, 133, 187));
        rSButtonIconD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/print_32px.png"))); // NOI18N
        rSButtonIconD1.setText("Print Data");
        rSButtonIconD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconD1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonIconD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblPatientID.setText(id);
        lblLastName.setText(lastName);
        lblFirstName.setText(firstName);
        lblGender.setText(gender);
        lblBirthDate.setText(birthDate);
        lblAge.setText(age);
        lblPhoneNumber.setText(PhoneNo);
        lblAddress.setText(address);
        lblMotherLastName.setText(motherLastName);
        lblMotherFirstName.setText(motherFirstName);
        lblMotherAge.setText(motherAge);
        lblMotherPhoneNumber.setText(motherPhoneNo);
        lblFatherLastName.setText(fatherLastName);
        lblFatherFirstName.setText(fatherFirstName);
        lblFatherAge.setText(fatherAge);
        lblFatherPhoneNumber.setText(fatherPhoneNo);
        remarksTextArea.setText(remarks);
        prescriptionTextArea.setText(prescription);
        lblDateAdded.setText(dateAdded);
    }//GEN-LAST:event_formWindowOpened

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(displayDataToFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(displayDataToFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(displayDataToFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(displayDataToFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new displayDataToFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblDateAdded;
    private javax.swing.JLabel lblFatherAge;
    private javax.swing.JLabel lblFatherFirstName;
    private javax.swing.JLabel lblFatherLastName;
    private javax.swing.JLabel lblFatherPhoneNumber;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMotherAge;
    private javax.swing.JLabel lblMotherFirstName;
    private javax.swing.JLabel lblMotherLastName;
    private javax.swing.JLabel lblMotherPhoneNumber;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JTextArea prescriptionTextArea;
    private rojerusan.RSButtonIconD rSButtonIconD1;
    private javax.swing.JTextArea remarksTextArea;
    // End of variables declaration//GEN-END:variables
}
