/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spcollege.titanbank.dal;


import com.spcollege.titanbank.bll.Customer;
import com.spcollege.titanbank.bll.Account;
import java.util.ArrayList;

/**
 *
 * @author Darryl
 */
public class FakeDataSource implements DataSource {
    
    private ArrayList<Customer> customerList;
    private ArrayList<Account> accountList;
    private String lastName;
 
    
    public FakeDataSource() {
        customerList = new ArrayList<Customer>();
        accountList = new ArrayList<Account>();
    }

    @Override
    public ArrayList<Customer> getData() {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer brandon = new Customer("Warren", lastName);
        Customer roberta = new Customer("Warren", lastName);
        Customer amber = new Customer("Anderson", lastName);
        Customer mark = new Customer("Edwards", lastName);
        customerList.add(brandon);
        customerList.add(roberta);
        customerList.add(amber);
        customerList.add(mark);
        
        return customerList;
    }
    
    @Override
    public void add(Customer c) {
        customerList.add(c);
    }
    

    @Override
    public ArrayList<Account> getData2() {
        ArrayList<Account> accounts = new ArrayList<Account>();
        Account darryl = new Account("12345");
        Account shawn = new Account("678910");
        Account lexis = new Account("1112131415");
        accountList.add(darryl);
        accountList.add(lexis);
        accountList.add(shawn);
        return accountList;
    }

    @Override
    public void add(Account b) {
        accountList.add(b);
    }
    
}
