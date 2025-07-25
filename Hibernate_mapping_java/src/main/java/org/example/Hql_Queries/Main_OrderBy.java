package org.example.Hql_Queries;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main_OrderBy {
    public static void main(String[] args) {
        SessionFactory sf= new Configuration().configure().buildSessionFactory();
        Session s= sf.openSession();

        List<Peaple> peapleList=s.createQuery("From Peaple p order by p.id desc").list();
        for (Peaple p : peapleList){
            System.out.println("id="+p.getId());
            System.out.println("name="+p.getName());
            System.out.println("city="+p.getCity());
        }
        s.beginTransaction();
        s.getTransaction().commit();

        System.out.println("data saved successfully");
    }
}
