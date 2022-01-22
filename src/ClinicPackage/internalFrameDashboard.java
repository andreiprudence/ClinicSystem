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

            //changing pie chart blocks colors
            piePlot.setSectionPaint("IPhone 5s", new Color(255, 255, 102));
            piePlot.setSectionPaint("SamSung Grand", new Color(102, 255, 102));
            piePlot.setSectionPaint("MotoG", new Color(255, 102, 153));
            piePlot.setSectionPaint("Nokia Lumia", new Color(0, 204, 204));

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
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                barDataset.setValue(rs.getString("medicine_name"), new Double(rs.getDouble("medicine_count")));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        medicineNumber = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        patientNumber = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        userNumber = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelBarChart = new javax.swing.JPanel();
        panelBarChart1 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1060, 620));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 112, 192));
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 330, 40));

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(25, 0, 0, 0, new java.awt.Color(0, 204, 51)));

        medicineNumber.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        medicineNumber.setForeground(new java.awt.Color(255, 255, 255));
        medicineNumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/capsule_60px.png"))); // NOI18N
        medicineNumber.setText("10");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(medicineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(medicineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 210, 150));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(25, 0, 0, 0, new java.awt.Color(204, 204, 255)));

        patientNumber.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        patientNumber.setForeground(new java.awt.Color(255, 255, 255));
        patientNumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/being_sick_60px.png"))); // NOI18N
        patientNumber.setText("10");
        patientNumber.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(patientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(patientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 210, 150));

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(25, 0, 0, 0, new java.awt.Color(255, 51, 51)));

        userNumber.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        userNumber.setForeground(new java.awt.Color(255, 255, 255));
        userNumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClinicPackage/images/users_60px.png"))); // NOI18N
        userNumber.setText("10");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(userNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(userNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 210, 150));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No. of Medicine");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No. of Patients");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No. of System Users");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        panelBarChart.setLayout(new java.awt.BorderLayout());
        jPanel1.add(panelBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 340, 270));

        panelBarChart1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(panelBarChart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 330, 270));

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
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
