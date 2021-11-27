/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicPackage;

import java.awt.Dimension;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
 * @author andre
 */
public class InternalFramePatientRec extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form InternalFramePatientRec
     */
    public InternalFramePatientRec() {
        initComponents();
        InternalFrameBorder();
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
        jPanel3 = new javax.swing.JPanel();
        textIDNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFirstName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textPhoneNo = new javax.swing.JTextField();
        textAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAssessment = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        textLastName1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textLastName2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        textLastName3 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ageTxtField2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        textLastName4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        textLastName5 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        textLastName6 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        ageTxtField1 = new javax.swing.JTextField();
        ageTxtField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1070, 620));

        jPanel2.setBackground(new java.awt.Color(255, 248, 229));
        jPanel2.setPreferredSize(new java.awt.Dimension(1060, 620));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(61, 86, 178));
        jLabel1.setText("Patient Information");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        btnAddRec.setBackground(new java.awt.Color(0, 166, 89));
        btnAddRec.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAddRec.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/3336950_download_save_icon.png"))); // NOI18N
        btnAddRec.setText("Save");
        jPanel2.add(btnAddRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 120, 50));

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
        jPanel2.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 120, 50));

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basic Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(61, 86, 178))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textIDNo.setEditable(false);
        textIDNo.setEnabled(false);
        jPanel3.add(textIDNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 60, 25));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(61, 86, 178));
        jLabel8.setText("Patient Number:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        textLastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(textLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 350, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(61, 86, 178));
        jLabel3.setText("Last Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(61, 86, 178));
        jLabel4.setText("First Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        textFirstName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(textFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 280, 25));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(61, 86, 178));
        jLabel9.setText("Phone Number");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 120, 20));

        textPhoneNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(textPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 500, 25));

        textAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(textAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 730, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(61, 86, 178));
        jLabel5.setText("Address");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(61, 86, 178));
        jLabel12.setText("Occupation");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 330, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(61, 86, 178));
        jLabel7.setText("Date of Birth");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 20));

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jDateChooser1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        jDateChooser1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jDateChooser1InputMethodTextChanged(evt);
            }
        });
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 230, 25));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(61, 86, 178));
        jLabel11.setText("Gender:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 25));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(61, 86, 178));
        jLabel10.setText("Age");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(61, 86, 178));
        jLabel6.setText("Remarks:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        textAssessment.setColumns(20);
        textAssessment.setRows(5);
        textAssessment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(textAssessment);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 850, 70));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Father's Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(61, 86, 178))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(61, 86, 178));
        jLabel13.setText("Last Name");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));
        jPanel4.add(textLastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 120, 30));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(61, 86, 178));
        jLabel14.setText("First Name");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 70, 30));
        jPanel4.add(textLastName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 160, 30));

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(61, 86, 178));
        jLabel15.setText("Phone Number");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));
        jPanel4.add(textLastName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 260, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(61, 86, 178));
        jLabel22.setText("Age");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        ageTxtField2.setEditable(false);
        ageTxtField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ageTxtField2.setEnabled(false);
        jPanel4.add(ageTxtField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 40, 25));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 500, 120));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mother's Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(61, 86, 178))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(61, 86, 178));
        jLabel17.setText("Last Name");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));
        jPanel5.add(textLastName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 120, 30));

        jLabel18.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(61, 86, 178));
        jLabel18.setText("First Name");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 70, 30));
        jPanel5.add(textLastName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 160, 30));

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(61, 86, 178));
        jLabel19.setText("Phone Number");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));
        jPanel5.add(textLastName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 240, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(61, 86, 178));
        jLabel21.setText("Age");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        ageTxtField1.setEditable(false);
        ageTxtField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ageTxtField1.setEnabled(false);
        jPanel5.add(ageTxtField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 40, 25));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 500, 120));

        ageTxtField.setEditable(false);
        ageTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ageTxtField.setEnabled(false);
        jPanel3.add(ageTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 40, 25));

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 80, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1030, 500));

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
        int msg = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all the records?");

        if (msg == 0) {
            textIDNo.setText("");
            textLastName.setText("");
            textFirstName.setText("");
            textAddress.setText("");
            textAssessment.setText("");
            jDateChooser1.setCalendar(null);
            textPhoneNo.setText("");
            ageTxtField.setText("");
        }

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked


    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Takes the string value of the jDateChooser
        String dateofBirth = ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText();

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
        if (ageTxtField.getText() != "") {
            ageTxtField.setText("");
            //Outputting the date
            int ResultYear = Period.between(selectedDate, currentDate).getYears();
            ageTxtField.setText("" + ResultYear);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDateChooser1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jDateChooser1AncestorAdded

    }//GEN-LAST:event_jDateChooser1AncestorAdded

    private void jDateChooser1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jDateChooser1InputMethodTextChanged

    }//GEN-LAST:event_jDateChooser1InputMethodTextChanged

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JTextField ageTxtField1;
    private javax.swing.JTextField ageTxtField2;
    private javax.swing.JButton btnAddRec;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextArea textAssessment;
    private javax.swing.JTextField textFirstName;
    private javax.swing.JTextField textIDNo;
    private javax.swing.JTextField textLastName;
    private javax.swing.JTextField textLastName1;
    private javax.swing.JTextField textLastName2;
    private javax.swing.JTextField textLastName3;
    private javax.swing.JTextField textLastName4;
    private javax.swing.JTextField textLastName5;
    private javax.swing.JTextField textLastName6;
    private javax.swing.JTextField textPhoneNo;
    // End of variables declaration//GEN-END:variables
}
