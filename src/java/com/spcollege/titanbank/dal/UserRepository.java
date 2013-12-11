/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spcollege.titanbank.dal;

import com.spcollege.titanbank.bll.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author student
 */
public class UserRepository {
    
    public static User findByUsername(String username) {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Query q = session.createQuery("from User");
        List<User> listAllUsers = (List<User>) q.list();
        User user;
        try {
            for(User u : listAllUsers) {
                if(u.getUsername().equals(username))
                    return u;
                
            }
            
        } finally {
            session.close();
        }
        return null;
    }
}
