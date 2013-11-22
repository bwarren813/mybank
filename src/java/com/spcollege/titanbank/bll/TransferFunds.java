/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spcollege.titanbank.bll;


public class TransferFunds {
    private String transferTo;
    private String transferFrom;
    private long amount;
    private double balance;
    
    public TransferFunds() {
        this.transferTo = transferTo;
        this.transferFrom = transferFrom;
        this.amount = amount;
    }
    
    public void transferFrom(Account from, double amount, Account to) {
        from.transfer(to, amount);
        
    }
    
    public void transferTo(Account to, double amount, Account from) {
        from.withdraw(amount);
        to.deposit(amount);
    }

    public void withdraw(double amou) {
        double amounts;
        amounts = amou;
        balance += amounts;
    }
    
    public void deposit(double amou) {
        double amounts;
        amounts = amou;
        balance += amounts;
    }
}
