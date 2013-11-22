/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spcollege.titanbank.bll;


public class Login {
    
   private String username;
   private String password;
   
   public Login(String username, String password) {
       this.username = username;
       this.password = password;
   }

    public void setUsername(String username) {
        username = username;
    }
    
    public void setPassword(String password) {
        password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void validate() {
        if(password.equals("admin") && (username.equals("admin"))) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Wrong username or password");
        }
    }
 
}
