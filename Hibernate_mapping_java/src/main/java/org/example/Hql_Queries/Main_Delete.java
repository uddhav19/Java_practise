package org.example.Hql_Queries;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main_Delete {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory f= cfg.buildSessionFactory();
        Session s= f.openSession();
        s.beginTransaction();

        Query query = s.createQuery("Delete Peaple p where p.id= :id ");
        query.setParameter("id",3);
        query.executeUpdate();

        s.getTransaction().commit(); // Don't forget to commit
        s.close();


    }
}
