/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spcollege.titanbank.dal;

import com.spcollege.titanbank.bll.Account;
import com.spcollege.titanbank.bll.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author student
 */
public class AccountRepository {
    
    public static Account findByAccountNumber() {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction().begin();
        Account account;
        try {
            account = (Account) session.get(Account.class, 1);
        } finally {
            session.close();
        }
        return account;
    }
}
