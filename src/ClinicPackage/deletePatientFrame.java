/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicPackage;

/**
 *
 * @author andre
 */
public class deletePatientFrame extends javax.swing.JFrame {

    /**
     * Creates new form deletePatientFrame
     */
    public deletePatientFrame() {
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

        jPanel13 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        textLastName3 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        textFirstName3 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        textPhoneNo3 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        textAddress3 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel37 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        textAge3 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        textAssessment3 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();
        btnSearch3 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel13.setBackground(new java.awt.Color(224, 93, 93));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel31.setText("Delete Patient Record");
        jPanel13.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel14.setBackground(new java.awt.Color(255, 179, 68));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 740, 10));

        jLabel32.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(61, 86, 178));
        jLabel32.setText("Last Name");
        jPanel13.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel13.add(textLastName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 210, 30));

        jLabel33.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(61, 86, 178));
        jLabel33.setText("First Name");
        jPanel13.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel13.add(textFirstName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 210, 30));

        jLabel34.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(61, 86, 178));
        jLabel34.setText("Phone Number");
        jPanel13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));
        jPanel13.add(textPhoneNo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 210, 30));

        jLabel35.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(61, 86, 178));
        jLabel35.setText("Address");
        jPanel13.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, 20));
        jPanel13.add(textAddress3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 290, 30));

        jLabel36.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(61, 86, 178));
        jLabel36.setText("Date of Birth");
        jPanel13.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, 20));
        jPanel13.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 220, 30));

        jLabel37.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(61, 86, 178));
        jLabel37.setText("Sex");
        jPanel13.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, 30));

        jComboBox4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel13.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 90, 30));

        jLabel38.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(61, 86, 178));
        jLabel38.setText("Age");
        jPanel13.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, 30));
        jPanel13.add(textAge3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 40, 30));

        jLabel39.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(61, 86, 178));
        jLabel39.setText("Medical Assessment:");
        jPanel13.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        textAssessment3.setColumns(20);
        textAssessment3.setRows(5);
        jScrollPane7.setViewportView(textAssessment3);

        jPanel13.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 720, 140));
        jPanel13.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 170, 30));

        btnSearch3.setText("Search");
        jPanel13.add(btnSearch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, -1, 30));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable4);

        jPanel13.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 500, 360));

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 60, 30));

        jButton3.setText("Delete");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 100, 40));

        jButton5.setText("Clear");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletePatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch3;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField textAddress3;
    private javax.swing.JTextField textAge3;
    private javax.swing.JTextArea textAssessment3;
    private javax.swing.JTextField textFirstName3;
    private javax.swing.JTextField textLastName3;
    private javax.swing.JTextField textPhoneNo3;
    // End of variables declaration//GEN-END:variables
}
