package org.example.Hql_Queries;

import org.example.Crud_operation.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory f= cfg.buildSessionFactory();
        Session session  =f.openSession();



       String hql = "From Peaple";

        List<Peaple> p = session.createQuery(hql,Peaple.class).list();

        for (Peaple s: p){
            System.out.println(s.toString());
        }

        Transaction t= session.beginTransaction();


        t.commit();
        session.close();
        System.out.println("data saved successfully");

    }
}
