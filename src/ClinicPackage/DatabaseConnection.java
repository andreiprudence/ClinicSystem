/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicPackage;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author andre
 */
// Class for database connection
public class DatabaseConnection {

    Connection con;

    public DatabaseConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Getting the connection
            con = DriverManager.getConnection("jdbc:mysql://localhost/clinicdb", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() {
        return con;
    }

}
