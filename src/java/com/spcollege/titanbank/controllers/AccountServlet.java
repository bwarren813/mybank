/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spcollege.titanbank.controllers;


import com.spcollege.titanbank.bll.Account;
import static com.spcollege.titanbank.controllers.LoginServlet.checkUser;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

/**
 *
 * @author Darryl
 */
public class AccountServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Account> accounts = new ArrayList<Account>();
        String url = "/Account.jsp";
        Integer accountID = Integer.parseInt(request.getParameter("accountID"));
        Integer acctNumber = Integer.parseInt(request.getParameter("acctNumber"));
        double checking = Double.parseDouble(request.getParameter("checking"));
        double savings = Double.parseDouble(request.getParameter("savings"));
        
        if(checkAccount(accountID, acctNumber, checking, savings)) {
            RequestDispatcher rs = request.getRequestDispatcher(url);
            rs.forward(request, response);
        } else {
            System.out.println("There are no account please register for a new account");
            RequestDispatcher rs = request.getRequestDispatcher("Register.jsp");
            rs.include(request, response);
        }
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private boolean checkAccount(int accountId, int acctNumber, double checking, double savings) {
        boolean st = false;
        
        
        try {
            // Load the driver
            Class.forName("com.mysql.jdbc.Driver");
            
            // Create the connection with the database
            String sqlStr = "SELECT * from Account where accountId=?, acctNumber=?, checking=? and savings=?";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybank", "root", "welcome1");
            PreparedStatement stmt = conn.prepareStatement(sqlStr);
            stmt.setInt(1, accountId);
            stmt.setInt(2, acctNumber);
            stmt.setDouble(3, checking);
            stmt.setDouble(4, savings);
            ResultSet rs = stmt.executeQuery();
            st = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return st;
    }
}
