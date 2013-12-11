package com.spcollege.titanbank.dal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guestpc
 */
public class ConnectionManager {
    
    private static Connection conn;
    
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String dbName = "mybank";
            String uname = "root";
            String pwd = "welcome1";
            
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = DriverManager.getConnection(url+dbName,uname,pwd);
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        catch(ClassNotFoundException e) {
            System.out.println(e);
        }
        
        return conn;
    }
}
