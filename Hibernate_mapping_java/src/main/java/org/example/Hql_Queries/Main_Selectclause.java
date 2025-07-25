package org.example.Hql_Queries;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main_Selectclause {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory f= cfg.buildSessionFactory();
        Session session = f.openSession();

        List<String> names = session.createQuery("select p.name From Peaple p").list();
        for (String s:names){
            System.out.println("name=" +s);
        }
        Transaction t =session.beginTransaction();
        t.commit();
        session.close();
        System.out.println("data saved successfully");
    }
}
