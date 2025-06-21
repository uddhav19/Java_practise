package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Student s = new Student();
        s.setId(102);
        s.setName("uddhav");
        s.setCity("nashik");
        s.setDesignation("manager");
        s.setDate(new Date());

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session u= sf.openSession();

        u.beginTransaction();
        u.save(s);

        u.getTransaction().commit();



    }
}
