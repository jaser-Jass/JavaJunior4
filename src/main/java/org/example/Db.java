package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Db {
    public static void con() {
        Connector connector = new Connector();
        Session session = connector.getSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

           
            Magic magic = new Magic("Magic Arrow", 10, 0, 5);
            Magic magic1 = new Magic("Fireball", 30, 5, 10);
            Magic magic2 = new Magic("Ice Spike", 25, 4, 12);
            Magic magic3 = new Magic("Stone Skin", 50, 6, 15);

           
            session.save(magic);
            session.save(magic1);
            session.save(magic2);
            session.save(magic3);

            transaction.commit(); 
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); 
            }
            e.printStackTrace();
        } finally {
            session.close(); 
            connector.close();
        }
    }
}

