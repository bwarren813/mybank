/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spcollege.titanbank.bll;


/**
 *
 * @author Darryl
 */
public class Account {
    private Customer owner;
    private int acctNumber;
    private double balance;
    private String transaction1, transaction2, transaction3;
    
    
    public Account(Customer name,int userAccount, double iniBalance) {
        owner = name;
        acctNumber = userAccount;
        balance = iniBalance;
    }

    public Account(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
            String trans = "Withdraw" + withdrawAmount;
            updateTransaction(trans);
        }
        else
            System.out.println("Insufficient Funds, you only have $ " + balance);
    }
    
    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
        String trans = "deposit" + depositAmount;
        updateTransaction(trans);
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void updateTransaction(String newTransaction) {
        transaction3 = transaction2;
        transaction2 = transaction1;
        transaction1 = newTransaction;
    }
    
    public void displayTransaction() {
        System.out.println(transaction1 + " " + transaction2 + " " + transaction3);
    }
    
    public void showData() {
        System.out.println("Name -" + owner);
        System.out.println("Account # -" + acctNumber);
        System.out.println("Balance " + balance);
    }

    public void transfer(Account to, double amount) {
        to.deposit(amount);
    }

}
