/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spcollege.titanbank.dal;

import java.util.*;
import com.spcollege.titanbank.bll.*;

public interface DataSource {
    ArrayList<Customer> getData();
    ArrayList<Account> getData2();
    void add(Customer c);
    void add(Account b);
}
