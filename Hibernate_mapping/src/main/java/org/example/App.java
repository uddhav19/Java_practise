package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
       Emploee e1 = new Emploee();
       e1.setName("uddhav");

       Product p1 = new Product();
       p1.setPname("furniture");
       p1.setMd("23_jun");
       p1.setEd("27_dec");


       e1.setPod(p1);
       p1.setEot(e1);

       SessionFactory sf= new Configuration().configure().buildSessionFactory();
       Session s= sf.openSession();
       s.beginTransaction();
       s.save(p1);
       s.save(e1);
       s.getTransaction().commit();

    }
}
