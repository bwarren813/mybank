/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spcollege.titanbank.bll;


public class Customer {
    
    private String lastName;
    private String firstName;
    
    
    
    public Customer(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
   
    
    public String getLastName() {
        return lastName;
    }
    
    
    
    
    @Override
    public boolean equals(Object o) {
        Customer other = (Customer)o;
        return other.lastName.equals(this.lastName);
    }
}
