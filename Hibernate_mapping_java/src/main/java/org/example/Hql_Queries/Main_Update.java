package org.example.Hql_Queries;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main_Update {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory f= cfg.buildSessionFactory();
        Session s= f.openSession();
        s.beginTransaction();

        String hql = "Update Peaple p SET p.name = :newname, p.city = :newcity where p.id= :id" ;
        Query query = s.createQuery(hql);
        query.setParameter("newname", "dipak");
        query.setParameter("newcity", "mumbai");
        query.setParameter("id", 1);
        query.executeUpdate();
        System.out.println("data updated");

        s.getTransaction().commit(); // Don't forget to commit
        s.close();
        f.close();
    }
}
