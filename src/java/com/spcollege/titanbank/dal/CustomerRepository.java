/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spcollege.titanbank.dal;

import com.spcollege.titanbank.bll.*;
import java.util.*;

public class CustomerRepository {
    DataSource source;
    ArrayList<Customer> customers = new ArrayList<Customer>();
    
    public CustomerRepository(DataSource source) {
        this.source = source;
    }

    ArrayList<Customer> findByLastName(String lastName, String firstName) {
        ArrayList<Customer> customers = source.getData();
        Customer find = new Customer(lastName, firstName);
        if (!customers.contains(find))
            return null;
        
        ArrayList<Customer> results = new ArrayList<Customer>();
        for (Customer c: customers) {
            if(c.equals(find))
                results.add(c);
        }
        return results;
    }
}
