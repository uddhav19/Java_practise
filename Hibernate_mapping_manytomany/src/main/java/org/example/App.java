package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
       Emploee e1 = new Emploee();
       e1.setId(101);
       e1.setEname("sagar");

        Emploee e2 = new Emploee();
        e2.setId(102);
        e2.setEname("aniket");


        List<Emploee> el = new ArrayList<Emploee>();
        el.add(e1);
        el.add(e2);

        Projects p1 = new Projects();
        p1.setPid(1);
        p1.setPname("flipkart");

        Projects p2 =new Projects();
        p2.setPid(2);
        p2.setPname("amazon");

        List<Projects> pl = new ArrayList<Projects>();
        pl.add(p1);
        pl.add(p2);

        e1.setProjectsList(pl);
        e2.setProjectsList(pl);

        p1.setEmploeeList(el);
        p2.setEmploeeList(el);

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s= sf.openSession();
        s.beginTransaction();
        s.save(e1);
        s.save(e2);
        s.save(p1);
        s.save(p2);
        s.getTransaction().commit();


    }
}
