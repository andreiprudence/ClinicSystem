/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author andre
 */
public class internalFrameDashboard extends javax.swing.JInternalFrame {

    ResultSet rs;
    PreparedStatement pst;
    Statement st;
    Connection con;

    /**
     * Creates new form internalFrameMedicine
     */
    public internalFrameDashboard() {
        initComponents();
        showPieChart();
        showPieChartofMedicine();
        setDatatoCards();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    public void showPieChart() {

        try {
            //create dataset
            DefaultPieDataset barDataset = new DefaultPieDataset();

            DatabaseConnection connection = new DatabaseConnection();
            con = connection.getConnection();
            String query = "select patient_gender ,count(*) as gender_count from patient_info group by patient_gender";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                barDataset.setValue(rs.getString("patient_gender"), new Double(rs.getDouble("gender_count")));
            }

            //create chart
            JFreeChart piechart = ChartFactory.createPieChart("Gender Demographic", barDataset, true, true, false);//explain

            PiePlot piePlot = (PiePlot) piechart.getPlot();


            piePlot.setBackgroundPaint(Color.white);

            //create chartPanel to display chart(graph)
            ChartPanel barChartPanel = new ChartPanel(piechart);
            panelBarChart.removeAll();
            panelBarChart.add(barChartPanel, BorderLayout.CENTER);
            panelBarChart.validate();
        } catch (SQLException ex) {
            Logger.getLogger(internalFrameDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showPieChartofMedicine() {

        try {
            //create dataset
            DefaultPieDataset barDataset = new DefaultPieDataset();

            DatabaseConnection connection = new DatabaseConnection();
            con = connection.getConnection();
          String query = "select medicine_name ,count(*) as medicine_count from medicine_info group by medicine_name";
            //String query = "select medicine_name as 'medicine name' from medicine_info order by quantity + 0";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
               barDataset.setValue(rs.getString("medicine_name"), new Double(rs.getDouble("medicine_count")));
              //   barDataset.setValue(rs.getString("medicine name"), new Double(rs.getDouble("medicine name")));
            }

            //create chart
            JFreeChart piechart = ChartFactory.createPieChart("Medicine Ratio", barDataset, true, true, false);//explain

            PiePlot piePlot = (PiePlot) piechart.getPlot();

            //changing pie chart blocks colors
            piePlot.setSectionPaint("IPhone 5s", new Color(255, 255, 102));
            piePlot.setSectionPaint("SamSung Grand", new Color(102, 255, 102));
            piePlot.setSectionPaint("MotoG", new Color(255, 102, 153));
            piePlot.setSectionPaint("Nokia Lumia", new Color(0, 204, 204));

            piePlot.setBackgroundPaint(Color.white);

            //create chartPanel to display chart(graph)
            ChartPanel barChartPanel = new ChartPanel(piechart);
            panelBarChart1.removeAll();
            panelBarChart1.add(barChartPanel, BorderLayout.CENTER);
            panelBarChart1.validate();
        } catch (SQLException ex) {
            Logger.getLogger(internalFrameDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void setDatatoCards() {
        try {
            long l = System.currentTimeMillis();
            Date todaysdate = new Date();
            String query = "select * from patient_info";

            DatabaseConnection connection = new DatabaseConnection();
            con = connection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            rs.last();
            patientNumber.setText(Integer.toString(rs.getRow()));

            rs = st.executeQuery("select * from user_info");
            rs.last();
            userNumber.setText(Integer.toString(rs.getRow()));

            rs = st.executeQuery("select * from medicine_info");
            rs.last();
            medicineNumber.setText(Integer.toString(rs.getRow()));

        } catch (SQLException ex) {
            Logger.getLogger(internalFrameDashboard.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel2 = new javax.swing.JLabel();
        panelBarChart = new javax.swing.JPanel();
        panelBarChart1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        patientNumber = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        userNumber = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        medicineNumber = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1060, 620));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 89, 89));
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 330, 40));

        panelBarChart.setOpaque(false);
        panelBarChart.setLayout(new java.awt.BorderLayout());
        jPanel1.add(panelBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 380, 230));

        panelBarChart1.setOpaque(false);
        panelBarChart1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(panelBarChart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 380, 220));

        jPanel14.setBackground(new java.awt.Color(255, 179, 68));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 380, 3));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 89, 89), 5));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientNumber.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        patientNumber.setForeground(new java.awt.Color(255, 255, 255));
        patientNumber.setText("10");
        jPanel4.add(patientNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 52));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total No. of Patients");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PATIENTS");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/hospital_bed_100px.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 51, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNumber.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        userNumber.setForeground(new java.awt.Color(255, 255, 255));
        userNumber.setText("10");
        jPanel5.add(userNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 43));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/user_100px.png"))); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("USERS");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total No. of Users");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 50));

        jPanel3.setBackground(new java.awt.Color(0, 204, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        medicineNumber.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        medicineNumber.setForeground(new java.awt.Color(255, 255, 255));
        medicineNumber.setText("10");
        jPanel3.add(medicineNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 56));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MEDICINES");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, 40));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total No. of Medicine");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/pill_bottle_100px.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 90, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 89, 89));
        jLabel1.setText("CURRENT CLINIC STATISTICS");

        jPanel15.setBackground(new java.awt.Color(255, 179, 68));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 500, 600));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DASHBOARD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel medicineNumber;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelBarChart1;
    private javax.swing.JLabel patientNumber;
    private javax.swing.JLabel userNumber;
    // End of variables declaration//GEN-END:variables
}
