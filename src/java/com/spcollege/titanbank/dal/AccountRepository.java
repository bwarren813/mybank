/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spcollege.titanbank.dal;

import com.spcollege.titanbank.bll.Account;
import java.util.ArrayList;

/**
 *
 * @author Darryl
 */
public class AccountRepository {
    
    DataSource source;
    ArrayList<Account> accounts = new ArrayList<Account>();
    private String acctNumber;
    
    public AccountRepository(DataSource source) {
        this.source = source;
    }

    public ArrayList<Account> findByAccountNum(String actNumber) {
        ArrayList<Account> accounts = source.getData2();
        Account find = new Account(acctNumber);
        if (!accounts.contains(find))
            return null;
        
        ArrayList<Account> results = new ArrayList<Account>();
        for (Account b: accounts) {
            if(b.equals(find))
                results.add(b);
        }
        return results;
    }

}
