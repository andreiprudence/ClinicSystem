/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicPackage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import java.util.Timer;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.Timer;

/**
 *
 * @author andre
 */
public class SecretaryPage extends javax.swing.JFrame {

    /**
     * Creates new form SecretaryPage
     */
    //ASSIGNING A COLOR FOR THE BUTTONS(PANELS)
    Color mouseExitedColor = new Color(255, 255, 255);
    Color mouseEnteredColor = new Color(187, 207, 215);

    public SecretaryPage() {
        initComponents();
        showDate();
        showTime();
        imageResize();

    }

    // Method for resizable image for icon
    void imageResize() {
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("84-512.png")));

        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(lblSecretary.getWidth(), lblSecretary.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);

        lblSecretary.setIcon(i);
    }

    //THIS METHOD SHOWS THE SYSTEM TIME
    void showTime() {
        new javax.swing.Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                lblTime.setText(s.format(d));
            }

        }
        ).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        upperPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        lblSecretary = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        medButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ptntRecButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        appointBtton = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        feesButton = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        regPtntButton = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        labelWelcome = new javax.swing.JLabel();
        userLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(734, 532));

        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upperPanel.setBackground(new java.awt.Color(245, 198, 165));
        upperPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/CARES_Logo - Copy (2).png"))); // NOI18N
        upperPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 430, 100));

        lblDate.setBackground(new java.awt.Color(61, 86, 178));
        lblDate.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(61, 86, 178));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upperPanel.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 240, 40));

        lblTime.setBackground(new java.awt.Color(255, 255, 255));
        lblTime.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(61, 86, 178));
        lblTime.setText(" ");
        upperPanel.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 50, 150, 40));

        jLabel17.setBackground(new java.awt.Color(255, 0, 0));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/closeicon.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        upperPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 50, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/CARES System Header BG.jpg"))); // NOI18N
        upperPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 100));

        MainPanel.add(upperPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 100));

        sidePanel.setBackground(new java.awt.Color(254, 241, 230));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sidePanel.add(lblSecretary, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 60));

        userLabel.setFont(new java.awt.Font("Yu Gothic Medium", 0, 10)); // NOI18N
        userLabel.setForeground(new java.awt.Color(51, 255, 51));
        userLabel.setText("logged in as");
        sidePanel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 70, 20));

        btnExit.setBackground(new java.awt.Color(254, 241, 230));
        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(25, 128, 251));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/618316_arrow_exit_logout_sign out_icon.png"))); // NOI18N
        btnExit.setText("Sign-Out");
        btnExit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        sidePanel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 220, 50));

        medButton.setBackground(new java.awt.Color(255, 255, 255));
        medButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        medButton.setForeground(new java.awt.Color(255, 255, 255));
        medButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        medButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                medButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                medButtonMouseExited(evt);
            }
        });
        medButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 128, 251));
        jLabel4.setText("Medicine");
        medButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/6087975_capsule_drug_medicine_pill_tablet_icon.png"))); // NOI18N
        medButton.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel16.setBackground(new java.awt.Color(187, 207, 215));
        jLabel16.setForeground(new java.awt.Color(245, 198, 165));
        medButton.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 10, 50));

        sidePanel.add(medButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 220, 50));

        ptntRecButton.setBackground(new java.awt.Color(255, 255, 255));
        ptntRecButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ptntRecButton.setForeground(new java.awt.Color(255, 255, 255));
        ptntRecButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ptntRecButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ptntRecButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ptntRecButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ptntRecButtonMouseExited(evt);
            }
        });
        ptntRecButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 128, 251));
        jLabel6.setText("Register Patient");
        ptntRecButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/314789_add_folder_icon.png"))); // NOI18N
        ptntRecButton.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jLabel3.setBackground(new java.awt.Color(187, 207, 215));
        jLabel3.setForeground(new java.awt.Color(245, 198, 165));
        ptntRecButton.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 10, 50));

        sidePanel.add(ptntRecButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 220, 50));

        appointBtton.setBackground(new java.awt.Color(255, 255, 255));
        appointBtton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        appointBtton.setForeground(new java.awt.Color(255, 255, 255));
        appointBtton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appointBtton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointBttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appointBttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                appointBttonMouseExited(evt);
            }
        });
        appointBtton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(25, 128, 251));
        jLabel9.setText("Appointments");
        appointBtton.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/5505479_augmented_calendar_mountain_reality_schedule_icon.png"))); // NOI18N
        appointBtton.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jLabel14.setBackground(new java.awt.Color(187, 207, 215));
        jLabel14.setForeground(new java.awt.Color(245, 198, 165));
        appointBtton.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 10, 50));

        sidePanel.add(appointBtton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 220, 50));

        feesButton.setBackground(new java.awt.Color(255, 255, 255));
        feesButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        feesButton.setForeground(new java.awt.Color(255, 255, 255));
        feesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        feesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                feesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                feesButtonMouseExited(evt);
            }
        });
        feesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(25, 128, 251));
        jLabel8.setText("Fees");
        feesButton.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/2305592_card_credit_method_pay_payment_icon.png"))); // NOI18N
        feesButton.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        jLabel15.setBackground(new java.awt.Color(187, 207, 215));
        jLabel15.setForeground(new java.awt.Color(245, 198, 165));
        feesButton.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 10, 50));

        sidePanel.add(feesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 220, 50));

        regPtntButton.setBackground(new java.awt.Color(255, 255, 255));
        regPtntButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        regPtntButton.setForeground(new java.awt.Color(255, 255, 255));
        regPtntButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regPtntButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regPtntButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regPtntButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regPtntButtonMouseExited(evt);
            }
        });
        regPtntButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(25, 128, 251));
        jLabel11.setText("Patient Records");
        regPtntButton.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/314416_list_notebook_icon.png"))); // NOI18N
        regPtntButton.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jLabel13.setBackground(new java.awt.Color(187, 207, 215));
        jLabel13.setForeground(new java.awt.Color(245, 198, 165));
        regPtntButton.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 10, 50));

        sidePanel.add(regPtntButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 220, 50));

        btnDashboard.setBackground(new java.awt.Color(255, 255, 255));
        btnDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardMouseExited(evt);
            }
        });
        btnDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(25, 128, 251));
        jLabel20.setText("Dashboard");
        btnDashboard.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 40));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/combo_chart_32px.png"))); // NOI18N
        btnDashboard.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        jLabel22.setBackground(new java.awt.Color(187, 207, 215));
        jLabel22.setForeground(new java.awt.Color(245, 198, 165));
        btnDashboard.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 10, 60));

        sidePanel.add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 220, -1));

        labelUser.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        labelUser.setForeground(new java.awt.Color(21, 126, 251));
        labelUser.setText("andrei");
        sidePanel.add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 60, 20));

        labelWelcome.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(21, 126, 251));
        labelWelcome.setText("Welcome,");
        sidePanel.add(labelWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 70, 20));

        userLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        userLabel1.setForeground(new java.awt.Color(21, 126, 251));
        userLabel1.setText("Secretary");
        sidePanel.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 70, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/CARES System Sidebar BG.jpg"))); // NOI18N
        sidePanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 620));

        MainPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 620));

        jDesktopPane1.setBackground(new java.awt.Color(0, 78, 103));
        jDesktopPane1.setForeground(new java.awt.Color(255, 248, 229));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        MainPanel.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 1060, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //THIS METHOD SHOWS THE SYSTEM DATE
    public void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("EEEE, dd MMM, yyyy");
        lblDate.setText(s.format(d));
    }

    private void display() {
        JFrame f = new JFrame("NewJavaGUI");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(this);
        f.pack();
        f.setExtendedState(f.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        f.setVisible(true);
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int msg = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out of account?");
        if (msg == 0) {
            new LogInPageforClinic().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void medButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medButtonMouseEntered
        medButton.setBackground(mouseEnteredColor);
    }//GEN-LAST:event_medButtonMouseEntered

    private void medButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medButtonMouseExited
        medButton.setBackground(mouseExitedColor);
    }//GEN-LAST:event_medButtonMouseExited

    private void medButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medButtonMouseClicked
        bar(jLabel16);
        internalFrameMedicine iFrameMedicine = new internalFrameMedicine();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(iFrameMedicine).setVisible(true);
        //  new MedicineFrame().setVisible(true);
    }//GEN-LAST:event_medButtonMouseClicked

    private void ptntRecButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptntRecButtonMouseClicked
        bar(jLabel3);
        InternalFramePatientRec interFrame = new InternalFramePatientRec();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(interFrame).setVisible(true);
    }//GEN-LAST:event_ptntRecButtonMouseClicked

    private void ptntRecButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptntRecButtonMouseEntered
        ptntRecButton.setBackground(mouseEnteredColor);
    }//GEN-LAST:event_ptntRecButtonMouseEntered

    private void ptntRecButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptntRecButtonMouseExited
        ptntRecButton.setBackground(mouseExitedColor);
    }//GEN-LAST:event_ptntRecButtonMouseExited

    private void feesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesButtonMouseClicked
        bar(jLabel15);
        internalFrameFees iFrameFees = new internalFrameFees();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(iFrameFees).setVisible(true);
    }//GEN-LAST:event_feesButtonMouseClicked

    private void feesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesButtonMouseEntered
        feesButton.setBackground(mouseEnteredColor);
    }//GEN-LAST:event_feesButtonMouseEntered

    private void feesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesButtonMouseExited
        feesButton.setBackground(mouseExitedColor);
    }//GEN-LAST:event_feesButtonMouseExited

    private void appointBttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointBttonMouseClicked
        bar(jLabel14);
        internalFrameAppoint iFrameAppoint = new internalFrameAppoint();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(iFrameAppoint).setVisible(true);
    }//GEN-LAST:event_appointBttonMouseClicked

    private void appointBttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointBttonMouseEntered
        appointBtton.setBackground(mouseEnteredColor);
    }//GEN-LAST:event_appointBttonMouseEntered

    private void appointBttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointBttonMouseExited
        appointBtton.setBackground(mouseExitedColor);
    }//GEN-LAST:event_appointBttonMouseExited

    private void regPtntButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regPtntButtonMouseClicked
        bar(jLabel13);
        PatientRecordsInternalFrame patientRecordinterFrame = new PatientRecordsInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(patientRecordinterFrame).setVisible(true);
    }//GEN-LAST:event_regPtntButtonMouseClicked

    private void regPtntButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regPtntButtonMouseEntered
        regPtntButton.setBackground(mouseEnteredColor);
    }//GEN-LAST:event_regPtntButtonMouseEntered

    private void regPtntButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regPtntButtonMouseExited
        regPtntButton.setBackground(mouseExitedColor);
    }//GEN-LAST:event_regPtntButtonMouseExited

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // Terminate JVM
        int msg = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the application?");

        if (msg == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered

        btnExit.setOpaque(true);
        btnExit.setContentAreaFilled(true);
        btnExit.setBorderPainted(true);
        //   btnExit.setBackground(new Color(252,26,26));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setOpaque(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setBorderPainted(false);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        bar(jLabel22);
        internalFrameDashboard interFrame = new internalFrameDashboard();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(interFrame).setVisible(true);
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseEntered
       btnDashboard.setBackground(mouseEnteredColor);
    }//GEN-LAST:event_btnDashboardMouseEntered

    private void btnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseExited
       btnDashboard.setBackground(mouseExitedColor);
    }//GEN-LAST:event_btnDashboardMouseExited

    /**
     * @param args the command line arguments
     */
    //GUI Bar to display current part of the page
    public void bar(JLabel lab) {
        jLabel22.setOpaque(false);
        jLabel3.setOpaque(false);
        jLabel13.setOpaque(false);
        jLabel14.setOpaque(false);
        jLabel15.setOpaque(false);
        jLabel16.setOpaque(false);
        lab.setOpaque(true);
        sidePanel.repaint();
    }

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
            java.util.logging.Logger.getLogger(SecretaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new SecretaryPage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel appointBtton;
    private javax.swing.JPanel btnDashboard;
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel feesButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel labelUser;
    private javax.swing.JLabel labelWelcome;
    public static javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblSecretary;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel medButton;
    private javax.swing.JPanel ptntRecButton;
    private javax.swing.JPanel regPtntButton;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel upperPanel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    // End of variables declaration//GEN-END:variables
}
