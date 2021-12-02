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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinicdb", "root","");
            System.out.println("Database Connected");
            // Statement stmt = connect.createStatement();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public Connection getConnection() {
        return con;
    }

}
