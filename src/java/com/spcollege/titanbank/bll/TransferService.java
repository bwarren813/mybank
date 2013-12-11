/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spcollege.titanbank.bll;


public class TransferService {
    private Account transferTo;
    private Account transferFrom;
    private long amount;
    private double balance;

    public Account getTransferTo() {
        return transferTo;
    }

    public void setTransferTo() {
        this.transferTo = transferTo;
    }

    public Account getTransferFrom() {
        return transferFrom;
    }

    public void setTransferFrom() {
        this.transferFrom = transferFrom;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
